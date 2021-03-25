package pl.edu.pwsztar.domain.dto;

public class VideoDto {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    private String title;

    public VideoDto(String title, String videoId) {
        this.title = title;
        this.videoId = videoId;
    }

    private String videoId;

    public VideoDto() {
    }


}
