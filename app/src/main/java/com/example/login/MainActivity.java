package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //var creation and listener actions
        button=findViewById(R.id.loginbtn);
        button.setOnClickListener(v -> {onClick(v);});

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                onClickF(v);
            }
        });
    }

    public void onClickF(View view){
        Intent intent = new Intent(this, nopass.class);
        startActivity(intent);

    }
    public void onClick(View view) {
        EditText nameEditText = findViewById(R.id.namein);
        EditText passwordEditText = findViewById(R.id.passin);

        String name = nameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (name.equals("admin") && password.equals("admin")) {
            Intent intent = new Intent(this, dentro.class);
            startActivity(intent);
        }
    }
}