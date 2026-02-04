package proxy.proxyimpl;

import proxy.real.RealVideoDownloader;
import proxy.subject.VideoDownloader;

import java.util.HashMap;
import java.util.Map;

public class VideoDownloaderProxy implements VideoDownloader {

    private RealVideoDownloader realDownloader;
    private final Map<String, Boolean> cache = new HashMap<>();

    @Override
    public void download(String url) {
        log(url);

        if (cache.containsKey(url)) {
            System.out.println("Returning cached video: " + url);
            return;
        }

        if (realDownloader == null) {
            realDownloader = new RealVideoDownloader(); // lazy init
        }

        realDownloader.download(url);
        cache.put(url, true);
    }

    private void log(String url) {
        System.out.println("[Proxy] Request to download: " + url);
    }
}
