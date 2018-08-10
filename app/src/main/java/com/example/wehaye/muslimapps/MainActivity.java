package com.example.wehaye.muslimapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView btn_kalender,btn_jadwal, btn_berita, btn_tausiah, btn_surah, btn_hadist, btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_berita = findViewById(R.id.btn_berita);
        btn_kalender = findViewById(R.id.btn_kalender);
        btn_jadwal = findViewById(R.id.btn_jadwal);
        btn_tausiah = findViewById(R.id.btn_tausiah);
        btn_surah = findViewById(R.id.btn_surah);
        btn_hadist = findViewById(R.id.btn_hadist);
        btn_about = findViewById(R.id.btn_about);

        btn_berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Berita.class));
            }
        });

        btn_kalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Kalender.class));
            }
        });

        btn_jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Jadwal_Sholat.class));

            }
        });

        btn_tausiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tausyiah.class));
            }
        });

        btn_surah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Surah.class));
            }
        });

        btn_hadist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HadistActivity.class));
            }
        });

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TentangKami.class));
            }
        });
    }
}
