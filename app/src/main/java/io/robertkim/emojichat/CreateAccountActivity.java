package io.robertkim.emojichat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

/**
 * Created by robert on 1/25/15.
 */
public class CreateAccountActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText passwordConf;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);

        username = (EditText) findViewById(R.id.username_field);
        password = (EditText) findViewById(R.id.password_field);
        passwordConf = (EditText) findViewById(R.id.passwordconf_field);
        email = (EditText) findViewById(R.id.email_field);

        Button createUserButton = (Button) findViewById(R.id.create_user_button);
        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser(v);
            }
        });
    }

    public void createUser(View view) {

        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();
        String passwordConfText = passwordConf.getText().toString();
        String emailText = email.getText().toString();

        if (passwordText.equals(passwordConfText)) {
            ParseUser user = new ParseUser();
            user.setUsername(usernameText);
            user.setPassword(passwordText);
            user.setEmail(emailText);

            user.signUpInBackground(new SignUpCallback() {
                public void done(ParseException e) {
                    if (e == null) {
                    } else {
                    }
                }
            });
        }
        Intent intent = new Intent(this, CreateAccountActivity.class);
    }
}
