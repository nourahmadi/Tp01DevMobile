package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button _btnSum;
    EditText _edtFirst,_edtSecond;
    TextView _txtRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btnSum = findViewById(R.id.btnSum);
        _edtFirst = findViewById(R.id.edtFirst);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtRes = findViewById(R.id.txtRes);


        _btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,sum;
                n1 = Integer.parseInt(_edtFirst.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                sum = n1 + n2;
                _txtRes.setText("Le résultat est : " + String.valueOf(sum));
            }
        });
    }
}