package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1= findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        Button button2= findViewById(R.id.btn1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1 = findViewById(R.id.et_1);
                et2 = findViewById(R.id.et_2);
                et3 = findViewById(R.id.et_3);
                String year = et1.getText().toString();
                Double a= Double.parseDouble(year);
                Double e=Math.E;
                Double c=0.28*(a-1960);
                Double b=4080*Math.pow(e ,c);
                java.text.DecimalFormat   df1   =new   java.text.DecimalFormat("#.00");
                String res1= df1.format(b);
                et2.setText(res1);
                Double P1=0.048*Math.pow(0.72,a-1974);
                java.text.DecimalFormat   df2   =new   java.text.DecimalFormat("#.00");
                String res2= df2.format(b);
                et3.setText(res2);

            }
        });
    }
}
