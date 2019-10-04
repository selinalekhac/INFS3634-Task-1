package com.example.infs3634hwtask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class TwentyFourHourTime extends AppCompatActivity {
    private TextView layoutCityNameText; //declares TextView
    private ImageView layoutCityImage; // declares ImageView
    private TextClock layoutCityTime; // declares TextClock1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_four_hour_time);

        // Individualising each reusable layout with their respective city name, and identifying picture

        // Sydney
        ConstraintLayout layoutSydney = findViewById(R.id.layout_sydney1);
        layoutCityNameText = layoutSydney.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.sydney);
        layoutCityImage = layoutSydney.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.sydneyharbourbridge);
        layoutCityTime = layoutSydney.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Australia/Sydney");


        // London
        ConstraintLayout layoutLondon = findViewById(R.id.layout_london1);
        layoutCityNameText = layoutLondon.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.London);
        layoutCityImage = layoutLondon.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.londonbigben);
        layoutCityTime = layoutLondon.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Europe/London");

        // Rio De Janeiro
        ConstraintLayout layoutRioDeJaneiro = findViewById(R.id.layout_riodejaneiro1);
        layoutCityNameText = layoutRioDeJaneiro.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.RioDeJaneiro);
        layoutCityImage = layoutRioDeJaneiro.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.riodejaneiro);
        layoutCityTime = layoutRioDeJaneiro.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Brazil/East");

        // Singpore
        ConstraintLayout layoutSingapore = findViewById(R.id.layout_singapore1);
        layoutCityNameText = layoutSingapore.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Singapore);
        layoutCityImage = layoutSingapore.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.singapore);
        layoutCityTime = layoutSingapore.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Asia/Singapore");

        // Ha Noi
        ConstraintLayout layoutVietnam = findViewById(R.id.layout_vietnam1);
        layoutCityNameText = layoutVietnam.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Vietnam);
        layoutCityImage = layoutVietnam.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.vietnamhalongbay);
        layoutCityTime = layoutVietnam.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Asia/Ho_Chi_Minh");

        // Washington DC
        ConstraintLayout layoutWashingtonDC = findViewById(R.id.layout_washingtondc1);
        layoutCityNameText = layoutWashingtonDC.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.WashingtonDC);
        layoutCityImage = layoutWashingtonDC.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.washingtondc);
        layoutCityTime = layoutWashingtonDC.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("US/Eastern");
    }

    //Making the buttons move from 24 hour activity to  12 hour activity
    public void onClick12hr(View v) {
        Intent intent12 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent12);
    }

    //Making the buttons move from 24 hour activity to  24 hour activity
    public void onClick24hr(View v) {
        Intent intent242 = new Intent(getApplicationContext(), TwentyFourHourTime.class);
        startActivity(intent242);
    }
}
