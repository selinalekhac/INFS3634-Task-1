package com.example.infs3634hwtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DigitalClock;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private TextView layoutCityNameText; //declares TextView
    private ImageView layoutCityImage; // declares ImageView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Individualising each reusable layout with their respective city name, and identifying picture

        // Sydney
        ConstraintLayout layoutSydney = findViewById(R.id.layout_sydney);
        layoutCityNameText = layoutSydney.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.sydney);
        layoutCityImage = layoutSydney.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.sydneyharbourbridge);



        // London
        ConstraintLayout layoutLondon = findViewById(R.id.layout_london);
        layoutCityNameText = layoutLondon.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.London);
        layoutCityImage = layoutLondon.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.londonbigben);

        // Rio De Janeiro
        ConstraintLayout layoutRioDeJaneiro = findViewById(R.id.layout_riodejaneiro);
        layoutCityNameText = layoutRioDeJaneiro.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.RioDeJaneiro);
        layoutCityImage = layoutRioDeJaneiro.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.riodejaneiro);

        // Singpore
        ConstraintLayout layoutSingapore = findViewById(R.id.layout_singapore);
        layoutCityNameText = layoutSingapore.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Singapore);
        layoutCityImage = layoutSingapore.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.singapore);

        // Ha Noi
        ConstraintLayout layoutVietnam = findViewById(R.id.layout_vietnam);
        layoutCityNameText = layoutVietnam.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Vietnam);
        layoutCityImage = layoutVietnam.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.vietnamhalongbay);

        // Washington DC
        ConstraintLayout layoutWashingtonDC = findViewById(R.id.layout_washingtondc);
        layoutCityNameText = layoutWashingtonDC.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.WashingtonDC);
        layoutCityImage = layoutWashingtonDC.findViewById(R.id.city_imageview_id);
        layoutCityImage.setImageResource(R.drawable.washingtondc);



    }





}
