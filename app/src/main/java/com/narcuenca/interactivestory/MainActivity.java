package com.narcuenca.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    // Starts a new activity
    private void startStory(String name) {
        // Create & start a new intent to launch a new activity
        Intent intent = new Intent(this, StoryActivity.class);
        // Add data into the intent
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
