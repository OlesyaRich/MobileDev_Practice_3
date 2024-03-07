package com.example.practice_3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import com.example.practice_3.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    public FirstFragment() {
        super(R.layout.fragment_first);
    }


    private FragmentFirstBinding binding;
    final String LOG_TAG = "myLogs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "FirstFragment onCreate");
        Toast.makeText(getContext(), "FirstFragment onCreate toast!", Toast.LENGTH_LONG).show();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "FirstFragment onCreateView");
        Toast.makeText(getContext(), "FirstFragment onCreateView toast!", Toast.LENGTH_LONG).show();
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG_TAG, "FirstFragment onViewCreated");
        Toast.makeText(getContext(), "FirstFragment onViewCreated toast!", Toast.LENGTH_LONG).show();
        EditText getUserName = (EditText) getView().findViewById(R.id.t_userName);
        String userName = getUserName.getText().toString();
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(LOG_TAG, "FirstFragment onViewStateRestored");
        Toast.makeText(getContext(), "FirstFragment onViewStateRestored toast!", Toast.LENGTH_LONG).show();
    }
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "FirstFragment onStart");
        Toast.makeText(getContext(), "FirstFragment onStart toast!", Toast.LENGTH_LONG).show();
    }
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "FirstFragment onResume");
        Toast.makeText(getContext(), "FirstFragment onResume toast!", Toast.LENGTH_LONG).show();
    }
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "FirstFragment onPause");
        Toast.makeText(getContext(), "FirstFragment onPause toast!", Toast.LENGTH_LONG).show();
    }
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "FirstFragment onStop");
        Toast.makeText(getContext(), "FirstFragment onStop toast!", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(LOG_TAG, "FirstFragment onSaveInstanceState");
        Toast.makeText(getContext(), "FirstFragment onSaveInstanceState toast!", Toast.LENGTH_LONG).show();
    }
    public void onDestroyView() {
        super. onDestroyView();
        Log.d(LOG_TAG, "FirstFragment onDestroyView");
        Toast.makeText(getContext(), "FirstFragment onDestroyView toast!", Toast.LENGTH_LONG).show();
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "FirstFragment onDestroy");
        Toast.makeText(getContext(), "FirstFragment onDestroy toast!", Toast.LENGTH_LONG).show();
    }
}
