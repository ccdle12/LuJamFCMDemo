package com.example.christophercoverdale.lujam_fcm_demo.dashboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.christophercoverdale.lujam_fcm_demo.R;
import com.google.firebase.FirebaseApp;

/**
 * Created by christophercoverdale on 06/02/2018.
 */

public class Dashboard extends Fragment implements IDashboardPresenter.IDashboard
{
    /**
     * Member Variables
     */
    @NonNull
    IDashboardPresenter dashboardPresenter;

    @NonNull
    View rootView;

    @NonNull
    String TAG = "DEBUG DASHBOARD";

    /**
     * View Objects
     */
    @NonNull
    Button button;

    @NonNull
    TextView tokenText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        this.rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        return this.rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        initMemberVariables();
        findAllViews();
        setGetTokenListener();
    }

    /**
     * Setup View Objects and Member Variable methods
     */
    private void initMemberVariables()
    {
        this.dashboardPresenter = new DashboardPresenter(this);
        FirebaseApp.initializeApp(getContext());
    }

    private void findAllViews()
    {
        this.button = this.rootView.findViewById(R.id.get_token_btn);
        this.tokenText = this.rootView.findViewById(R.id.token_text);
    }

    private void setGetTokenListener()
    {
        this.button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dashboardPresenter.getTokenBtnClicked();
            }
        });
    }


    /***
     * Call back methods from the Presenter
     */
    @Override
    public void showToken(String token)
    {
        this.tokenText.setText(token);
    }
}
