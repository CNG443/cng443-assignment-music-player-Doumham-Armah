import java.util.ArrayList;

public class User {

    private int userID;
    private String userName;
    private ArrayList<Album> listOfAlbums = new ArrayList<Album>();
    private ArrayList<PlayList> listOfPlaylists = new ArrayList<PlayList>();
    private ArrayList<User> listOfFollowers = new ArrayList<User>();
    private ArrayList<User> listOfFollowings = new ArrayList<User>();


    public User(int userID, String userName, ArrayList<Album> listOfAlbums, ArrayList<PlayList> listOfPlaylists, ArrayList<User> listOfFollowers, ArrayList<User> listOfFollowings) {
        this.userID = userID;
        this.userName = userName;
        this.listOfAlbums = listOfAlbums;
        this.listOfPlaylists = listOfPlaylists;
        this.listOfFollowers = listOfFollowers;
        this.listOfFollowings = listOfFollowings;
    }

    public User(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        /*this.listOfAlbums = listOfAlbums;
        this.listOfPlaylist = listOfPlaylist;
        this.listOfFollowers = listOfFollowers;
        this.listOfFollowings = listOfFollowings;*/
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setListOfAlbums(ArrayList<Album> listOfAlbums) {
        this.listOfAlbums = listOfAlbums;
    }

    //a setter that adds a PLaylist to an arraylist of playlists
    public void addPLtoListOfPLayLists(PlayList newPL){

        listOfPlaylists.add(newPL);
        System.out.println("Playlist " +newPL.getPLname()+ "has been added to the user.");

    }
    //a setter that adds an album to an arraylist of albums
    public void addAlbumtoListOfAlbums(Album newAlbum){

        listOfAlbums.add(newAlbum);
        System.out.println("Album " + newAlbum.getAlbumName()+ "has been added to the user.");

    }
//    public void setListOfPlaylist(ArrayList<String> listOfPlaylist) {
//        this.listOfPlaylists = listOfPlaylist;
//    }

    public void setListOfFollowers(ArrayList<User> listOfFollowers) {
        this.listOfFollowers = listOfFollowers;
    }

    public void setListOfFollowings(ArrayList<User> listOfFollowings) {
        this.listOfFollowings = listOfFollowings;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Album> getListOfAlbums() {
        return listOfAlbums;
    }

    public ArrayList<PlayList> getListOfPlaylists() {
        return listOfPlaylists;
    }

    //takes the ID of a wanted playlist, searches for it in the arraylist of playlists and returns the wanted playlist after it's found
    public PlayList findPL(int PLID){

        int pos = -1;

        for (int i=0; i<listOfPlaylists.size(); i++ ){
            if (listOfPlaylists.get(i).getPlayListID() == PLID)
                pos = i;
        }
        return listOfPlaylists.get(pos);
    }

    public int findPLPosition(int PLID){

        int pos = -1;

        for (int i=0; i<listOfPlaylists.size(); i++ ){
            if (listOfPlaylists.get(i).getPlayListID() == PLID)
                pos = i;
        }
        return pos;
    }



    public ArrayList<User> getListOfFollowers() {
        return listOfFollowers;
    }

    public ArrayList<User> getListOfFollowings() {
        return listOfFollowings;
    }
}


