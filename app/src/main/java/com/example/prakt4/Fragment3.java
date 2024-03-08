package com.example.prakt4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment3 extends Fragment {

    private RecyclerView r;
    private RecyclerView.Adapter a;
    private RecyclerView.LayoutManager layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        r = view.findViewById(R.id.r);
        r.setHasFixedSize(true);

        layout = new LinearLayoutManager(getContext());
        r.setLayoutManager(layout);

        String[] data = new String[20];
        for (int i = 0; i < 20; i++) {
            data[i] = "Предмет " + (i + 1);
        }

        a = new Adapter(getActivity(), data);
        r.setAdapter(a);

        return view;
    }
}

