package com.example.android.pickcountry;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner customSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Malaysia", R.drawable.malaysia));
        countries.add(new Country("Korea", R.drawable.south_korea));
        countries.add(new Country("Argentina", R.drawable.argentina));
        countries.add(new Country("Australia", R.drawable.australia));
        countries.add(new Country("Japan", R.drawable.japan));
        countries.add(new Country("United Kingdom", R.drawable.united_kingdom));

        customSpinner = (Spinner)findViewById(R.id.custom_spinner);
        SpinnerAdapter adapter = new SpinnerAdapter(this, countries);
        customSpinner.setAdapter(adapter);
        customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                switch (position){
                    case 0:
                        intent.setData(Uri.parse("geo:4.213155, 103.402914"));
                        break;
                    case 1:
                        intent.setData(Uri.parse("geo:36.593562, 127.040436"));
                        break;
                    case 2:
                        intent.setData(Uri.parse("geo:-34.883324, -65.140799"));
                        break;
                    case 3:
                        intent.setData(Uri.parse("geo:-24.372645, 131.823709"));
                        break;
                    case 4:
                        intent.setData(Uri.parse("geo:36.875761, 138.729092"));
                        break;
                    case 5:
                        intent.setData(Uri.parse("geo:54.887410, -2.913750"));
                        break;
                }

                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
