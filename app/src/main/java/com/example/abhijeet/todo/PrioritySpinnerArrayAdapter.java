package com.example.abhijeet.todo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by Abhijeet on 9/13/2017.
 */

public class PrioritySpinnerArrayAdapter extends ArrayAdapter {


    public PrioritySpinnerArrayAdapter(@NonNull Context context) {
        super(context, R.layout.priority_list_item, R.id.priority_dropdown_textview);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.priority_list_item, parent, false);
        }

        TextView priorityTextview = (TextView) listItemView.findViewById(R.id.priority_dropdown_textview);

        if (position == 0) {
            priorityTextview.setText("NO");
        } else if (position == 1) {
            priorityTextview.setText("LOW");
        } else if (position == 2) {
            priorityTextview.setText("MED");
        } else {
            priorityTextview.setText("HIGH");
        }
        return listItemView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.priority_list_item, parent, false);
        }

        TextView priorityTextview = (TextView) listItemView.findViewById(R.id.priority_dropdown_textview);

        if (position == 0) {
            priorityTextview.setText("NO");
        } else if (position == 1) {
            priorityTextview.setText("LOW");
        } else if (position == 2) {
            priorityTextview.setText("MED");
        } else {
            priorityTextview.setText("HIGH");
        }
        return listItemView;
    }

    @Override
    public void setDropDownViewResource(@LayoutRes int resource) {
        super.setDropDownViewResource(R.layout.priority_list_item);
    }
}
