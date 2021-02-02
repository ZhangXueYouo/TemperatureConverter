package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private Button CF,FC;
    private TextView result;
    private EditText enterTemp;
    double resultTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CF = findViewById(R.id.CF);
        FC = findViewById(R.id.FC);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);
        DecimalFormat df = new DecimalFormat("#.##");

        CF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                resultTemp = (temp*1.8) +32;
                result.setText( (df.format(resultTemp)) + " °F");

            }

        });

        FC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                resultTemp = (temp -32 ) / 1.8;
                result.setText((df.format(resultTemp)) + " °C");
            }
        });



    }
}