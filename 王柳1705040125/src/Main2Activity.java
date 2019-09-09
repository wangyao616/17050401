package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1=(Button) findViewById(R.id.btn3);
        Button button2=(Button) findViewById(R.id.btn4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et4 = findViewById(R.id.et_4);
                et5 = findViewById(R.id.et_5);
                et6 = findViewById(R.id.et_6);
                et7 = findViewById(R.id.et_7);
                String year = et4.getText().toString();
                String money = et5.getText().toString();
                String code = et6.getText().toString();
                String num = et7.getText().toString();
                Double a= Double.parseDouble(year);
                Double mm= Double.parseDouble(money);
                Double code1= Double.parseDouble(money);
                Double num1= Double.parseDouble(money);
                Double e=Math.E;
                Double c=0.28*(a-1960);
                Double b=0.048*Math.pow(e ,c)*code1*0.01;
                Double res=num1*b*mm/300;
                java.text.DecimalFormat   df1   =new   java.text.DecimalFormat("#.00");
                String res1= df1.format(res);
                et8.setText(res1);
            }
        });
    }
}
