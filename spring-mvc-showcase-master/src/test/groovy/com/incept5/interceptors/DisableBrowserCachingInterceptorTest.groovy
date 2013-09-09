

def setup() {
    dictionaryService = Mock(DictionaryService)
    taxonomyService = Mock(TaxonomyService)
    analyticsService = Mock(AnalyticsService)

    controller = new HomeController(analyticsService, taxonomyService, dictionaryService)

    HandlerInterceptor interceptor = new DisableBrowserCachingInterceptor()

    mockMvc = MockMvcBuilders
            .standaloneSetup(controller)
            .addInterceptors(interceptor)
            .build();
}

def "Test Get"() {
    when:
    def result = mockMvc.perform(get('/')).andReturn()

    def foo = 1
    then:
    result.response.headerNames.size() == 4
    result.response.getHeader('Cache-Control')
    result.response.getHeader('Pragma')
    result.response.getHeader('Expires')
}