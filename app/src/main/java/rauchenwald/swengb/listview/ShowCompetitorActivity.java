package rauchenwald.swengb.listview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import rauchenwald.swengb.listview.martialArts.Competitors;

public class ShowCompetitorActivity extends AppCompatActivity {

    private Competitors competitor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_competitor);

        Intent intent = getIntent();
        competitor = (Competitors) intent.getExtras().get("competitor");

        TextView viewName = (TextView) findViewById(R.id.txtViewName);
        TextView viewSize = (TextView) findViewById(R.id.txtViewSize);
        TextView viewWeight = (TextView) findViewById(R.id.txtViewWeight);
        TextView viewHealthPoints = (TextView) findViewById(R.id.txtViewHealthPoints);
        TextView viewMartialArts = (TextView) findViewById(R.id.txtViewMartialArt);


        viewName.setText(competitor.getName());
        viewSize.setText(String.valueOf(competitor.getSize()));
        viewWeight.setText(String.valueOf(competitor.getWeight()));
        viewHealthPoints.setText(String.valueOf(competitor.getHealthPoints()));
        viewMartialArts.setText(competitor.getMartialArt().getName());
    }
}
