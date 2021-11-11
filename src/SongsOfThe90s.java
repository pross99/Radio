import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
   Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

   int hashkey= 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Zombie", "The Cranberries", 1994);
    }


    public void addSong(String songName, String artist, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName,artist,yearReleased);

       bestSongs.put(hashkey,songInfo);

        hashkey++;
    }

//   public Hashtable<Integer, SongInfo>getBestSongs() {
//        return bestSongs;
//    }


    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
