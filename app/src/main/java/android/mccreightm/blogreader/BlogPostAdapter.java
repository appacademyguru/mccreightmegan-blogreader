package android.mccreightm.blogreader;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class BlogPostAdapter extends ArrayAdapter<BlogPost>{
    public BlogPostAdapter(Context context, ArrayList<BlogPost> posts) {
        super(context, 0, posts);
    }
}
