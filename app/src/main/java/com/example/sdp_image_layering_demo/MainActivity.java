package com.example.sdp_image_layering_demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity<adapter> extends AppCompatActivity {
    //Set up imageviews
    ImageView head_image;
    ImageView hair_image;
    ImageView hairstyle_preview;
    ImageView hair_color_preview;
    ImageView skin_tone_preview;
    int skintone = 0;
    int hairstyle = 0;
    int hair_color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        head_image = (ImageView) findViewById(R.id.head_img);
        hair_image = (ImageView) findViewById(R.id.hair_img);
        hairstyle_preview = (ImageView) findViewById(R.id.hairstyle_preview_img);
        hair_color_preview = (ImageView) findViewById(R.id.haircolor_preview_img);
        skin_tone_preview = (ImageView) findViewById(R.id.skintone_preview_img);

        //Setting up dropdown list, code can be found online from android studio documentation
        Spinner skin_spinner = (Spinner) findViewById(R.id.skin_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.color_choices, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skin_spinner.setAdapter(adapter1);

        //Set up dropdown for Hairstyle
        Spinner hairstyle_spinner = (Spinner) findViewById(R.id.hairstyle_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.hairstyle_choices, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hairstyle_spinner.setAdapter(adapter2);

        //Set up dropdown for skin tone
        Spinner hair_color_spinner = (Spinner) findViewById(R.id.hair_color_spinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.hair_color_choices, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hair_color_spinner.setAdapter(adapter3);

        skin_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                skintone = position;
                setHead_image(skintone);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        hairstyle_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hairstyle = position;
                setHair_image(hairstyle, hair_color);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        hair_color_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hair_color = position;
                setHair_image(hairstyle, hair_color);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setHead_image(int skintone){
        if (skintone == 0){
            head_image.setImageResource(R.drawable.b0_head_0_crop);
            skin_tone_preview.setImageResource(R.drawable.skin_tone_0_preview);
        }
        else if (skintone == 1){
            head_image.setImageResource(R.drawable.b0_head_1_crop);
            skin_tone_preview.setImageResource(R.drawable.skin_tone_1_preview);
        }
        else if (skintone == 2) {
            head_image.setImageResource(R.drawable.b0_head_2_crop);
            skin_tone_preview.setImageResource(R.drawable.skin_tone_2_preview);
        }
    }

    public void setHair_image(int hairstyle, int hair_color){
        if (hairstyle == 0 && hair_color == 0){
            hair_image.setImageResource(R.drawable.b0_hair_0_0_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_1_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_0_preview);
        }
        else if (hairstyle == 0 && hair_color == 1){
            hair_image.setImageResource(R.drawable.b0_hair_0_1_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_1_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_1_preview);
        }
        else if (hairstyle == 0 && hair_color == 2){
            hair_image.setImageResource(R.drawable.b0_hair_0_2_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_1_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_2_preview);
        }
        else if (hairstyle == 0 && hair_color == 3){
            hair_image.setImageResource(R.drawable.b0_hair_0_3_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_1_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_3_preview);
        }
        else if (hairstyle == 1 && hair_color == 0){
            hair_image.setImageResource(R.drawable.b0_hair_1_0_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_2_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_0_preview);
        }
        else if (hairstyle == 1 && hair_color == 1){
            hair_image.setImageResource(R.drawable.b0_hair_1_1_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_2_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_1_preview);
        }
        else if (hairstyle == 1 && hair_color == 2){
            hair_image.setImageResource(R.drawable.b0_hair_1_2_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_2_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_2_preview);
        }
        else if (hairstyle == 1 && hair_color == 3){
            hair_image.setImageResource(R.drawable.b0_hair_1_3_crop);
            hairstyle_preview.setImageResource(R.drawable.hairstyle_2_preview);
            hair_color_preview.setImageResource(R.drawable.hair_color_3_preview);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}