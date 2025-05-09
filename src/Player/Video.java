package Player;

public class Video extends ElementoMultimediale implements Riproduci{
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int luminosita, int volume) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }
    public void aumentaLuminosita(){
        luminosita++;
    }
    public void diminuisciLuminosita(){
        if(luminosita > 0)luminosita--;
    }
    public void aumentaVolume(){
        volume++;
    }
    public void diminuisciVolume() {
        if(volume>0)volume--;
    }

    @Override
    public void play(){
        for (int i = 0; i < durata ; i++) {
            System.out.println(getTitolo()+" "+"!".repeat(volume)+"*".repeat(luminosita));
        }
        }

}
