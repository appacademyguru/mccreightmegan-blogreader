package android.mccreightm.blogreader;

import org.json.JSONObject;

import java.io.InputStream;

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
        return null;
    }
}
