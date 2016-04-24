package com.masoud.example.sharedpreferences1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userEdittext, passEditText;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEdittext = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);

    }

    public void save(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("user",userEdittext.getText().toString());
        editor.putString("pass",passEditText.getText().toString());
        editor.commit();

        Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show();

    }

    public void next(View view) {
        Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainBActivity.class);
        startActivity(intent);
    }
}
