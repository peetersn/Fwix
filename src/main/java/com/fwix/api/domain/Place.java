package com.fwix.api.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * @author npeeters
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {

    private String uuid;
    private String name;
    private String type;
    private String city;

    @JsonProperty("phone_number")
    private String phoneNumber;
    private String locality;
    private String country;
    private String address;
    private String link;
    @JsonProperty("postal_code")
    private String postalCode;
    private String province;
    private Double lat;
    private Double lng;

    @JsonProperty("open_table_id")
    private String openTableId;

    @JsonProperty("grub_hub_id")
    private String grubHubId;

    @JsonProperty("factual_id")
    private String factual_id;

    @JsonProperty("foursquare_id")
    private String foursquareId;

    private String price;

    private List<Category> categories;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getOpenTableId() {
        return openTableId;
    }

    public void setOpenTableId(String openTableId) {
        this.openTableId = openTableId;
    }

    public String getGrubHubId() {
        return grubHubId;
    }

    public void setGrubHubId(String grubHubId) {
        this.grubHubId = grubHubId;
    }

    public String getFactual_id() {
        return factual_id;
    }

    public void setFactual_id(String factual_id) {
        this.factual_id = factual_id;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }

}
