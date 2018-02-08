package com.example.christophercoverdale.lujam_fcm_demo.dashboard;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by christophercoverdale on 06/02/2018.
 */

public class DashboardPresenter implements IDashboardPresenter
{
    /**
     * Member Variables
     */
    IDashboard dashboard;


    public DashboardPresenter(IDashboard dashboard)
    {
        this.dashboard = dashboard;
    }

    @Override
    public void getTokenBtnClicked()
    {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("FIREBASE TOKEN", token);
        dashboard.showToken(token);
    }
}
