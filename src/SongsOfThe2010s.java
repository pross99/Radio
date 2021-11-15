import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe2010s implements SongIterator{
   SongInfo[] bestSongs;

   int arrayValue = 0;

    public SongsOfThe2010s() {
        bestSongs = new SongInfo[3];

        addSong("DESPACITO", "Luis fonsi", 2017);
        addSong("Old Town Road", "Lil Nas X", 2019);
        addSong("Radioactive", "Imagine dragons", 2012);
    }


    public void addSong(String songName, String artist, int yearReleased) {
        SongInfo song = new SongInfo(songName,artist,yearReleased);

       bestSongs[arrayValue] = song;

       arrayValue++;
    }

//    public SongInfo[] getBestSongs() {
//        return bestSongs;
//    }


    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
