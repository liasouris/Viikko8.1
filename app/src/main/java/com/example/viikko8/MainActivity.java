package com.example.viikko8;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textOutput;
    private EditText firstNumberInput;
    private EditText secondNumberInput;

    private double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        firstNumberInput = findViewById(R.id.editFirstNumber);
        secondNumberInput = findViewById(R.id.editSecondNumber);
        textOutput = findViewById(R.id.textSeeResult);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void plusButton(View view) {
        result = Double.parseDouble(firstNumberInput.getText().toString()) + Double.parseDouble(secondNumberInput.getText().toString());
        textOutput.setText(String.valueOf(result));

    }

    public void minusButton(View view) {
        result = Double.parseDouble(firstNumberInput.getText().toString()) - Double.parseDouble(secondNumberInput.getText().toString());
        textOutput.setText(String.valueOf(result));
    }

    public void multiplyButton(View view) {
        result = Double.parseDouble(firstNumberInput.getText().toString()) * Double.parseDouble(secondNumberInput.getText().toString());
        textOutput.setText(String.valueOf(result));
    }

    public void divideButton(View view) {
        result = Double.parseDouble(firstNumberInput.getText().toString()) / Double.parseDouble(secondNumberInput.getText().toString());
        textOutput.setText(String.valueOf(result));
    }
}



