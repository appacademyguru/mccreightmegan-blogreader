package android.mccreightm.blogreader;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class BlogPostTask extends AsyncTask<Activity, Void, JSONObject>{
    @Override
    protected JSONObject doInBackground(Activity... activities) {
        try {
            URL blogFeedURL = new URL("http://blog.teamtreehouse.com/api/get_recent_summary/?count=10");
        }
        catch(MalformedURLException error){
            Log.e("BlogPostTask", "Malformed URL" + error);
        }

        return null;
    }
}
