package com.masoud.example.sharedpreferences1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainBActivity extends AppCompatActivity {
    EditText userEdittext1, passEdittext1;
    public static final String DEFOULT = "N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        userEdittext1 = (EditText) findViewById(R.id.editTextUser);
        passEdittext1 = (EditText) findViewById(R.id.editTextPass);
    }

    public void load(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("user", DEFOULT);
        String password = sharedPreferences.getString("pass", DEFOULT);
        if (name.equals(DEFOULT) || password.equals(DEFOULT)) {
            Toast.makeText(this,"no data", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "Data loaded Successfully", Toast.LENGTH_SHORT).show();
            userEdittext1.setText(name);
            passEdittext1.setText(password);
        }


    }

    public void previouce(View view) {
        Toast.makeText(this, "previouce", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
