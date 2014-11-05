package android.mccreightm.blogreader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BlogPostAdapter extends ArrayAdapter<BlogPost>{
    public BlogPostAdapter(Context context, ArrayList<BlogPost> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BlogPost post = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.blog_item, parent, false);

        }
            ImageView thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
            new DownloadImageTask(thumbnail).execute(post.thumbnail);
            TextView title = (TextView) convertView.findViewById(R.id.title);
            title.setText(post.title);
            TextView author = (TextView) convertView.findViewById(R.id.author);
            author.setText(post.author);
            TextView date = (TextView) convertView.findViewById(R.id.date);
            date.setText(post.date);

        return convertView;
    }
}
