package com.solipsism.seekpick.Dash;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solipsism.seekpick.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyProductsFragment extends Fragment {


    public MyProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_my_products, container, false);


        return rootView;
    }

}