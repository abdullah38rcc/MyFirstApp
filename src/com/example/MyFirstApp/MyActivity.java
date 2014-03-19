package com.example.MyFirstApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView tv= (TextView) findViewById(R.id.textView);
        Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("hai sathish");
            }
        });
    }
}
