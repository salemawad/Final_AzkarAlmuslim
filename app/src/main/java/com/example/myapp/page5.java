package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class page5 extends AppCompatActivity {
    private CheckBox checkBox;
    private Button button;
    private Switch  aaSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        button=findViewById(R.id.logo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log=new Intent(page5.this,page3.class);
                startActivity(log);
            }
        });
        checkBox=findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(page5.this, "تم حفظ بياناتك", Toast.LENGTH_SHORT).show();
            }
        });

        aaSwitch=findViewById(R.id.switch1);
        aaSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    Intent intent=new Intent(page5.this,homepage.class);
                    startActivity(intent);
                    finish();

                }
            }
        });



    }
}