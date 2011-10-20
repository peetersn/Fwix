package com.fwix.api.service;

import com.fwix.api.domain.Place;
import com.fwix.api.domain.PlacesWrapper;

/**
 * @author npeeters
 */
public interface FwixAPIWrapper {


    /**
     * http://geoapi.fwix.com/places/17f5fcd-3312-7a52-f551-d4e8f70dbc8a9.xml?api_key=06191c092036
     */
    Place findById(String apiKey, String placeId);

    /**
     * @param lat
     * @param lng
     * @param apiKey
     * @return
     */
    PlacesWrapper findByLatLng(String apiKey, String lat, String lng);

    PlacesWrapper findByLatLngAdvanced(String lat, String lng, String apiKey, String user_id, String country, String radius, String query, String categories, String sort);

    PlacesWrapper findNearAddress(String api_key, String province, String city, String address);

    PlacesWrapper findNearAddressAdvanced(String api_key, String province, String city, String address, String user_id, String country, String radius, String query, String categories, String sort);

    /**
     * example: example: http://geoapi.fwix.com/places.xml?api_key=06191c092036&country=USA&postal_code=94105&query=museum
     */
    PlacesWrapper findByZip(String api_key, String postal_code);

    PlacesWrapper findByZipAdvanced(String api_key, String postal_code, String user_id, String country, String query, String categories, String sort);

    /**
     * example: http://geoapi.fwix.com/places.xml?api_key=06191c092036&province=NY&city=New+York&locality=SoHo
     */
    PlacesWrapper findByLocality(String api_key, String province, String city, String locality);

    PlacesWrapper findByLocalityAdvanced(String api_key, String province, String city, String user_id, String country, String query, String categories, String sort, String locality);


}
