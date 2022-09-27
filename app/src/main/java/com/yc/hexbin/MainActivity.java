package com.yc.hexbin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtDecimalNumber;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDecimalNumber = findViewById(R.id.txtDecimalNumber);
        tvResult = findViewById(R.id.tvResult);
    }

    public void Binary(View view){
        long value = Integer.parseInt(txtDecimalNumber.getText().toString());
        String result = "";
        while (value > 0) {
            result = ((value % 2 == 0)?"0":"1" ) + result;
            value /= 2;
        }
        tvResult.setText("Binary: " + result);
    }

    public void Hexadecimal(View view){
        long value = Integer.parseInt(txtDecimalNumber.getText().toString());
        int range;
        String result = "";
        char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(value > 0) {
            range = value % 16;
            result = hexchars[range] + result;
            value = value / 16;
        }
        tvResult.setText("Hexadecimal: " + result);
    }
}