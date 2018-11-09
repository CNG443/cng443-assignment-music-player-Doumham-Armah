public class Song {
    private int songID;
    private String songName;
    private String songGenre;
    private int songReleaseDate;
    private Artist artist;
    private Album album;



    public Song(int songID, String songName, String songGenre, int songReleaseDate) {
        this.songID = songID;
        this.songName = songName;
        this.songGenre = songGenre;
        this.songReleaseDate = songReleaseDate;
    }
//    public Song(int songID, String songName, String songGenre, int songReleaseDate, Artist artist, Album album) {
//        this.songID = songID;
//        this.songName = songName;
//        this.songGenre = songGenre;
//        this.songReleaseDate = songReleaseDate;
//        this.artist = artist;
//        this.album = album;
//    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    public void setSongReleaseDate(int songReleaseDate) {
        this.songReleaseDate = songReleaseDate;
    }

    public int getSongID() {
        return songID;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public int getSongReleaseDate() {
        return songReleaseDate;
    }
    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


}
