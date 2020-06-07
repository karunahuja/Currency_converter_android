package com.example.karun.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertcurrency(View view){
        Log.i("info","ButtonPressed");

        EditText editText=(EditText) findViewById(R.id.nameEditText);

        String amountInPounds= editText.getText().toString();

        double amountinpoundsdouble=Double.parseDouble(amountInPounds);
        double amountindollars=amountinpoundsdouble*1.3;

        String amountfinal=String.format("%.2f",amountindollars);

        Toast.makeText(this, "The amount in dollars will be "+ amountfinal, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
