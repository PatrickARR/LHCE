package com.colinries.lhce;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ChangesFragment extends Fragment {

    public ChangesFragment() {
        // Required empty public constructor
    }
    public static ChangesFragment newInstance(String param1, String param2) {
        ChangesFragment fragment = new ChangesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_changes, container, false);

        return layout;
    }
}
