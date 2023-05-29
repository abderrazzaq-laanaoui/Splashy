package com.laanaoui.splashy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView usernameTextView, passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        usernameTextView = findViewById(R.id.usernameTextView);
        passwordTextView = findViewById(R.id.passwordTextView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            setUsernameText(username);
            setPasswordText(password);
        }
    }

    public void retour(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void setUsernameText(String username) {
        if (usernameTextView != null) {
            usernameTextView.setText(username);
        }
    }

    private void setPasswordText(String password) {
        if (passwordTextView != null) {
            passwordTextView.setText(password);
        }
    }
}
