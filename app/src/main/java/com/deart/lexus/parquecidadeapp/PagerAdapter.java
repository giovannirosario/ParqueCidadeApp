package com.deart.lexus.parquecidadeapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        switch (arg0) {
            case 0:
                return new Sobre();
            case 1:
                return new ProgEventos();
            case 2:
                return new Esporte();
            case 3:
                return new Cultura();
            case 4:
                return new Turismo();
            case 5:
                return new FaleConosco();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 6;
    }

}