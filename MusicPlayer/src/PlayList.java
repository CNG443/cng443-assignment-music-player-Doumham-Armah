import java.util.ArrayList;

public class PlayList {

    private int playListID;
    private String PLname;
    private String PLowner;
    private String dateCreated;
    private ArrayList<Song> SongsList = new ArrayList<Song>();

    public PlayList(int playListID, String PLname, String PLowner, String dateCreated) {
        this.playListID = playListID;
        this.PLname = PLname;
        this.PLowner = PLowner;
        this.dateCreated = dateCreated;
    }

    public int getPlayListID() {
        return playListID;
    }

    public void setPlayListID(int playListID) {
        this.playListID = playListID;
    }

    public String getPLname() {
        return PLname;
    }

    public void setPLname(String PLname) {
        this.PLname = PLname;
    }

    public String getPLowner() {
        return PLowner;
    }

    public void setPLowner(String PLowner) {
        this.PLowner = PLowner;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ArrayList<Song> getSongsList() {

        return SongsList;
    }

    //a setter that adds a song to an arraylist of songs
    public void addSongtoUserPlaylist(Song newSong){

        SongsList.add(newSong);
        System.out.println("Song " +newSong.getSongName()+ "has been added to the playlist");

    }


}

