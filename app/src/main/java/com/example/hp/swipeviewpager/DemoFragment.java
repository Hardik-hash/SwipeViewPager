package com.example.hp.swipeviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.PrivateKey;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {
    private TextView text;


    public DemoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        text=view.findViewById(R.id.text);

        String message = getArguments().getString("Message");
        text.setText(message);
        return view;
    }

}
