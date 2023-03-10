package com.example.seradmin.calendario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.seradmin.R;
import com.example.seradmin.database.eventosDatabase.Evento;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Calendario extends AppCompatActivity {

    FloatingActionButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        add = findViewById(R.id.add);
        add.setVisibility(View.VISIBLE);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calendario.this, EventActivity.class);
                startActivity(intent);
            }
        });

        getSupportFragmentManager().
                beginTransaction().add(R.id.fragments_holder, new MonthFragment()).
                commit();

    }


}