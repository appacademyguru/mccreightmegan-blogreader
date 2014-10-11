package android.mccreightm.blogreader;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BlogPostParser {
    private static BlogPostParser parser;

    private BlogPostParser(){

    }

    public static BlogPostParser get(){
        if(parser == null){
            parser = new BlogPostParser();
        }
        return parser;
    }

    public JSONObject parse(InputStream inputStream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        JSONObject jsonObject = null;
        return jsonObject;
    }
}
