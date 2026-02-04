package proxy.real;

import proxy.subject.VideoDownloader;

public class RealVideoDownloader implements VideoDownloader {

    public RealVideoDownloader() {
        heavyInit();
    }

    private void heavyInit() {
        System.out.println("Connecting to video servers...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading video from: " + url);
    }
}
