public class RadioStation {

    public static void main (String[] args) {

        SongsOfThe90s songs90s = new SongsOfThe90s();
        SongsOfThe00s songs00s = new SongsOfThe00s();
        SongsOfThe2010s songs10s = new SongsOfThe2010s();


        Dj madPete = new Dj( songs90s,songs00s, songs10s);

        madPete.showTheSongs2();
    }
}
