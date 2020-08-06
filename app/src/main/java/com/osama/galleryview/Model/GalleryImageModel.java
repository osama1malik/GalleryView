package com.osama.galleryview.Model;

public class GalleryImageModel {
    private String imagePath;
    private String imageName;
    private String DateTime;

    public GalleryImageModel() {
    }

    public GalleryImageModel(String imagePath, String imageName, String dateTime) {
        this.imagePath = imagePath;
        this.imageName = imageName;
        DateTime = dateTime;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
}
