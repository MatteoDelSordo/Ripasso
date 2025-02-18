package primaLezione.controlStatement;

public class SwitchCase {
    public static void main(String[] args) {
        int strumento = 4;
        String strumentoMusicale = null;
        switch (strumento) {
            case 1:
                strumentoMusicale = "Chitarra";
                break;
            case 2:
                strumentoMusicale = "Piano";
                break;
            case 3:
                strumentoMusicale = "Batteria";
                break;
            case 4:
                strumentoMusicale = "Flauto";
                break;
            case 5:
                strumentoMusicale = "Invalido";
                break;
        }

        System.out.println(strumentoMusicale);
        int strumento2 = 5;
        switch (strumento2) {
            case 1:
                strumentoMusicale = "Chitarra";
                break;
            case 2:
                strumentoMusicale = "Piano";
                break;
            case 3:
                strumentoMusicale = "Batteria";
                break;
            case 4:
                strumentoMusicale = "Flauto";
                break;
            case 5:
                strumentoMusicale = "Invalido";
                break;
        }

        System.out.println(strumentoMusicale);

    }
}
