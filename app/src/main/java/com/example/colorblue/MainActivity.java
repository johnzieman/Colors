package com.example.colorblue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textViewColorDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textViewColorDescription = findViewById(R.id.textViewColor);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description  = getDescriptionPosition(position);
        textViewColorDescription.setText(description);
    }

    private String getDescriptionPosition(int position){
        String[] descriptions = getResources().getStringArray(R.array.description_of_temp);
        return descriptions[position];
    }
}
