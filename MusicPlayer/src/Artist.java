import java.util.ArrayList;

public class Artist {

    private int artistID;
    private String artistName;
    private String artistCountry;
    private String artistMusicType;
    private ArrayList<Album> AlbumsList = new ArrayList<Album>();

    public Artist(int artistID, String artistName, String artistCountry, String artistMusicType) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.artistCountry = artistCountry;
        this.artistMusicType = artistMusicType;
    }

    //given an album's ID this method finds and returns the albmums pos or index in the AlbumsList
    public int findAlbumPosition(int albumID){

        int pos = -1;

        for (int i=0; i<AlbumsList.size(); i++ ){
            if (AlbumsList.get(i).getAlbumID() == albumID)
                pos = i;
        }
        return pos;
    }
    //takes the ID of a wanted album, searches for it in the arraylist of albums and returns the wanted album after it's found
    public Album findAlbum(int albumID){

        int pos = -1;

        for (int i=0; i<AlbumsList.size(); i++ ){
            if (AlbumsList.get(i).getAlbumID() == albumID)
                pos = i;
        }
        return AlbumsList.get(pos);
    }
    //a setter that adds am album to an arraylist of albums
    public void addAlbumtoAlbumLists(Album newAlbum){

        AlbumsList.add(newAlbum);
        System.out.println("Album " +newAlbum.getAlbumName()+ "has been added to the artist.");

    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistCountry() {
        return artistCountry;
    }

    public void setArtistCountry(String artistCountry) {
        this.artistCountry = artistCountry;
    }

    public String getArtistMusicType() {
        return artistMusicType;
    }

    public void setArtistMusicType(String artistMusicType) {
        this.artistMusicType = artistMusicType;
    }

    public ArrayList<Album> getAlbumsList() {
        return AlbumsList;
    }

    public void setAlbumsList(ArrayList<Album> albumsList) {
        AlbumsList = albumsList;
    }
}



