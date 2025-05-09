package Player;

import java.util.Scanner;


public class LettoreMultimediale {

    private ElementoMultimediale[] elementi = new ElementoMultimediale[5];

    public LettoreMultimediale() {

        elementi[0] = new Video("Video 1", 5, 3, 2);
        elementi[1] = new RegistrazioneAudio("Audio 1", 4, 3);
        elementi[2] = new Video("Video 2", 7, 5, 4);
        elementi[3] = new RegistrazioneAudio("Audio 2", 6, 2);
        elementi[4] = new Video("Video 3", 10, 7, 5);
    }

    public void interagisciConUtente() {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Scegli un elemento da riprodurre (1-5) o 0 per uscire:");
            for (int i = 0; i < elementi.length; i++) {
                System.out.println((i + 1) + ". " + elementi[i].getTitolo());
            }

            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Uscita dal lettore.");
                break;
            }

            if (scelta >= 1 && scelta <= 5) {

                elementi[scelta - 1].play();
            } else {

                System.out.println("Scelta non valida, riprova.");
            }
        }


        scanner.close();
    }
}

