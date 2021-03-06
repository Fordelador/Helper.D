package com.example.davils.helperd.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.davils.helperd.R;

public class ExampleFragment extends Fragment{
    private static final int LAYOUT = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstans() {
        Bundle args=new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view=inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
