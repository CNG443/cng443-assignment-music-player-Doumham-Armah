import java.util.ArrayList;
import java.util.Scanner;


public class MusicPlayer {

    private ArrayList<Song> SongsList = new ArrayList<Song>();
    private ArrayList<User> UsersList = new ArrayList<User>();
    private ArrayList<Artist> ArtistsList = new ArrayList<Artist>();



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        MusicPlayer musicplayer =new MusicPlayer();
        TestClass TC = new TestClass();
        musicplayer = TC.populateApp();

        boolean askAgain = true;

        while (askAgain){

            System.out.println("1- add user");
            System.out.println("2- add new song");
            System.out.println("3- add song to album");
            System.out.println("4- add a new playlist to user");
            System.out.println("5- add a song to a playlist");
            System.out.println("6- add new artist");
            System.out.println("7- add new album to artist");
            System.out.println("8- add album to a user");


            System.out.println("9- delete user");
            System.out.println("10- delete song from application");
            System.out.println("11- delete a playlist");
            System.out.println("12- delete artist from application");
            System.out.println("13- delete album from an artist");
            System.out.println("14- delete album from a user");
            

            System.out.println("15- get user details");
            System.out.println("16- get album of a song");
            System.out.println("17- get a playlist's details");


            System.out.println("18- display all artists");
            System.out.println("19- display all users");
            System.out.println("20- display all songs");
            System.out.println("21- exit application");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("enter user name: ");
                    String username = scanner.next();
                    System.out.println("enter user ID: ");
                    int ID = scanner.nextInt();
                    musicplayer.addUser(ID, username);

                    break;
                case 2:

                    System.out.println("enter song ID: ");
                    int songID = scanner.nextInt();
                    System.out.println("enter song name: ");
                    String songName = scanner.next();
                    System.out.println("enter song genre: ");
                    String songGenre = scanner.next();
                    System.out.println("enter song release date: ");
                    int songRD = scanner.nextInt();

                    musicplayer.addSong(songID, songName, songGenre, songRD);
                    break;
                case 3:

                    System.out.println("enter song ID: ");
                    songID = scanner.nextInt();
                    System.out.println("enter artist ID: ");
                    int artistID = scanner.nextInt();
                    System.out.println("enter album ID: ");
                    int albumID = scanner.nextInt();

                    musicplayer.addSongToAlbum(songID, artistID, albumID);
                    break;

                case 4:
                    System.out.println("enter user ID: ");
                    ID = scanner.nextInt();
                    System.out.println("enter PLaylist ID: ");
                    int PLID = scanner.nextInt();
                    System.out.println("enter PLaylist name: ");
                    String PLName = scanner.next();
                    System.out.println("enter PLaylist owner: ");
                    String PLowner = scanner.next();
                    System.out.println("enter date playlist is created: ");
                    String dateCreated = scanner.next();

                    musicplayer.addPLayListToUser(ID, PLID, PLName, PLowner, dateCreated);
                    break;

                case 5:

                    System.out.println("enter song ID: ");
                    songID = scanner.nextInt();
                    System.out.println("enter user ID: ");
                    int userID = scanner.nextInt();
                    System.out.println("enter playlist ID: ");
                    PLID = scanner.nextInt();

                    musicplayer.addSongToPlaylist(songID, userID, PLID);
                    break;

                    //adds new artist
                case 6:

                    System.out.println("enter artist ID: ");
                    artistID = scanner.nextInt();
                    System.out.println("enter artist name: ");
                    String artistName = scanner.next();
                    System.out.println("enter artist country: ");
                    String artistCountry = scanner.next();
                    System.out.println("enter artist music type: ");
                    String artistMusicType = scanner.next();

                    musicplayer.addArtist(artistID, artistName, artistCountry, artistMusicType);
                    break;
                    //add new album to an existing artist
                case 7:
                    System.out.println("enter artist ID: ");
                    artistID = scanner.nextInt();
                    System.out.println("enter album ID: ");
                    albumID = scanner.nextInt();
                    System.out.println("enter album name: ");
                    String albumName = scanner.next();
                    System.out.println("enter album genre: ");
                    String albumGenre = scanner.next();
                    System.out.println("enter album release date: ");
                    int albumRD = scanner.nextInt();
                    System.out.println("enter artist name: ");
                    artistName = scanner.next();

                    musicplayer.addNewAlbumToArtist(artistID, albumID, albumName, albumGenre, albumRD, artistName);
                    break;
                //add album to user
                case 8:
                    System.out.println("enter user ID: ");
                    userID = scanner.nextInt();
                    System.out.println("enter album ID: ");
                    albumID = scanner.nextInt();


                    musicplayer.addAlbumToUser(userID, albumID);
                    break;


                   //delete existing user
                case 9:
                    System.out.println("enter user name: ");
                    String userName = scanner.next();

                    musicplayer.deleteUser(userName);
                    break;

                    //delete existing song
                case 10:
                    System.out.println("enter song name: ");
                    songName = scanner.next();
                    musicplayer.removeSong(songName);
                    break;

                    //delete existing artist
                case 11:
                    System.out.println("enter artist ID: ");
                    artistID = scanner.nextInt();
                    musicplayer.deleteArtist(artistID);

                    break;
                    //delete existing playlist
                case 12:
                    System.out.println("enter user ID: ");
                    userID = scanner.nextInt();
                    System.out.println("enter playlist ID: ");
                    PLID = scanner.nextInt();

                    musicplayer.deletePlayList(userID, PLID);

                    break;
                    //delete existing album from existing artist
                case 13:
                    System.out.println("enter artist ID: ");
                    artistID = scanner.nextInt();
                    System.out.println("enter playlist ID: ");
                    PLID = scanner.nextInt();

                    musicplayer.deleteAlbum(artistID, PLID);
                    break;

                    //delete existing album from existing user
                case 14:
                    System.out.println("enter user ID: ");
                    userID = scanner.nextInt();
                    System.out.println("enter album ID: ");
                    albumID = scanner.nextInt();

                    musicplayer.deleteAlbumFromUser(userID, albumID);
                    break;

                    //gets a specific user's details
                case 15:
                    System.out.println("enter user ID: ");
                    ID = scanner.nextInt();
                    musicplayer.getUserDetails(ID);

                    break;

                case 16:
                    System.out.println("enter song ID: ");
                    ID = scanner.nextInt();
                    musicplayer.getSongAlbum(ID);
                    break;

                //displays a specific playlist's details
                case 17:
                    System.out.println("enter playlist ID: ");
                    PLID = scanner.nextInt();

                    musicplayer.displayPlayListDetails(PLID);
                    break;
                //display all artists
                case 18:
                    musicplayer.displayArtists();
                    break;

                //displays all users
                case 19:
                    musicplayer.displayUsers();
                    break;
                //display all songs
                case 20:
                    musicplayer.displaySongs();
                    break;

                default:
                    askAgain = false;

            }

        }

    }

    public void addUser(int ID, String name) {

        UsersList.add(new User(ID, name));
        System.out.println("User: " + name + " has been added");

    }


    public void deleteUser(String name) {

        int pos = -1;

        for (int i = 0; i < UsersList.size(); i++) {
            if (UsersList.get(i).getUserName().equals(name))
                pos = i;
        }
        if (pos >=0)
            UsersList.remove(pos);
        else
            System.out.println("User " + name + "does not exist!");

    }

    public void getUserDetails(int ID) {

        for (int i = 0; i < UsersList.size(); i++) {
            int tmp;
            tmp = UsersList.get(i).getUserID();
            if (tmp == ID)
                System.out.println("User's name: " + UsersList.get(i).getUserName() + UsersList.get(i).getListOfAlbums()
                        + UsersList.get(i).getListOfFollowers() + UsersList.get(i).getListOfFollowings() + UsersList.get(i).getListOfPlaylists());

        }

    }

    public void displayUsers() {

        System.out.println("There are  " + UsersList.size() + " users in the application: ");

        for (int i = 0; i < UsersList.size(); i++) {
            System.out.println((UsersList.get(i).getUserName()));
        }
    }

    //adds a new artist to ArtistsList
    public void addArtist(int artistID, String artistName, String artistCountry, String artistMusicType) {

        ArtistsList.add(new Artist(artistID, artistName, artistCountry, artistMusicType));
        System.out.println("Artist: " + artistName + " has been added");

    }

    //deletes an existing artist from ArtistsList
    public void deleteArtist(int artistID) {

        int pos = -1;
        String name = "";

        for (int i = 0; i < ArtistsList.size(); i++) {
            if (ArtistsList.get(i).getArtistID() == artistID){
                pos = i;
                name = ArtistsList.get(i).getArtistName();

            }}
        if (pos >=0)
            ArtistsList.remove(pos);
        else
            System.out.println("Artist " + name + "does not exist!");

    }
    //displays all artists in the ArtistsList
    public void displayArtists() {

        System.out.println("There are  " + ArtistsList.size() + " artists in the application: ");

        for (int i = 0; i < ArtistsList.size(); i++) {
            System.out.println((ArtistsList.get(i).getArtistName()));
        }
    }

    //adds a new song to SongsList
    public void addSong(int ID, String name, String genre, int RD) {
        SongsList.add(new Song(ID, name, genre, RD));
    }

    public void displaySongs() {

        System.out.println("There are " + SongsList.size() + " songs in the application: ");

        for (int i = 0; i < SongsList.size(); i++) {
            System.out.println(SongsList.get(i).getSongName());
        }
    }

    public void removeSong(String name) {

        int flag = -1;

        for (int i = 0; i < SongsList.size(); i++) {
            if (SongsList.get(i).getSongName().equals(name)) {

                SongsList.remove(i);
                flag = 1;

            }

        }

        if (flag == -1){
            System.out.println("ERROR: song doesnt exist!");
        }
    }

    //this function takes the song's ID and prints out the album name it's in
    public void getSongAlbum(int id) {

        String tmp="This song is in no album";

        for (int i = 0; i < SongsList.size(); i++) {
            if (SongsList.get(i).getSongID() == id) {

                tmp = SongsList.get(i).getAlbum().getAlbumName();

            }
        }
        System.out.println("This song is in Album" + tmp);
    }

    //takes the ID of the User and Playlist details then creates a new playlist and adds it to the user
    public void addPLayListToUser(int ID, int PLID, String PLname, String PLowner, String DateCreated) {

        for (int i = 0; i < UsersList.size(); i++) {
            int tmp;
            tmp = UsersList.get(i).getUserID();
            if (tmp == ID)
                UsersList.get(i).addPLtoListOfPLayLists(new PlayList(PLID, PLname, PLowner, DateCreated));
        }

    }

    public void addSongToPlaylist(int songID, int userID, int playListID) {

        int x = -1;
        int s = -1;

        //cycle through UsersList array to find the wanted user
        for (int i = 0; i < UsersList.size(); i++) {
            if (UsersList.get(i).getUserID() == userID)
                x = i;
        }

        //cycle through SongsList array to find the wanted song
        for (int i = 0; i < SongsList.size(); i++) {
            if (SongsList.get(i).getSongID() == songID)
                s = i;
        }

        //if the song, the user and the playlist exist in the application add the song to the playlist
        if (x>=0 && s>=0)
            //adds the wanted song to the wanted playlist belonging to the wanted user
            UsersList.get(x).findPL(playListID).addSongtoUserPlaylist(SongsList.get(s));
        else
            System.out.println("Either Song or User don't exist in the system!");



    }

    public void deletePlayList(int userID, int playListID) {

        int x=-1;

        //cycle through UsersList array to find the wanted user
        for (int i = 0; i < UsersList.size(); i++) {
            if (UsersList.get(i).getUserID() == userID)
                x = i;
        }

        //gets the index of the playlist we want to remove in the PLaylist array
        int pos = UsersList.get(x).findPLPosition(playListID);

        //removes the wanted playlist from the array of playlists
        UsersList.get(x).getListOfPlaylists().remove(pos);
    }

