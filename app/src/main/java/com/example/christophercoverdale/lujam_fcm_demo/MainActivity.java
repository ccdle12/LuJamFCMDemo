package com.example.christophercoverdale.lujam_fcm_demo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.christophercoverdale.lujam_fcm_demo.dashboard.Dashboard;

public class MainActivity extends AppCompatActivity
{
    @NonNull
    Dashboard dashboardFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDashboardFragment();
        setFragmentInContainer();
    }

    private void initDashboardFragment() {
        this.dashboardFragment = new Dashboard();
    }

    private void setFragmentInContainer() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, dashboardFragment)
                .commit();
    }
}
