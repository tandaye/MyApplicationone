package com.tc1016.myapplicationone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText User_name;
    private EditText User_pwd;
    private EditText User_email;
    private Button User_register;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置下拉框
        Spinner spinner = null;
        spinner = (Spinner) this.findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, new String[] { "贵州大学北校区",
                "贵州大学南校区", "贵州大学东校区", "贵州大学西校区" });

        //设置下拉样式
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);


//        User_name = (EditText) findViewById(R.id.name);
//        User_pwd = (EditText) findViewById(R.id.pwd);
//        User_email = (EditText) findViewById(R.id.email);






    }

}