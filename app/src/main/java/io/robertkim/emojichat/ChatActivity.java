package io.robertkim.emojichat;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;

/**
 * Created by robert on 1/25/15.
 */
public class ChatActivity extends Activity {

    private static String sUserId;
    private static final String APPLICATION_ID = "EB4zzZMxPlZAbtR0aDqev9g1dp6a0FEfjOlOQi0a";
    private static final String CLIENT_KEY = "x2uJfAeTxTfvgeBxbMkXoJqJKVuWCWdBTacZBsIl";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
        setContentView(R.layout.activity_login);
    }

}
