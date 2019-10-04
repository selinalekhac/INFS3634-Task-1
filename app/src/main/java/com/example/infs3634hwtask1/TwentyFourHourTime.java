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
    private TextClock twentyFourHrCityTime; // declares TextClock 2
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
        //twentyFourHrCityTime = layoutSydney.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("Australia/Sydney");


        // London
        ConstraintLayout layoutLondon = findViewById(R.id.layout_london1);
        layoutCityNameText = layoutLondon.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.London);
        layoutCityImage = layoutLondon.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.londonbigben);
        layoutCityTime = layoutLondon.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Europe/London");
        //twentyFourHrCityTime = layoutLondon.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("Europe/London");

        // Rio De Janeiro
        ConstraintLayout layoutRioDeJaneiro = findViewById(R.id.layout_riodejaneiro1);
        layoutCityNameText = layoutRioDeJaneiro.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.RioDeJaneiro);
        layoutCityImage = layoutRioDeJaneiro.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.riodejaneiro);
        layoutCityTime = layoutRioDeJaneiro.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Brazil/East");
        //twentyFourHrCityTime = layoutRioDeJaneiro.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("Brazil/East");


        // Singpore
        ConstraintLayout layoutSingapore = findViewById(R.id.layout_singapore1);
        layoutCityNameText = layoutSingapore.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Singapore);
        layoutCityImage = layoutSingapore.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.singapore);
        layoutCityTime = layoutSingapore.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Asia/Singapore");
        //twentyFourHrCityTime = layoutSingapore.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("Asia/Singapore");

        // Ha Noi
        ConstraintLayout layoutVietnam = findViewById(R.id.layout_vietnam1);
        layoutCityNameText = layoutVietnam.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Vietnam);
        layoutCityImage = layoutVietnam.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.vietnamhalongbay);
        layoutCityTime = layoutVietnam.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("Asia/Ho_Chi_Minh");
        //twentyFourHrCityTime = layoutVietnam.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("Asia/Ho_Chi_Minh");

        // Washington DC
        ConstraintLayout layoutWashingtonDC = findViewById(R.id.layout_washingtondc1);
        layoutCityNameText = layoutWashingtonDC.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.WashingtonDC);
        layoutCityImage = layoutWashingtonDC.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.washingtondc);
        layoutCityTime = layoutWashingtonDC.findViewById(R.id.text12_clock_id);
        layoutCityTime.setTimeZone("US/Eastern");
        //twentyFourHrCityTime = layoutWashingtonDC.findViewById(R.id.text24_clock_id);
        //twentyFourHrCityTime.setTimeZone("US/Eastern");
    }

    //Making the buttons move from activity to activity
    public void onClick12hr(View v) {
        Intent intent12 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent12);
    }
}
