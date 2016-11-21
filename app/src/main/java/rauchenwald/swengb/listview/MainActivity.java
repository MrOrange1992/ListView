package rauchenwald.swengb.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import rauchenwald.swengb.listview.martialArts.Competitors;
import rauchenwald.swengb.listview.martialArts.forms.*;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    private List<Competitors> competitorsList;
    private ListView competitorView;
    private CustomAdapter myAdapter;


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Competitors selectedCompetitor = competitorsList.get(i);
        Intent intent = new Intent(view.getContext(),ShowCompetitorActivity.class);
        intent.putExtra("competitor", selectedCompetitor);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        competitorView = (ListView) findViewById(R.id.listViewCompetitors);


        MMA mma = new MMA("Mixed Martial Arts", "USA",
                new HashSet<>(Arrays.asList("Jab", "Cross", "Hook", "Upper Cut")),
                new HashSet<>(Arrays.asList("Low Kick", "High Kick", "Side Kick", "Front Kick")),
                new HashSet<>(Arrays.asList("Single Leg", "Double Leg", "Body Lock"))
        );

        WingChun wingChun = new WingChun("Wing Chun", "South China",
                new HashSet<>(Arrays.asList("Fook Sao", "Bong Sao", "Pak Sao", "Lap Sao")),
                new HashSet<>(Arrays.asList("Jap Gerk", "Bong Gerk", "Front Kick")),
                new HashSet<>(Arrays.asList("Single Leg", "Double Leg"))
        );

        BJJ bjj = new BJJ("Brazillian Jiu Jitsu", "Brazil",
                new HashSet<>(Arrays.asList("Snap Punch", "Wrist Grab", "Arm Lock")),
                new HashSet<>(Arrays.asList("Snap Kick", "Side Kick")),
                new HashSet<>(Arrays.asList("Flying Triangle", "Drop Seoi Nage", "Guard Pull"))
        );

        competitorsList = new ArrayList<>();
        competitorsList.add(new Competitors("Conor McGregor", 180, 150, 20, mma, "https://de.wikipedia.org/wiki/Conor_McGregor"));
        competitorsList.add(new Competitors("Royce Gracie", 175, 145, 14, bjj, "https://de.wikipedia.org/wiki/Royce_Gracie"));
        competitorsList.add(new Competitors("Bruce Lee", 165, 140, 24, mma, "https://de.wikipedia.org/wiki/Bruce_Lee"));
        competitorsList.add(new Competitors("Yip Man", 160, 120, 18, wingChun, "https://de.wikipedia.org/wiki/Yip_Man"));


        myAdapter = new CustomAdapter(this,competitorsList);

        competitorView.setAdapter(myAdapter);

        competitorView.setOnItemClickListener(this);
    }
}
