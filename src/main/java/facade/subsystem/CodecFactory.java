package facade.subsystem;

public class CodecFactory {
    public static void extract(VideoFile file) {
        System.out.println("CodecFactory: Extracting video engine from " + file.getName());
    }
}
