package com.coursera.adrian.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irMusicDojo(View view){
        Intent i = new Intent (this, MusicDojo.class);
        startActivity(i);
    }
    public void irReforma180(View view){
        Intent i = new Intent (this, Reforma180.class);
        startActivity(i);
    }
    public void irTenochtitlan(View view){
        Intent i = new Intent (this, TemploMayor.class);
        startActivity(i);
    }
    public void irExpoTnT(View view){
        Intent i = new Intent (this, MapsActivity.class);
        startActivity(i);
    }
}
