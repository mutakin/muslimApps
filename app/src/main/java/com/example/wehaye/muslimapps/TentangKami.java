package com.example.wehaye.muslimapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TentangKami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
