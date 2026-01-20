package facade.subsystem;

public class AudioMixer {
    public void fix(VideoFile file) {
        System.out.println("AudioMixer: Fixing audio tracks for " + file.getName());
    }
}