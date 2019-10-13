package org.richit.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private float LEFT_VOLUME=(float) 1.0;
    private float RIGHT_VOLUME=(float) 1.0;
    private int PRIORITY=0;
    private int NO_LOOP=0;
    private float NORMAL_PLAY_RATE=(float) 1.0;

    private SoundPool mSP;

    private final int MAX_STREAM=7;
    int c;
    int d;
    int e;
    int f;
    int g;
    int a;
    int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSP=new SoundPool(MAX_STREAM, AudioManager.STREAM_MUSIC,0);

        c=mSP.load(getApplicationContext(),R.raw.note1_c,1);
        d=mSP.load(getApplicationContext(),R.raw.note2_d,1);
        e=mSP.load(getApplicationContext(),R.raw.note3_e,1);
        f=mSP.load(getApplicationContext(),R.raw.note4_f,1);
        g=mSP.load(getApplicationContext(),R.raw.note5_g,1);
        a=mSP.load(getApplicationContext(),R.raw.note6_a,1);
        b=mSP.load(getApplicationContext(),R.raw.note7_b,1);

    }

    public void playC(View view) {
        Log.d("Clicked","C");
        mSP.play(c,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        Log.d("Clicked","D");
        mSP.play(d,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        Log.d("Clicked","E");
        mSP.play(e,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        Log.d("Clicked","F");
        mSP.play(f,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        Log.d("Clicked","G");
        mSP.play(g,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        Log.d("Clicked","A");
        mSP.play(a,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        Log.d("Clicked","B");
        mSP.play(b,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
