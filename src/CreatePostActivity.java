package com.example.seuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreatePostActivity extends AppCompatActivity {

    private EditText postContent;
    private Button postButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        postContent = findViewById(R.id.post_content);
        postButton = findViewById(R.id.post_button);

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = postContent.getText().toString();
                if (!content.isEmpty()) {
                    Toast.makeText(CreatePostActivity.this, "Postagem criada!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CreatePostActivity.this, "Conteúdo vazio!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
