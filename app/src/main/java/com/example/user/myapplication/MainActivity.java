package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText ed_name,tt,ff;
    Button btnAc;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        this.setTitle("Nay Zin");

        ed_name=findViewById(R.id.edit_name);
        btnAc=findViewById(R.id.btn_Ac);


        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name =name+ed_name.getText().toString();
                ed_name.setText(name);
                Log.i("Name", name);
                Toast.makeText(getApplicationContext(),"Name   "+ name,Toast.LENGTH_LONG).show();
            }
        });
    }
}
