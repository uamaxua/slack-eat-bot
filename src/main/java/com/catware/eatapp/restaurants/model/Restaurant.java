package com.catware.eatapp.restaurants.model;

import com.google.cloud.firestore.annotation.DocumentId;
import org.springframework.cloud.gcp.data.firestore.Document;

import java.util.List;
import java.util.Objects;

@Document(collectionName = "restaurants")
public class Restaurant {

    @DocumentId
    private String title;
    private String priceLevel;
    private List<String> cuisineTypes;
    private String arrivalTime;
    private double rating;
    private int reviewsCount;
    private String imageUrl;
    private String url;

    public Restaurant() {
    }

    public Restaurant(String title, String priceLevel, List<String> cuisineTypes, String arrivalTime, double rating, int reviewsCount, String imageUrl, String url) {
        this.title = title;
        this.priceLevel = priceLevel;
        this.cuisineTypes = cuisineTypes;
        this.arrivalTime = arrivalTime;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public List<String> getCuisineTypes() {
        return cuisineTypes;
    }

    public void setCuisineTypes(List<String> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Double.compare(that.rating, rating) == 0 &&
                reviewsCount == that.reviewsCount &&
                Objects.equals(title, that.title) &&
                Objects.equals(priceLevel, that.priceLevel) &&
                Objects.equals(cuisineTypes, that.cuisineTypes) &&
                Objects.equals(arrivalTime, that.arrivalTime) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, priceLevel, cuisineTypes, arrivalTime, rating, reviewsCount, imageUrl, url);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "title='" + title + '\'' +
                ", priceLevel='" + priceLevel + '\'' +
                ", cuisineTypes=" + cuisineTypes +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", imageUrl='" + imageUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
