package com.example.christophercoverdale.lujam_fcm_demo.dashboard;

/**
 * Created by christophercoverdale on 06/02/2018.
 */

public interface IDashboardPresenter
{
    void getTokenBtnClicked();

    interface IDashboard
    {
        void showToken(String token);
    }
}
