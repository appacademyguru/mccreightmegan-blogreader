package android.mccreightm.blogreader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class BlogPostAdapter extends ArrayAdapter<BlogPost>{
    public BlogPostAdapter(Context context, ArrayList<BlogPost> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
    }
}
