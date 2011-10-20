package com.fwix.api.service;

import com.fwix.api.domain.Place;
import com.fwix.api.domain.PlacesWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author npeeters
 */
@Component("fwixAPIWrapper")
public class FwixAPIWrapperImpl implements FwixAPIWrapper {

    private static final String BASE_URL = "http://geoapi.fwix.com/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public PlacesWrapper findByLatLng(String apiKey, String lat, String lng) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&lat={lat}&lng={lng}", PlacesWrapper.class, apiKey, lat, lng);
    }

    @Override
    public PlacesWrapper findByLatLngAdvanced(String apiKey, String lat, String lng, String userId, String country, String radius, String query, String categories, String sort) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&lat={lat}&lng={lng}&user_id={userId}&country={country}&radius={radius}&query={query}&categories={categories}&sort={sort}",
                PlacesWrapper.class, apiKey, lat, lng, userId, country, radius, query, categories, sort);
    }

    @Override
    public Place findById(String apiKey, String id) {
        return restTemplate.getForObject(BASE_URL + "places/{id}.json?api_key={apiKey}", Place.class, id, apiKey);
    }

    @Override
    public PlacesWrapper findNearAddress(String apiKey, String province, String city, String address) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&province={province}&city={city}&address={address}", PlacesWrapper.class, apiKey, province, city, address);
    }

    @Override
    public PlacesWrapper findNearAddressAdvanced(String apiKey, String province, String city, String address, String userId, String country, String radius, String query, String categories, String sort) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&province={province}&city={city}&address={address}&user_id={userId}&country={country}&radius={radius}&query={query}&categories={categories}&sort={sort}",
                PlacesWrapper.class, apiKey, province, city, address, userId, country, radius, query, categories, sort);
    }

    @Override
    public PlacesWrapper findByZip(String apiKey, String postalCode) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&postal_code={postalCode}", PlacesWrapper.class, apiKey, postalCode);
    }

    @Override
    public PlacesWrapper findByZipAdvanced(String apiKey, String postalCode, String userId, String country, String query, String categories, String sort) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&postal_code={postalCode}&user_id={userId}&country={country}&query={query}&categories={categories}&sort={sort}"
                , PlacesWrapper.class, apiKey, postalCode, userId, country, query, sort, categories);
    }

    @Override
    public PlacesWrapper findByLocality(String apiKey, String province, String city, String locality) {
        return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&province={province}&city={city}&locality={locality}", PlacesWrapper.class, apiKey, province, city, locality);
    }

    @Override
    public PlacesWrapper findByLocalityAdvanced(String apiKey, String province, String city, String user_id, String country, String query, String categories, String sort, String locality) {
           return restTemplate.getForObject(BASE_URL + "places.json?api_key={apiKey}&province={province}&city={city}&user_id={userId}&country={country}&query={query}&categories={categories}&sort={sort}"
                , PlacesWrapper.class, apiKey, province, city, user_id, country, query, categories, sort, locality);
    }

    @SuppressWarnings("unused")
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}