package com.aicreation.tinder.Matches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aicreation.tinder.MainActivity;
import com.aicreation.tinder.R;

import java.util.ArrayList;
import java.util.List;

public class MatchesActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mMatchesAdapter;
    private RecyclerView.LayoutManager mMatchesLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        mMatchesLayoutManager = new LinearLayoutManager(MatchesActivity.this);
        mRecyclerView.setLayoutManager(mMatchesLayoutManager);
        mMatchesAdapter = new MatchesAdapter(getDataSetMatches(), MatchesActivity.this);
        mRecyclerView.setAdapter(mMatchesAdapter);


       for (int i=0;i<100;i++){
           MatchesObject obj = new MatchesObject(Integer.toString(i));
           resultMatches.add(obj);

       }

        mMatchesAdapter.notifyDataSetChanged();
    }



    private ArrayList<MatchesObject> resultMatches = new ArrayList<MatchesObject>();
    private List<MatchesObject> getDataSetMatches() {
            return resultMatches;
    }
}
