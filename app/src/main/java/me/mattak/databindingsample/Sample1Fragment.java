package me.mattak.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.mattak.databindingsample.databinding.FragmentSample1Binding;
import me.mattak.databindingsample.entity.User;

public class Sample1Fragment extends Fragment {
    public static Sample1Fragment getInstance() {
        return new Sample1Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample1, container, false);

        FragmentSample1Binding binding = DataBindingUtil.bind(view);
        User user = new User("John", "Doe");
        binding.setUser(user);

        return view;
    }
}
