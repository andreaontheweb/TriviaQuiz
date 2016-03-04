package com.androidbook.triviaquiz;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class giusto extends QuizActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giusto);
        Log.e(DEBUG_TAG, "--------------  - " + fine);
        Log.e(DEBUG_TAG," animale casuale fra quelli visualizzati " + animale_casuale );
        Log.e(DEBUG_TAG, "-------------- generato numero casuale - "+ numero_casuale );
        Log.e(DEBUG_TAG, "-------------- animale selezionato - "+ animale[numArr[numero_casuale]]);
        
        int imageArr[] = new int[fine];
        imageArr[0] = R.drawable.leone;
        imageArr[1] = R.drawable.struzzo;
        imageArr[2] = R.drawable.maiale;
        imageArr[3] = R.drawable.asino;
        imageArr[4] = R.drawable.acquila;
        imageArr[5] = R.drawable.cagnolino;
        imageArr[6] = R.drawable.cavallo;
        imageArr[7] = R.drawable.delfino;
        imageArr[8] = R.drawable.mucca;
        imageArr[9] = R.drawable.rana;
        ImageView image;
        image = (ImageView)findViewById(R.id.animale );
        image.setImageResource(imageArr[numArr[numero_casuale ]]);
        TextView text;
        text= (TextView)findViewById(R.id.nomeanimale);
        text.setText("Nome dell'animale: "+animale[numArr[numero_casuale]]);
        indovinati++;
        resetta=1;
    }
    public void continua(View v)
    {
        //String backgroundImageName = (String) v.getTag();
        //Log.e(DEBUG_TAG, "--------------  - "+ backgroundImageName  );
        //if (backgroundImageName ==animale[numArr[numero_casuale]]){startActivity(new Intent(QuizSplashActivity.this, giusto.class));}
        //else {      startActivity(new Intent(QuizSplashActivity.this, sbagliato.class));}
        resetta = 1;
        //startActivity(new Intent(giusto.this, QuizSplashActivity.class));
        Log.e(DEBUG_TAG, "chiudo questa activity" );
        finish();

    }

}