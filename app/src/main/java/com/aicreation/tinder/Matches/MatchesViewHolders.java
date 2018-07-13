package com.aicreation.tinder.Matches;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.aicreation.tinder.R;

import org.w3c.dom.Text;

public class MatchesViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView mMatchid;

    public MatchesViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        mMatchid = (TextView) itemView.findViewById(R.id.Matchid);
    }

    @Override
    public void onClick(View v) {

    }
}
