package sg.edu.rp.c346.id20039202.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Event handling in step 1
    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvQ2;
    Button btnRevealQ2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling in step 2
        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);


        //event handling in step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Add your event handling code button click action
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });

        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });
    }
}