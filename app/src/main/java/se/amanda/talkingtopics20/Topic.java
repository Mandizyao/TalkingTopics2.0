package se.amanda.talkingtopics20;

public class Topic {
    private String title;
    private int imageId;

    public Topic(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }
}
