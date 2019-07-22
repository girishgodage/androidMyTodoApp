package com.giri.mytodoapp.Main;


import com.giri.mytodoapp.AppDefault.AppDefaultFragment;
import com.giri.mytodoapp.R;

public class MainFragment extends AppDefaultFragment {
    @Override
    protected int layoutRes() {
        return R.layout.fragment_main;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }
}
