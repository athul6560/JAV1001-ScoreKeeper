package com.zeezaglobal.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Athul Babu - A00244116
    //Meghna Aravind - A00256942
    private ImageButton addScore, reduceScore;
    private Switch teamSwitch;
   private Spinner spinner;
   private TextView score_a,score_b;
   //store the score value as two variables
   private int score_valuea=0,score_valueb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating a function for initialising the components
        initComponents();

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.score_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        addScore.setOnClickListener(view -> {
            if(!teamSwitch.isChecked()){
                //getting the spinner value and converting it into integer value to do the calculation
                score_valuea= score_valuea+ Integer.parseInt(spinner.getSelectedItem().toString());
                score_a.setText(score_valuea+"");
            }else{
                score_valueb=score_valueb+Integer.parseInt(spinner.getSelectedItem().toString());
                score_b.setText(score_valueb+"");
            }

        });
        //same as the add logic
        reduceScore.setOnClickListener(view -> {
            if(!teamSwitch.isChecked()){
                score_valuea=score_valuea-Integer.parseInt(spinner.getSelectedItem().toString());
                score_a.setText(score_valuea+"");
            }else{
                score_valueb=score_valueb-Integer.parseInt(spinner.getSelectedItem().toString());
                score_b.setText(score_valueb+"");
            }
        });


    }

    private void initComponents() {
        spinner = (Spinner) findViewById(R.id.score_spinner);
        addScore=findViewById(R.id.score_add_btn);
        reduceScore=findViewById(R.id.score_sub_btn);
        score_a=findViewById(R.id.score_a);
        score_b=findViewById(R.id.score_b);
        teamSwitch=findViewById(R.id.team_switch);

    }
}