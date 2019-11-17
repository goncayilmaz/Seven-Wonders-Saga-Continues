package superProject.Controller;


public class Sound {

    private boolean sound;
    private boolean music;


    public Sound(boolean sound, boolean music) {
        this.sound = sound;
        this.music = music;
    }

    public void changeMusic(){
        if (music){
            music=false;
        }
        else {
            music=true;
        }

    }
    public void changeSound(){
        if (sound){
            sound=false;
        }
        else {
            sound=true;
        }

    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }
}
