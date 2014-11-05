package android.mccreightm.blogreader;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//
//public void onClick(View v) {
//        startActivity(new Intent(this, IndexActivity.class));
//        finish();
//
//        }


public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    ImageView bmImage;

    public DownloadImageTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

    @Override
    protected Bitmap doInBackground(String... urls) {
        String urldisplay= urls[0];
        Bitmap thumbnail = null;
        try {
            URL thumbnailURL = new URL(urldisplay);

            HttpURLConnection connection = (HttpURLConnection)thumbnailURL.openConnection();
            connection.connect();
            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){
                thumbnail = BitmapFactory.decodeStream(connection.getInputStream());
            }
        }
        catch(MalformedURLException error){
            Log.e("BlogPostTask", "Malformed URL: " + error);
        }
        catch(IOException error){
            Log.e("BlogPostTask", "IO Exception: " + error);
        }
        return thumbnail;
    }

    @Override
    protected void onPostExecute(Bitmap result) {
        bmImage.setImageBitmap(result);
    }
}
