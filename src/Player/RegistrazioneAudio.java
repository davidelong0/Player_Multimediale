package Player;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproduci{
    private int durata;
    private int volume;
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }
    public void aumentaVolume(){
        volume++;
    }
    public void abbassaVolume(){
        if(volume>0)volume--;
    }

    @Override
    public void play(){
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo()+" "+"!".repeat(volume));
        }

    }
}
