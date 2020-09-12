package com.example.elegant;

public class Bedroom {

    private String Title;
    private String Category ;
    private String Description ;
    private int Thumbnail ;

    public Bedroom() {
    }

    public Bedroom(String title, String categoryBedroom, String description, int thumbnail) {
        Title = title;
        Category = categoryBedroom;
        Description = description;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}