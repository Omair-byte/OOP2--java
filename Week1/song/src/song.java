import javax.swing.*;

public class song
{
    private String name;
    private String artist;
    private boolean recent;

    //constructor
    public song(String name, String artist,boolean recent)
    {
        this.name= name;
        this.artist= artist;
        this.recent= recent;

    }

    //setter/getter for name
    public void setname(String newname)
    {
        this.name= newname;
    }

    public String getname()
    {
        return name;
    }


    //setter/getter for artist
    public void setartist(String newartist)
    {
        this.artist= newartist;
    }

    public String getartist()
    {
        return artist;
    }



    public void setArtist(String artist) {
        if (artist.contains(" ")) {
            this.artist = artist;
        }
        else
        {
            System.out.println("you didnt enter in a first and last name");
        }
    }


}
