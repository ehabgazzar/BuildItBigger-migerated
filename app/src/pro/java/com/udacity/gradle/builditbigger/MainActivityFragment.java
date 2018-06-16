package com.udacity.gradle.builditbigger;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udacity.gradle.builditbigger.R;
import android.widget.Button;
import android.widget.Toast;

import com.example.eh.myapplication.backend.myApi.MyApi;
import com.example.jokeviewer.joke_viewer;


import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;
/**
 * Created by Eh on 9/3/2017.
 */
public class MainActivityFragment extends Fragment {
    Button button;

    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        button = (Button) root.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new com.udacity.gradle.builditbigger.EndpointsAsyncTask(getActivity()).execute(getActivity());

            }
        });

        return root;
    }

}