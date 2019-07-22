package com.giri.mytodoapp.Main;


import com.giri.mytodoapp.AppDefault.AppDefaultFragment;
import com.giri.mytodoapp.R;

public class MainFragment extends AppDefaultFragment {

    private String theme = "name_of_the_theme";
    public static final String THEME_PREFERENCES = "com.girish.themepref";
    public static final String RECREATE_ACTIVITY = "com.girish.recreateactivity";
    public static final String THEME_SAVED = "com.girish.savedtheme";
    public static final String DARKTHEME = "com.girish.darktheme";
    public static final String LIGHTTHEME = "com.girish.lighttheme";

    @Override
    protected int layoutRes() {
        return R.layout.fragment_main;
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }
}
