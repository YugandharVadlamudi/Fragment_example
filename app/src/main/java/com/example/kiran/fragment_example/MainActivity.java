package com.example.kiran.fragment_example;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamicfragment);
    }
    public void callFragment(View view)
    {
        fm=getFragmentManager();
        ft=fm.beginTransaction();
        newimage cfl=new newimage();
        ft.replace(R.id.fv_1, cfl);
        ft.commit();
    }
}
