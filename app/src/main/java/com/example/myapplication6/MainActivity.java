package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);
        TextView Result = (TextView) findViewById(R.id.result);
        Button B1 = (Button) findViewById(R.id.btnGCD);

        B1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1,n2,gcd=0;
                n1=Integer.parseInt(t1.getText().toString().trim());
                n2=Integer.parseInt(t2.getText().toString().trim());
                gcd=((n1 < n2) ? n1 : n2);
                while(gcd >0){
                    if(n1 % gcd == 0 && n2 % gcd ==0){
                        break;
                    }
                    gcd--;
                }
                Result.setText("GCD::"+n1+" and"+n2+" is"+gcd);
                Toast.makeText(MainActivity.this,"GCD is "+gcd, Toast.LENGTH_SHORT).show();
            }
        });
    }
}