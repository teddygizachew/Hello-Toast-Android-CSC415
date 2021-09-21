package com.nkufall2021.helloconstraint;

import static android.graphics.BlendMode.COLOR;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private int zeroCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        Button zeroCountBtn = findViewById(R.id.button_zero);
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if (mCount % 2 == 0) {
                view.setBackgroundColor(Color.GREEN);
            }
            else {
                view.setBackgroundColor(Color.RED);
            }
            zeroCountBtn.setBackgroundColor(Color.parseColor("#ff748c"));
        }
    }

    public void countZero(View view) {
        Button countBtn = findViewById(R.id.button_count);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(zeroCount));
            mCount = 0;
            view.setBackgroundColor(Color.GRAY);
            countBtn.setBackgroundColor(Color.parseColor("#6200EE"));
        }
    }
}