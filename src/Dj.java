import java.util.Iterator;


public class Dj {

    SongsOfThe00s songs70s;
    SongsOfThe2010s songs80s;
    SongsOfThe90s songs90s;


    SongIterator iter90sSongs;
    SongIterator iter00sSongs;
    SongIterator iter10sSongs;


    public Dj(SongIterator  songs90s, SongIterator  songs00s, SongIterator  songs10s) {

        iter90sSongs = songs90s;
        iter00sSongs = songs00s;
        iter10sSongs = songs10s;

    }

//    public void showTheSongs() {
//        ArrayList aL70sSongs = songs70s.getBestSongs();
//
//        System.out.println("Songs of the 70s \n");
//
//        for (int i = 0; i < aL70sSongs.size(); i++) {
//            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
//
//            System.out.println(bestSongs.getName());
//            System.out.println(bestSongs.getArtist());
//            System.out.println(bestSongs.getYearReleased());
//        }
//
//
//        SongInfo[] array80sSongs = songs80s.getBestSongs();
//
//        System.out.println("Songs of the 80s \n");
//
//        for (int i = 0; i < array80sSongs.length; i++) {
//            SongInfo bestSongs = array80sSongs[i];
//
//            System.out.println(bestSongs.getName());
//            System.out.println(bestSongs.getArtist());
//            System.out.println(bestSongs.getYearReleased());
//        }
//        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
//
//        System.out.println("Songs of the 90s \n");
//
//        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements(); ) {
//            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
//
//            System.out.println(bestSongs.getName());
//            System.out.println(bestSongs.getArtist());
//            System.out.println(bestSongs.getYearReleased());
//
//        }
//    }

    public void showTheSongs2() {

        Iterator songs90s = iter90sSongs.createIterator();
        Iterator songs00s = iter00sSongs.createIterator();
        Iterator songs10s = iter10sSongs.createIterator();
        System.out.println("Songs of the 90s \n");
        printTheSongs(songs90s);
        System.out.println("\n");

        System.out.println("Songs of the 2000s \n");
        printTheSongs(songs00s);
        System.out.println("\n");

        System.out.println("Songs of the 2010s \n");
        printTheSongs(songs10s);
        System.out.println("\n");









    }

    public void printTheSongs(Iterator iterator) {
        while(iterator.hasNext()) {

            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getName());
            System.out.println(songInfo.getArtist());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
