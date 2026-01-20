package facade;

public class FacadeClient {
    public static void main(String[] args) {
        // Option 1: Using the standard Facade
        VideoConverter basicConverter = new VideoConverter();
        basicConverter.convert("holiday_vlog.mov", "AVI");

        // Option 2: Using the "Higher Level" Facade
        ShortsUploader youtubeBot = new ShortsUploader();
        youtubeBot.shareToYouTube("funny_cat_video.mkv");
    }
}