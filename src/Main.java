public class Main {

    public static void main(String[] args) {

        PopMusic Madonna;
        Madonna = new PopMusic();

        ElectronicMusic Grimes;
        Grimes = new ElectronicMusic();

        RockMusic Korn;
        Korn = new RockMusic();

        startPlaying(Madonna);
        startPlaying(Grimes);
        startPlaying(Korn);
    }
    static void startPlaying(MusicStyles musicStyles){
        System.out.println("Singer: ");
        musicStyles.singer();
        System.out.println("Song: ");
        musicStyles.playMusic();
        System.out.println("Recording Studio: ");
        musicStyles.recordingStudio();
        System.out.println(" ");
    }
}
