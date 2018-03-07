package com.example.mac.inclassassignment07_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<People> peopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peopleList= new ArrayList<>();
    }

    public void addPerson(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, Keys.REQUEST_ADD_PERSON);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.REQUEST_ADD_PERSON && resultCode == RESULT_OK) {
            People people = (People) data.getSerializableExtra(Keys.PEOPLE);
            peopleList.add(people);
            TextView printOut = (TextView) findViewById(R.id.print_field);
            String output = "";
            for (int i = 0; i < peopleList.size(); i++){
                output = output + peopleList.get(i).toString() + "\n";
            }
            printOut.setText(output);
        }
    }
}

