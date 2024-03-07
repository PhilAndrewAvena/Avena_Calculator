package com.example.avena_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num;
    EditText nm1;
    EditText nm2;
    Button btnClick;
    Button btnClick2;
    Button btnClick3;
    Button btnClick4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (TextView) findViewById(R.id.txtNum);
        nm1 = (EditText) findViewById(R.id.num1);
        nm2 = (EditText) findViewById(R.id.num2);
        btnClick = (Button) findViewById(R.id.btn1);
        btnClick2 = (Button) findViewById(R.id.btn2);
        btnClick3 = (Button) findViewById(R.id.btn3);
        btnClick4 = (Button) findViewById(R.id.btn4);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String input1 = nm1.getText().toString();
                //int number = Integer.parseInt(input1);

               double myNum1 = Double.parseDouble(nm1.getText().toString());
               double myNum2 = Double.parseDouble(nm2.getText().toString());
               double sum = myNum1 + myNum2;


               num.setText(String.valueOf(sum));
               //result.setText(""+sum);
            }
        });
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(nm1.getText().toString());
                double myNum2 = Double.parseDouble(nm2.getText().toString());
                double dif = myNum1 - myNum2;

                num.setText(String.valueOf(dif));
            }
        });
        btnClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(nm1.getText().toString());
                double myNum2 = Double.parseDouble(nm2.getText().toString());
                double dif = myNum1 * myNum2;

                num.setText(String.valueOf(dif));

        btnClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(nm1.getText().toString());
                double myNum2 = Double.parseDouble(nm2.getText().toString());
                double dif = myNum1 / myNum2;

                num.setText(String.valueOf(dif));


            }
        });


        }
    });
    }
}