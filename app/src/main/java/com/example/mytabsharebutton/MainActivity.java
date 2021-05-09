package com.example.mytabsharebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button expert_btn_share;
    EditText expert_et_share_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expert_btn_share = (Button)findViewById(R.id.button_share);
        expert_et_share_msg = (EditText)findViewById(R.id.expert_edittext_share_msg);

        expert_btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String body = expert_et_share_msg.getText().toString();
                intent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(intent,"Share using"));


            }
        });
    }
}