package facade;

public class ShortsUploader {
    private VideoConverter converter = new VideoConverter();

    public void shareToYouTube(String fileName) {
        System.out.println("\n>>> SocialMediaUploader: Preparing for YouTube...");
        // Uses the other facade to do the work
        converter.convert(fileName, "MP4");
        System.out.println("SocialMediaUploader: Uploading to YouTube servers...");
    }
}
