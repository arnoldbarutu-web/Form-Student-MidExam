package com.example.formstudent;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etStudentName, etStudentId;
    SeekBar seekBarAge;
    TextView tvStudentAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etStudentName = findViewById(R.id.etStudentName);
        etStudentId = findViewById(R.id.etStudentId);
        seekBarAge = findViewById(R.id.seekBarAge);
        tvStudentAge = findViewById(R.id.tvStudentAge);

        tvStudentAge.setText("Age: 17");

        seekBarAge.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(
                            SeekBar seekBar, int progress,
                            boolean fromUser) {

                        int age = 17 + progress;
                        tvStudentAge.setText(
                                "Student Age: " + age
                        );
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );
    }
}
