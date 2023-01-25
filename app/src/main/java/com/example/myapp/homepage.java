package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class homepage extends AppCompatActivity {
    private CheckBox checkBox;
    private Button button;
    private RadioButton radioButton;
    private Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        button=findViewById(R.id.logo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log=new Intent(homepage.this,page3.class);
                startActivity(log);
            }
        });
        checkBox=findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homepage.this, "تم حفظ بياناتك", Toast.LENGTH_SHORT).show();
            }
        });

        aSwitch=findViewById(R.id.switch1);
       aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if (isChecked==true){
                    Intent intent=new Intent(homepage.this,page5.class);
                   startActivity(intent);
                   finish();

              }
           }
        });


    }

}