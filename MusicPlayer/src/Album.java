import java.util.ArrayList;

public class Album {

    private int albumID;
    private String albumName;
    private String albumGenre;
    private int albumReleaseDate;
    private String artist;
    private ArrayList<Song> SongsList = new ArrayList<Song>();

    public Album(int albumID, String albumName, String albumGenre, int albumReleaseDate, String artist) {
        this.albumID = albumID;
        this.albumName = albumName;
        this.albumGenre = albumGenre;
        this.albumReleaseDate = albumReleaseDate;
        this.artist = artist;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setAlbumGenre(String albumGenre) {
        this.albumGenre = albumGenre;
    }

    public void setAlbumReleaseDate(int albumReleaseDate) {
        this.albumReleaseDate = albumReleaseDate;
    }

    //a setter that adds a song to an arraylist of songs inside the album
    public void addSongtoAlbum(Song newSong){

        SongsList.add(newSong);
        System.out.println("Song <" +newSong.getSongName()+ "> has been added to the album " + albumName);

    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumGenre() {
        return albumGenre;
    }

    public int getAlbumReleaseDate() {
        return albumReleaseDate;
    }

    public ArrayList<Song> getSongsList() {
        return SongsList;
    }
}
