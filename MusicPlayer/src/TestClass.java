import java.util.ArrayList;

//this class is used to populate the application with mock songs, user and playlist data
public class TestClass {

    MusicPlayer MP = new MusicPlayer();



    public MusicPlayer populateApp(){

        //songs in the application
        MP.addSong(100000, "spirit", "R&B", 2018);
        MP.addSong(110000, "killshot","Rap", 2018);
        MP.addSong(11100,"fingers", "R&B", 2018 );

        //users in the application
        MP.addUser(21000, "Mahmoud Hamraa");
        MP.addUser(21100, "Lebron James");
        MP.addUser(21110, "Buk Lau");

        //artists in the application
        MP.addArtist(220000,"Majid Jordan","Canada", "R&B");
        MP.addArtist(221000,"Eminem","USA", "Rap");
        MP.addArtist(221100,"Zayn","UK", "R&B");

        //playlist called "Sweet Spot" that belongs to user <Mahmoud Hamraa>
        MP.addPLayListToUser(21000, 90000, "Sweet Spot", "Mahmoud Hamraa", "2018");



        return MP;

    }





}
