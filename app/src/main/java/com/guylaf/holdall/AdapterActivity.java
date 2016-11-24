package com.guylaf.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        List<String> list = new ArrayList<>();
        list.add("toto");
        list.add("tata");
        list.add("titi");

        TestAdapter t = new TestAdapter(this);
        t.setList(list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(t);

        t.notifyDataSetChanged();
    }
}
