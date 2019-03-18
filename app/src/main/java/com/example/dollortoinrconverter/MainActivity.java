package com.example.dollortoinrconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {



        EditText dollarField = (EditText) findViewById(R.id.dollarField);

        dollarField.animate().scaleX(0.5f).setDuration(2000);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmount = dollarAmount * 68.61;

        Toast.makeText(getApplicationContext(), "₹" + poundAmount.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
