package me.mattak.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.mattak.databindingsample.databinding.FragmentSample2Binding;

/**
 * Created by mattak on 15/07/15.
 */
public class Sample2Fragment extends Fragment {
    public static Sample2Fragment getInstance() {
        return new Sample2Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample2, container, false);

        FragmentSample2Binding binding = DataBindingUtil.bind(view);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return view;
    }
}
