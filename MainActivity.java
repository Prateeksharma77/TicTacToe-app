package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edittext1,edittext2;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=findViewById(R.id.editTextTextPersonName);
        edittext2=findViewById(R.id.editTextTextPersonName2);
        btn_submit=findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=edittext1.getText().toString();
                String name2=edittext2.getText().toString();
                Intent i=new Intent(getApplicationContext(),game.class);
                i.putExtra("name1",name1);
                i.putExtra("name2",name2);
                startActivity(i);
            }
        });
    }
}