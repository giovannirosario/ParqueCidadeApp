package com.deart.lexus.parquecidadeapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;


public class MainActivity extends FragmentActivity {
    ViewPager viewpager;
    PagerAdapter padapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) findViewById(R.id.pager);
        padapter = new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);
    }

    public void open_tab(View view) {
        ListView x;
        ImageButton y;
        switch (viewpager.getCurrentItem()) {
            case 0:
                x = (ListView) findViewById(R.id.list_view_sobre);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_sobre);
                y.setVisibility(View.VISIBLE);
                return;
            case 1:
                x = (ListView) findViewById(R.id.list_view_prog);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_prog);
                y.setVisibility(View.VISIBLE);
                return;
            case 2:
                x = (ListView) findViewById(R.id.list_view_esporte);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_esporte);
                y.setVisibility(View.VISIBLE);
                return;
            case 3:
                x = (ListView) findViewById(R.id.list_view_cultura);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_cultura);
                y.setVisibility(View.VISIBLE);
                return;
            case 4:
                x = (ListView) findViewById(R.id.list_view_turismo);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_turismo);
                y.setVisibility(View.VISIBLE);
                return;
            case 5:
                x = (ListView) findViewById(R.id.list_view_fale);
                x.setVisibility(View.VISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_fale);
                y.setVisibility(View.VISIBLE);
                return;
        }
    }

    public void close_tab(View view) {
        ListView x;
        ImageButton y;
        switch (viewpager.getCurrentItem()) {
            case 0:
                x = (ListView) findViewById(R.id.list_view_sobre);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_sobre);
                y.setVisibility(View.INVISIBLE);
                return;
            case 1:
                x = (ListView) findViewById(R.id.list_view_prog);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_prog);
                y.setVisibility(View.INVISIBLE);
                return;
            case 2:
                x = (ListView) findViewById(R.id.list_view_esporte);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_esporte);
                y.setVisibility(View.INVISIBLE);
                return;
            case 3:
                x = (ListView) findViewById(R.id.list_view_cultura);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_cultura);
                y.setVisibility(View.INVISIBLE);
                return;
            case 4:
                x = (ListView) findViewById(R.id.list_view_turismo);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_turismo);
                y.setVisibility(View.INVISIBLE);
                return;
            case 5:
                x = (ListView) findViewById(R.id.list_view_fale);
                x.setVisibility(View.INVISIBLE);
                y = (ImageButton) findViewById(R.id.close_button_fale);
                y.setVisibility(View.INVISIBLE);
                return;

        }
    }
}


