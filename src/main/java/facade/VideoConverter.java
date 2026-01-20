package facade;

import facade.subsystem.AudioMixer;
import facade.subsystem.CodecFactory;
import facade.subsystem.VideoFile;

public class VideoConverter {
    public void convert(String fileName, String format) {
        System.out.println("\n--- Starting Conversion to " + format + " ---");
        VideoFile file = new VideoFile(fileName);

        // Coordinating the subsystems
        CodecFactory.extract(file);
        AudioMixer mixer = new AudioMixer();
        mixer.fix(file);

        System.out.println("VideoConverter: Conversion complete.");
    }
}