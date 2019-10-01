package com.example.infs3634hwtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity {

    private TextView layoutCityNameText; //declares TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Naming the City of Each Chunk Layout

        ConstraintLayout layoutSydney = findViewById(R.id.layout_sydney);
        layoutCityNameText = layoutSydney.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.sydney);

        ConstraintLayout layoutLondon = findViewById(R.id.layout_london);
        layoutCityNameText = layoutLondon.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.London);

        ConstraintLayout layoutRioDeJaneiro = findViewById(R.id.layout_riodejaneiro);
        layoutCityNameText = layoutRioDeJaneiro.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.RioDeJaneiro);

        ConstraintLayout layoutSingapore = findViewById(R.id.layout_singapore);
        layoutCityNameText = layoutSingapore.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Singapore);

        ConstraintLayout layoutVietnam = findViewById(R.id.layout_vietnam);
        layoutCityNameText = layoutVietnam.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.Vietnam);

        ConstraintLayout layoutWashingtonDC = findViewById(R.id.layout_washingtondc);
        layoutCityNameText = layoutWashingtonDC.findViewById(R.id.city_textview_id);
        layoutCityNameText.setText(R.string.WashingtonDC);
/*
        ConstraintLayout layoutSydney = findViewById(R.id.layout_sydney);

        TextView layoutSydneyText = layoutSydney.findViewById(R.id.city_textview_id);
        layoutSydneyText.setText(R.string.Sydney);

        ImageView layoutSydneyImage = layoutSydney.findViewById(R.id.city_imageview_id);
        layoutSydneyImage.setImageResource(R.drawable.sydneyharbourbridge);

 */

/*
        ConstraintLayout layoutSydney = findViewById(R.id.layout_Sydney);
        layoutSydneyText = layoutSydney.findViewById(R.id.cityTextView);
        layoutSydneyText.setText(R.string.sydney);
        layoutSydneyImage = layoutSydney.findViewById(R.id.cityImageView);
        layoutSydneyImage.setImageResource(R.drawable.sydneyharbourbridge);
        */
    }



/*
From the Lecture Slides

    ConstraintLayout buttonTrain = findViewById(R.id.buttonTrain);
    TextView buttonTrainText = buttonTrain.findViewById(R.id.tv__text);
    buttonTrainText.setText(R.string.train);
    ImageView buttonTrainImage = buttonTrain.findViewById(R.id.iv_pic);
    buttonTrainImage.setImageResource(R.drawable.train):
*/

 /*
   Time hasn't been attempted yet
   --> What do you put in the findBtViewId () Lerma0

    FOR SYDNEY
    ConstraintLayout buttonSydney = findViewById(R.id.buttonSydney);
    TextView buttonSydneyText = buttonSydney.findViewById(R.id.);
    buttonSydneyText.setText(R.string.Sydney)
    ImageView buttonSydneyImage = buttonSydney.findViewById(R.id.);
    buttonSydneyImage.setImageResource(R.drawable.sydneyharbourbridge);

    FOR WASHINGTON DC
    ConstraintLayout buttonWashingtonDC = findViewById(R.id.buttonWashingtonDC);
    TextView buttonWashingtonDCText = buttonWashingtonDC.findViewById(R.id.);
    buttonWashingtonDCText.setText(R.string.WashingtonDC)
    ImageView buttonWashingtonDCImage = buttonWashingtonDC.findViewById(R.id.);
    buttonWashingtonDCImage.setImageResource(R.drawable.washingtondc);

    FOR SINGAPORE
    ConstraintLayout buttonSingapore = findViewById(R.id.buttonSingapore);
    TextView buttonSingaporeText = buttonSingapore.findViewById(R.id.);
    buttonSingaporeText.setText(R.string.Singapore)
    ImageView buttonSingaporeImage = buttonSingapore.findViewById(R.id.);
    buttonSingaporeImage.setImageResource(R.drawable.singapore);

    FOR VIETNAM
    ConstraintLayout buttonVietnam = findViewById(R.id.buttonVietnam);
    TextView buttonVietnamText = buttonVietnam.findViewById(R.id.);
    buttonVietnamText.setText(R.string.Vietnam)
    ImageView buttonVietnamImage = buttonVietnam.findViewById(R.id.);
    buttonVietnamImage.setImageResource(R.drawable.vietnamehalongbay);

    FOR RIO DE JANEIRO
    ConstraintLayout buttonRioDeJaneiro = findViewById(R.id.buttonRioDeJaneiro);
    TextView buttonRioDeJaneiroText = buttonRioDeJaneiro.findViewById(R.id.);
    buttonRioDeJaneiroText.setText(R.string.RioDeJaneiro)
    ImageView buttonRioDeJaneiroImage = buttonRioDeJaneiro.findViewById(R.id.);
    buttonRioDeJaneiroImage.setImageResource(R.drawable.riodejaneiro);


`*/

}
