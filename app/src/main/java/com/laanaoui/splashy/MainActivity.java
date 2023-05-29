package com.laanaoui.splashy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        usernameEditText = findViewById(R.id.usernameTextView);
        passwordEditText = findViewById(R.id.passwordTextView);
    }

    public void envoyer(View view) {
        String usernameString = usernameEditText.getText().toString().trim();
        String passwordString = passwordEditText.getText().toString().trim();

        if (usernameString.isEmpty() || passwordString.isEmpty()) {
            Toast.makeText(this, getResources().getString(R.string.fill_in), Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("username", usernameString);
            bundle.putString("password", passwordString);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart vient d'être appelée !");
        showToast("onStart vient d'être appelée !");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart vient d'être appelée !");
        showToast("onRestart vient d'être appelée !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume vient d'être appelée !");
        showToast("onResume vient d'être appelée !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause vient d'être appelée !");
        showToast("onPause vient d'être appelée !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop vient d'être appelée !");
        showToast("onStop vient d'être appelée !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy vient d'être appelée !");
        showToast("onDestroy vient d'être appelée !");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
