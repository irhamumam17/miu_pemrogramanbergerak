package com.miucomp.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilFragment extends Fragment {


    public ProfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_profil,null);
//        TextView tvName = root.findViewById(R.id.txtTitleName);
//        TextView tvAddress = root.findViewById(R.id.txtTitleAddress);
//        TextView tvHobby = root.findViewById(R.id.txtTitleHobby);
//        TextView tvQuotes = root.findViewById(R.id.txtTitleQuote);
//
//        int goal1 = 2;
//        int goal2 = 0;
////        String football = String.format(getResources().getString(R.string.goal),"Lilipaly","Irham Bachdim",goal1,goal2);
////        tvGoal.setText(football);
//
//        int songCount = 5;
//        String pluralText = getResources().getQuantityString(R.plurals.numberOfSongsAvailable,songCount,songCount);
////        tvPlural.setText(pluralText);
////        tvXliff.setText(getResources().getString(R.string.app_homeurl));
        return root;
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_profil, container, false);
    }

}