//sequentially searches all users to see which user has the playlist in their Playlist arrays. When the playlist is found, it prints all the songs names in that playlist
    //takes each user at a time and searches for the playlist in their arraylist of playlists
    public void displayPlayListDetails(int playListID){

        //cycle through UsersList array to find the wanted user
        for (int i=0; i<UsersList.size(); i++ ) {
            for (int j = 0; j<UsersList.get(i).getListOfPlaylists().size(); j++){
                if (UsersList.get(i).getListOfPlaylists().get(j).getPlayListID() == playListID)
                    for (int x = 0; x<UsersList.get(i).getListOfPlaylists().get(j).getSongsList().size(); x++ ){
                        String SongName=UsersList.get(i).getListOfPlaylists().get(j).getSongsList().get(x).getSongName();
                        System.out.println(SongName);
                    }
            }

        }

    }
    //takes the ID of the artist and album details then creates a new album and adds it to the artist
    public void addNewAlbumToArtist(int artistID, int albumID, String albumName, String albumGenre, int albumReleaseDate, String artist) {

        for (int i = 0; i < ArtistsList.size(); i++) {
            int tmp;
            tmp = ArtistsList.get(i).getArtistID();
            if (tmp == artistID)
                ArtistsList.get(i).addAlbumtoAlbumLists(new Album(albumID, albumName, albumGenre, albumReleaseDate, artist));
            else
                System.out.println("ERROR: artist doesn't exist in the system!!");
        }

    }

    //finds the song, the artist and the album and adds the song to that album
    //song, artist and album must all exist in the system
    public void addSongToAlbum(int songID, int artistID, int albumID) {

        int x = -1;
        int s = -1;

        //cycle through ArtistsList array to find the wanted artist
        for (int i = 0; i < ArtistsList.size(); i++) {
            if (ArtistsList.get(i).getArtistID() == artistID)
                x = i;
        }

        //cycle through SongsList array to find the wanted song
        for (int i = 0; i < SongsList.size(); i++) {
            if (SongsList.get(i).getSongID() == songID)
                s = i;
        }

        //if the song, the artist and the album exist in the application add them to the playlist
        if (x>=0 && s>=0)
            //adds the wanted song to the wanted playlist belonging to the wanted user
            ArtistsList.get(x).findAlbum(albumID).addSongtoAlbum(SongsList.get(s));
        else
            System.out.println("ERROR: Either Song or Artist don't exist in the system!");



    }
