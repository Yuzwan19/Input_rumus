package com.dev.izcax.inputrumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText alas, tinggi;
    Button hasil, clear;
    TextView texthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alas = (EditText) findViewById(R.id.editTextalas);
        tinggi = (EditText) findViewById(R.id.editTexttinggi);
        hasil = (Button) findViewById(R.id.buttonhasil);
        clear = (Button) findViewById(R.id.buttonclear);
        texthasil = (TextView) findViewById(R.id.texthasil);
        hasil.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == hasil)
        {
            alas.setError(null);
            tinggi.setError(null);
            if (TextUtils.isEmpty(alas.getText().toString())) {
                alas.setError("nilai alas tdk blh kosong");
                alas.requestFocus();
            } else if (TextUtils.isEmpty(tinggi.getText().toString())) {
                tinggi.setError("nilai tinggi tdk boleh kosong ");
                tinggi.requestFocus();
            } else {
                double nilai1 = Double.parseDouble(alas.getText().toString()); //konversi str2double
                double nilai2 = Double.parseDouble(tinggi.getText().toString());
                double result = 0.5 * nilai1 * nilai2;
                texthasil.setText("Luas :" + result);
            }
        }
        else{
            tinggi.setText("");
            alas.setText("");
        }
    }
}
