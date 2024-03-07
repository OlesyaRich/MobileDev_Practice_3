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
import com.example.practice_3.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    public SecondFragment() {
        super(R.layout.fragment_first);
    }
    private FragmentSecondBinding binding;
    final String LOG_TAG = "myLogs";

    @Override
    //при прикреплении фрагмента к Activity:
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(LOG_TAG, "SecondFragment onAttach");
    }

    //при создании фрагмента (пока без доступа к UI):
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "SecondFragment onCreate");
    }

    //создание view (содержимого) фрагмента и передача его системе:
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "SecondFragment onCreateView");
        binding = FragmentSecondBinding.inflate (inflater, container, false);
        return binding.getRoot();
        //return inflater.inflate (R.layout.SecondFragment, container, false);
    }

    //далее срабатывает метод Activity - onCreate
    //сообщаем фрагменту, что view фрагмента создано (можно с ним работать):
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG_TAG, "SecondFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(LOG_TAG,  "SecondFragment onViewStateRestored");
    }

    //далее метод Activity - onStart, после него onStart фрагмента - аналогичен методу Activity,
    // фрагмент виден пользователю:
    public void onStart() {
        super.onStart();
        Log. d(LOG_TAG,"SecondFragment onStart");
    }
    //Далее метод Activity - onResume, после него onResume фрагмента - аналогичен методу Activity,
    // фрагмент доступен для взаимодействия:
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "SecondFragment onResume");
    }
    //методы onPause u onStop для фрагментов и Activity - фрагменты и Activity более недоступны
    //для взаимодействия, а потом не видны пользователю:
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "SecondFragment onPause");
    }
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "SecondFragment onStop");
    }

    //View, которое создавали в onCreateView, более недоступно:
    public void onDestroyView() {
        super. onDestroyView();
        Log.d(LOG_TAG,  "SecondFragment onDestroyView");
    }
    //аналог метода onDestroy y Activity:
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "SecondFragment onDestroy");
    }
    //фрагмент отсоединен от Activity:
    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "SecondFragment onDetach");
    }
    //в конце вызывается метод onDestroy для Activity
}
