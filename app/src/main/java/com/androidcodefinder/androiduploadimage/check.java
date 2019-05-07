package com.androidcodefinder.androiduploadimage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        String email = sharedPreferences.getString("email", "");
            if (email == ""){
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
            else{
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }
}
//        if (email == ""&& status ==""){
//            startActivity(new Intent(getApplicationContext(),login.class));
//            finish();
//        }else if (email == email && status == "admin"){
//            startActivity(new Intent(getApplicationContext(),home_admin.class));
//            finish();
//        }else if (email == email && status == "user"){
//            startActivity(new Intent(getApplicationContext(),home_user.class));
//            finish();
//        } else {
//            Toast.makeText(getApplicationContext(),email+" "+status,Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(getApplicationContext(),login.class));
//            finish();
//        }
