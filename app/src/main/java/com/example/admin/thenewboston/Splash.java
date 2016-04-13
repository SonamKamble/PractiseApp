package com.example.admin.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by ADMIN on 03/04/2016.
 */
public class Splash extends Activity {

    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ourSong=MediaPlayer.create(Splash.this,R.raw.ringtone);
        ourSong.start();
        Thread timer=new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent i=new Intent("com.example.admin.thenewboston.MENU");
                    startActivity(i);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
