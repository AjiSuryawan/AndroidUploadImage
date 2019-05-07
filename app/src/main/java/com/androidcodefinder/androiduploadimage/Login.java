package com.androidcodefinder.androiduploadimage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText editText_email, editText_password;
    private Button button_login;
    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText_email = findViewById(R.id.edit_text_login_email);
        editText_password = findViewById(R.id.edit_text_login_password);
        button_login = findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = editText_email.getText().toString();
                password = editText_password.getText().toString();
                if (email.isEmpty() && password.isEmpty()) {
                    editText_email.setError("email cannot empty");
                    editText_password.setError("password cannot empty");
                } else {
                    //login_process(email,password);
                    if (email.equalsIgnoreCase("user") ||
                            password.equalsIgnoreCase("user")){
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        SharedPreferences sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("email", email);
                        editor.putString("email_check", "admin");
                        editor.apply();
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }
}
