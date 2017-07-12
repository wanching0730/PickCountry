package com.example.android.pickcountry;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter {

    public SpinnerAdapter(Activity context, ArrayList<Country> countries){
        super(context, 0, countries);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View spinnerItem = convertView;

        if(spinnerItem == null){
            spinnerItem = LayoutInflater.from(getContext()).inflate(R.layout.spinner_rows, parent, false);
        }

        Country tempCountry = (Country) getItem(position);

        ImageView image = (ImageView) spinnerItem.findViewById(R.id.imageView);
        TextView text = (TextView) spinnerItem.findViewById(R.id.textView);

        image.setImageResource(tempCountry.getCountryImage());
        image.setVisibility(View.VISIBLE);
        text.setText(tempCountry.getCountryName());

        return spinnerItem;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }
}
