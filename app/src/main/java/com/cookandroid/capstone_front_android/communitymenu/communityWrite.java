package com.cookandroid.capstone_front_android.communitymenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cookandroid.capstone_front_android.MainActivity;
import com.cookandroid.capstone_front_android.R;

public class communityWrite extends Fragment {
    private View view;

    private MainActivity activity;

    private Button btnExit; // 나가기 버튼.


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.community_write, container, false);

        activity = (MainActivity) getActivity();

        // 버튼설정.
        btnExit = view.findViewById(R.id.exit);

        // 버튼이벤트.
        btnExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { activity.setCommunity(0); }
        });

        return view;
    }
}