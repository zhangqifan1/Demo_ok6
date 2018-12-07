package com.as.demo_ok6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.as.demo_ok6.coverflow.CoverFlowLayoutManger;
import com.as.demo_ok6.coverflow.RecyclerCoverFlow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerCoverFlow recycler_coverflow = findViewById(R.id.recycler_coverflow);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add("我是第" + i + "条!");
        }
        SampleAdapter sampleAdapter = new SampleAdapter(R.layout.item_text, list);
        recycler_coverflow.setAdapter(sampleAdapter);

        recycler_coverflow.setOnItemSelectedListener(new CoverFlowLayoutManger.OnSelected() {
            @Override
            public void onItemSelected(int position) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
