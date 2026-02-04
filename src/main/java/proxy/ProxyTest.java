package proxy;

import proxy.proxyimpl.VideoDownloaderProxy;
import proxy.subject.VideoDownloader;

public class ProxyTest {

    public static void main(String[] args) {

        VideoDownloader downloader = new VideoDownloaderProxy();

        downloader.download("youtube.com/video1");
        downloader.download("youtube.com/video1");
        downloader.download("tiktok.com/video2");
    }
}
