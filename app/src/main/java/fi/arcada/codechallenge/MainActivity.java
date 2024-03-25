package fi.arcada.codechallenge;

import android.annotation.SuppressLint;
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


    TextView outputText;
    EditText inputText;
    double[] values = {1,2,4,5,6,7,8,9,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText=findViewById(R.id.outText);
        inputText=findViewById(R.id.inputText);

        outputText.setText("Min app funkar!");


    }

    public void buttonHandler(View view) {
        String text =inputText.getText().toString();
        outputText.setText(text);
    }
    public void calculate(View view){
        String average = inputText.getText().toString();
        outputText.setText(average);
    }


}