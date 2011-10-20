Build
------------
You can either build with Maven or Gradle
1. First you will need a key for the API: http://fwix.com/account/register and then you need to replace the value in the following file: ```src/main/resources/auth.properties```
2. Maven: mvn install
3. Gradle: gradle build

Run
-----

You can check the integration test in the src/test/java package (FwixClientIntegrationTest)

Work around Spring (if you really need!)
-------------

Or use the client directly. See the class FwixAPIWrapperImpl (note that this example uses Spring), so if you want to use this in your app, you'll need to load the
```fwixContext.xml``` and wire the bean ```fwixAPIWrapper``` (the astute reader will notice that there's no explicit Spring definition for it. it's because we're using "component scanning").
You can work around Spring by creating a new instance of the RestTemplate but it's a bit tricky because of the encoding issue

```
  public Object findByLatLng(String lat, String lng, String apiKey) {
        RestTemplate restTemplate = new RestTemplate(); //not using Spring!
        List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(new MediaType("application", "javascript")));
        list.add(converter);
        restTemplate.setMessageConverters(list);
        PlacesWrapper places = restTemplate.getForObject(serverBaseUrl + "?api_key={apikey}&lat={lat}&lng={lon}", PlacesWrapper.class, apiKey, lat, lng);
        return places;
  }

```
