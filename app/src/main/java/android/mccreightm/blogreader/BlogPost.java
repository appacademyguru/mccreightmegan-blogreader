package android.mccreightm.blogreader;


public class BlogPost {
    public final String title;
    public final String url;
    public final String author;
    public final String date;
    public final String thumbnail;

    public BlogPost(String title, String url, String author, String date, String thumbnail){
        this.title = title;
        this.url = url;
        this.author = author;
        this.date = date;
        this.thumbnail = thumbnail;
    }
}
