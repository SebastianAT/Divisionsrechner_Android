package com.example.sebit.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Berechnung(View v) {

        EditText Objekt01 = (EditText) findViewById(R.id.zahl01);   // Obejkt Variable erstellen mit R.Id auf layout zugreifen und zahl01 holen also verweiß
        EditText Objekt02 = (EditText) findViewById(R.id.zahl02);
        EditText Objekt03 = (EditText) findViewById(R.id.zahl03);

        Double nummer01 = Double.parseDouble(Objekt01.getText().toString());  // hier wird mit getText auf objekt zugegriffen und mit .toString auf string gewandelt
        Double nummer02 = Double.parseDouble(Objekt02.getText().toString());  // danach expliziete umwandlung in Double Wert

        try {

            Objekt03.setText(String.valueOf(nummer01 / nummer02));

        } catch (ArithmeticException e) {
            Objekt03.setText("Div / 0 nicht möglich! ");
        }
    }
}

  /*  public static double DividiereDouble (double dividend, double divisor) throws DivisonDurchNullException{
        double ergebnis = 0;

        if(divisor != 0){
            ergebnis = dividend/divisor;
        }
        else {
            throw new DivisonDurchNullException();
        }
        return ergebnis;
    }

}

 class DivisonDurchNullException extends Exception{

     DivisonDurchNullException() {

         super("Div / 0 nicht möglich!");
     }

}

  */