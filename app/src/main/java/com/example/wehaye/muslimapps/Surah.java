package com.example.wehaye.muslimapps;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Surah extends AppCompatActivity {
    MediaPlayer playAlfatihah, playAnnas, playFallaq, playIkhlas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
    }

    public void playFatihah(View v){
        if(playAlfatihah == null){
            playAlfatihah = MediaPlayer.create(this, R.raw.alfatiha);
            playAlfatihah.start();
            playAlfatihah.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayerAlfatihah();
                }
            });
        }
        playAlfatihah.start();
    }

    public void pauseFatihah(View v){
        if (playAlfatihah.isPlaying()){
            playAlfatihah.pause();
        }else if (playAlfatihah != null){
            Toast.makeText(this, "Lagu sedang di Pause", Toast.LENGTH_SHORT).show();
        }else if (playAlfatihah==null){
            Toast.makeText(this, "Belum ada lagu", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopFatihah(View v){
        stopPlayerAlfatihah();
    }

    public void stopPlayerAlfatihah(){
        if (playAlfatihah != null){
            playAlfatihah.release();
            playAlfatihah = null;
            Toast.makeText(this, "Media Player Realese", Toast.LENGTH_SHORT).show();
        }
    }

    public void playIkhlas(View v){
        if(playIkhlas == null){
            playIkhlas = MediaPlayer.create(this, R.raw.alikhlas);
            playIkhlas.start();
            playIkhlas.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayerIkhlas();
                }
            });
        }
        playIkhlas.start();
    }

    public void pauseIkhlas(View v){
        if (playIkhlas.isPlaying()){
            playIkhlas.pause();
        }else if (playIkhlas != null){
            Toast.makeText(this, "Lagu sedang di Pause", Toast.LENGTH_SHORT).show();
        }else if (playIkhlas==null){
            Toast.makeText(this, "Belum ada lagu", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopIkhlas(View v){
        stopPlayerIkhlas();
    }

    public void stopPlayerIkhlas(){
        if (playIkhlas != null){
            playIkhlas.release();
            playIkhlas = null;
            Toast.makeText(this, "Media Player Realese", Toast.LENGTH_SHORT).show();
        }
    }

    public void playNaas(View v){
        if(playAnnas == null){
            playAnnas = MediaPlayer.create(this, R.raw.annas);
            playAnnas.start();
            playAnnas.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayerNaas();
                }
            });
        }
        playAnnas.start();
    }

    public void pauseNaas(View v){
        if (playAnnas.isPlaying()){
            playAnnas.pause();
        }else if (playAnnas != null){
            Toast.makeText(this, "Lagu sedang di Pause", Toast.LENGTH_SHORT).show();
        }else if (playAnnas==null){
            Toast.makeText(this, "Belum ada lagu", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopNaas(View v){
        stopPlayerNaas();
    }

    public void stopPlayerNaas(){
        if (playAnnas != null){
            playAnnas.release();
            playAnnas = null;
            Toast.makeText(this, "Media Player Realese", Toast.LENGTH_SHORT).show();
        }
    }

    public void playFalaq(View v){
        if(playFallaq == null){
            playFallaq = MediaPlayer.create(this, R.raw.alfalaq);
            playFallaq.start();
            playFallaq.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayerFalaq();
                }
            });
        }
        playFallaq.start();
    }

    public void pauseFalaq(View v){
        if (playFallaq.isPlaying()){
            playFallaq.pause();
        }else if (playFallaq != null){
            Toast.makeText(this, "Lagu sedang di Pause", Toast.LENGTH_SHORT).show();
        }else if (playFallaq==null){
            Toast.makeText(this, "Belum ada lagu", Toast.LENGTH_SHORT).show();
        }
    }

    public void stopFalaq(View v){
        stopPlayerFalaq();
    }

    public void stopPlayerFalaq(){
        if (playFallaq != null){
            playFallaq.release();
            playFallaq = null;
            Toast.makeText(this, "Media Player Realese", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        stopPlayerAlfatihah();
        stopPlayerFalaq();
        stopPlayerNaas();
        stopPlayerIkhlas();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
