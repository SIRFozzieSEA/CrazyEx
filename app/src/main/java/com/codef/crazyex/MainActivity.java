package com.codef.crazyex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity  implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_biteyou);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_delish);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_disgust);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_donteven);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_eeeeh);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_growl);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_growlkitty);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_hey);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_noodles);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_nooo);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_punk);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_puss);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_pussyface);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_saranara);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_schmee);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_whatthecrap);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_whosthekiki);
        button.setOnClickListener(this);

        button = findViewById(R.id.button_whydyoudoit);
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        playSound(v);
    }

    private synchronized void playSound(View _oView)
    {
        MediaPlayer oMediaPlayer = null;

        int nButtonId = _oView.getId();

        switch (nButtonId)
        {
            case R.id.button_biteyou:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.imgonaabiteyou);
                break;
            case R.id.button_delish:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.itsdelish);
                break;
            case R.id.button_disgust:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.thatsdisqust);
                break;
            case R.id.button_donteven:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.donteventryit);
                break;
            case R.id.button_eeeeh:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.eeeeeh);
                break;
            case R.id.button_growl:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.growl);
                break;
            case R.id.button_growlkitty:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.growlkittykat);
                break;
            case R.id.button_hey:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.heeey);
                break;
            case R.id.button_noodles:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.whendidihavenoodles);
                break;
            case R.id.button_nooo:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.nooooo);
                break;
            case R.id.button_punk:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.iusedtobepunk);
                break;
            case R.id.button_puss:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.puss);
                break;
            case R.id.button_pussyface:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.heeeypussyface);
                break;
            case R.id.button_saranara:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.saranara);
                break;
            case R.id.button_schmee:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.schmeeschmee);
                break;
            case R.id.button_whatthecrap:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.whatthecrap);
                break;
            case R.id.button_whosthekiki:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.whothekiki);
                break;
            case R.id.button_whydyoudoit:
                oMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.whyyoudoit);
                break;

        }

        if (oMediaPlayer != null)
        {
            oMediaPlayer.start();
            oMediaPlayer = null;
        }
    }

}
