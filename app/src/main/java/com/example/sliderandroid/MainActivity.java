package com.example.sliderandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setFullscreen(true);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                .title("Título 1")
                .description("Descrição 1")
                .image(R.drawable.um)
                .background(R.color.white)
                .backgroundDark(R.color.black)
                .scrollable(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Título 2")
                .description("Descrição 2")
                .image(R.drawable.dois)
                .background(R.color.white)
                .backgroundDark(R.color.black)
                .scrollable(false)
                .build());
    }
}