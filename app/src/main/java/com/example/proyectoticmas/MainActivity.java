package com.example.proyectoticmas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button compareButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        compareButton = findViewById(R.id.compareButton);
        resultTextView = findViewById(R.id.resultTextView);

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                boolean areEqual = text1.equals(text2);

                if (areEqual) {
                    resultTextView.setText("Ambos textos son iguales");
                } else {
                    resultTextView.setText("Los textos son diferentes");
                }
            }
        });
    }
}




