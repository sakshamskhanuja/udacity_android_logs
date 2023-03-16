package com.basic.logs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Stores the class name.
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method is invoked when "Print Menu To Logs" Button is pressed.
     */
    public void printToLogs(View view) {
        // Prints "Mango sorbet" to logs.
        TextView mangoSorbetTextView = findViewById(R.id.menu_item_1);
        Log.v(TAG, mangoSorbetTextView.getText().toString());

        // Prints "Blueberry pie" to logs.
        TextView blueberryPieTextView = findViewById(R.id.menu_item_2);
        Log.v(TAG, blueberryPieTextView.getText().toString());

        // Prints "Chocolate lava cake" to logs.
        TextView chocolateLavaCakeTextView = findViewById(R.id.menu_item_3);
        Log.v(TAG, chocolateLavaCakeTextView.getText().toString());
    }
}