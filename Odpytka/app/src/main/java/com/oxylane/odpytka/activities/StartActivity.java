package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.oxylane.odpytka.R;

public class StartActivity extends AppCompatActivity {

    private TextView worker_category_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        worker_category_tv = (TextView) findViewById(R.id.worker_category_tv);



        worker_category_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),DetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}