//takes the artist, finds the album to delete and removes it from the arraylist of albums
    public void deleteAlbum(int artistID, int albumID) {

        int x=-1;

        //cycle through ArtistsList array to find the wanted Artist
        for (int i = 0; i < UsersList.size(); i++) {
            if (ArtistsList.get(i).getArtistID() == artistID)
                x = i;
        }

        //gets the index of the album we want to remove in the albums array
        int pos = ArtistsList.get(x).findAlbumPosition(albumID);

        //removes the wanted album from the arraylist of albums
        ArtistsList.get(x).getAlbumsList().remove(pos);

        /*logically, the album should no longer exist in the application if the artist deletes one of their albums
        so the album should also get deleted from all users who have it when it is deleted from an artist*/
        for(int i = 0; i<UsersList.size(); i++){
            for (int j = 0; j<UsersList.get(i).getListOfAlbums().size(); j++){
                if (UsersList.get(i).getListOfAlbums().get(j).getAlbumID() == albumID){
                    UsersList.get(i).getListOfAlbums().remove(j);

                }
            }
        }

    }



    //takes the ID of the User and the ID of the album, finds the album from the ArtistsList and adds it to the user's ListOfAlbums
    public void addAlbumToUser(int userID, int AlbumID) {

        int artistIndex = -1;
        int albumIndex = -1;
        int userIndex = -1;

        //finds the index of the wanted artist and the index of the wanted album
        for (int i = 0; i<ArtistsList.size(); i++){
            for (int j =0; j<ArtistsList.get(i).getAlbumsList().size(); j++){
                if (ArtistsList.get(i).getAlbumsList().get(j).getAlbumID() == AlbumID) {
                    artistIndex = i;
                    albumIndex = j;
                }
            }
        }

        //finds the index of the wanted user
        for (int i = 0; i<UsersList.size(); i++){
            if (UsersList.get(i).getUserID() == userID)
                userIndex = i;

        }
        //adds album to User's albums
        UsersList.get(userIndex).addAlbumtoListOfAlbums(ArtistsList.get(artistIndex).getAlbumsList().get(albumIndex));
    }

    //takes the ID of the User and the ID of the album to be deleted, finds the album in the User's listOfAlbums and removes it
    public void deleteAlbumFromUser(int userID, int AlbumID) {

        int albumIndex = -1;
        int userIndex = -1;


        //finds the index of the wanted user
        for (int i = 0; i<UsersList.size(); i++){
            if (UsersList.get(i).getUserID() == userID)
                userIndex = i;

        }

        //finds the index of the wanted album
        for (int i = 0; i<UsersList.get(userIndex).getListOfAlbums().size(); i++){
            if (UsersList.get(userIndex).getListOfAlbums().get(i).getAlbumID() == AlbumID)
                albumIndex = i;

        }

        //removes album from User's listOfAlbums
        UsersList.get(userIndex).getListOfAlbums().remove(albumIndex);
    }

}
