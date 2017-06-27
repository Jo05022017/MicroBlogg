import java.util.ArrayList;
import java.util.Iterator;

public class Post
{
    private int postOrder;
    private String name;
    private String emailAdr;
    private String post;
    private String userName;
    private String webSite;

    public Post( int postOrder, String name, String emailAdr, String post, String userName, String webSite)
    {
        this.postOrder = postOrder;
        this.userName = userName;
        this.name = name;
        this.emailAdr =emailAdr;
        this.post = post;
        this.webSite = webSite;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPostInfo()
    {
        return postOrder + "," + post + "," + userName + "," + webSite;
    }

    public String getPostInfoSite()
    {
        return postOrder + "-" + post + "," + webSite + "," + userName;
    }

    public int getpostOrder()
    {
        return postOrder;
    }

    public String getname()
    {
        return name;
    }
    public String getemailAdr()
    {
        return emailAdr;
    }
}
