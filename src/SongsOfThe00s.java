import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe00s implements SongIterator {
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe00s() {
        bestSongs = new ArrayList<SongInfo>();

        addSong("In da club", "50 Cent", 2003);
        addSong("Hey ya", "Outkast", 2003);
        addSong("Gold Digger", "Kanye West", 2005);
    }


    public void addSong(String songName, String artist, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName,artist,yearReleased);

        bestSongs.add(songInfo);
    }

//    public ArrayList<SongInfo> getBestSongs() {
//        return bestSongs;
//    }


    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
