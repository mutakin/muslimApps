package com.example.wehaye.muslimapps;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tausyiah extends AppCompatActivity {
    private Button but_play;
    private VideoView videoPlayer;

    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tausyiah);

        but_play = (Button) findViewById(R.id.but_play);
        videoPlayer= (VideoView) findViewById(R.id.videoPlayer);
        mediaController = new MediaController(this);

        but_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method panggil video
                videoPlay();
            }
        });
    }

    public void videoPlay(){
        String videoPath = "android.resource://com.example.wehaye.muslimapps/" + R.raw.video1;
        Uri uri = Uri.parse(videoPath);
        videoPlayer.setVideoURI(uri);
        videoPlayer.setMediaController(mediaController);
        mediaController.setAnchorView(videoPlayer);
        videoPlayer.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
