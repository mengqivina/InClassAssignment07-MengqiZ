package com.example.mac.inclassassignment07_mengqiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {


    private EditText name;
    private EditText age;
    private CheckBox isSingle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (EditText) findViewById(R.id.name_field);
        age = (EditText) findViewById(R.id.age_field);
        isSingle = (CheckBox) findViewById(R.id.single_field);
    }

    public void submit(View view) {
        String theName = name.getText().toString();
        String ageString = age.getText().toString();
        int theAge = Integer.parseInt(ageString);
        String isSingleString = isSingle.getText().toString();
        boolean isSingle = Boolean.parseBoolean(isSingleString);

        People people = new People(theName, theAge, isSingle);
        Intent data = new Intent();
        data.putExtra(Keys.PEOPLE, people);
        setResult(RESULT_OK, data);
        finish();
    }

}

