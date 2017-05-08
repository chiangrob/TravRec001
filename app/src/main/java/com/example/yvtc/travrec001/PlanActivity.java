package com.example.yvtc.travrec001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ExpandableListView;

public class PlanActivity extends AppCompatActivity {
    ExpandableListView elv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        elv= (ExpandableListView)findViewById(R.id.elistView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("新增規劃項目");
        menu.add("修改規劃項目");



        return super.onCreateOptionsMenu(menu);

    }
}
