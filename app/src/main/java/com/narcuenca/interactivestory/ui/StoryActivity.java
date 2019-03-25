package com.narcuenca.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.narcuenca.interactivestory.R;
import com.narcuenca.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        // Get the passed data from intent
        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if(name == null || name.isEmpty()) {
            name = "Friend";
        }
        Log.d(TAG, name);
    }
}