package rauchenwald.swengb.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import rauchenwald.swengb.listview.martialArts.Competitors;

/**
 * Created by Felix on 19/11/2016.
 */

public class CustomAdapter extends android.widget.BaseAdapter
{
    List<Competitors> listCompetitors;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Competitors> listUsers)
    {
        this.context = applicationContext;
        this.listCompetitors= listUsers;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() { return listCompetitors.size(); }

    @Override
    public Object getItem(int i) { return listCompetitors.get(i); }

    @Override
    public long getItemId(int i) { return i; }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName = (TextView)view.findViewById(R.id.textViewListName);
        TextView viewSize = (TextView)view.findViewById(R.id.textViewListSize);
        TextView viewWeight = (TextView)view.findViewById(R.id.textViewListWeight);
        TextView viewHealthPoints = (TextView)view.findViewById(R.id.textViewListHealthPoints);
        TextView viewMartialArt = (TextView)view.findViewById(R.id.textViewListMartialArt);

        Competitors competitor = listCompetitors.get(i);
        viewName.setText(competitor.getName());
        viewSize.setText(String.valueOf(competitor.getSize()));
        viewWeight.setText(String.valueOf(competitor.getWeight()));
        viewHealthPoints.setText(String.valueOf(competitor.getHealthPoints()));
        viewMartialArt.setText(competitor.getMartialArt().getName());

        return view;
    }
}
