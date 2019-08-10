package com.vibhusharma.animationofloadingpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView truckMovingImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        truckMovingImage = findViewById(R.id.truckMovingImage);


        Animation animation = new TranslateAnimation(-500, 600, 0, 0);
        animation.setDuration(4000);
        animation.setRepeatCount(100);
        truckMovingImage.setAnimation(animation);



    }
}
