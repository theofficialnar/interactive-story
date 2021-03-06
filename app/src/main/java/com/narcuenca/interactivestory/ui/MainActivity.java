package com.narcuenca.interactivestory.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.narcuenca.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.nameEditText);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the value of the input field and start a new activity
                String name = nameField.getText().toString();
                startStory(name);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Clear the name input field
        // when user click back
        nameField.setText("");
    }

    // Starts a new activity
    private void startStory(String name) {
        // Create & start a new intent to launch a new activity
        Intent intent = new Intent(this, StoryActivity.class);

        // Get string from resources
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);

        // Add data into the intent
        intent.putExtra(key, name);
        startActivity(intent);
    }
}
