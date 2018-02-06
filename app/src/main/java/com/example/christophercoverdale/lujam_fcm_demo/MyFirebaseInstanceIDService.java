package com.example.christophercoverdale.lujam_fcm_demo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by christophercoverdale on 06/02/2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService
{
    private static final String TAG = "MyFirebaseInsIDService";

    @Override
    public void onTokenRefresh()
    {
        super.onTokenRefresh();

        //Retrieving updated token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token: " + refreshedToken);
    }
}
