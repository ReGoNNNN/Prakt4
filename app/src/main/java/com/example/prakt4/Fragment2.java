package com.example.prakt4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    private ListView list;
    private ArrayAdapter<String> a;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        list = view.findViewById(R.id.list);

        String[] data = {"АЛЛИУМ", "АНЕМОН", "АСТРА", "КОРТАДЕРИЯ", "ИРИС"};

        a = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, data);
        list.setAdapter(a);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Выбран цветок: " + data[position], Toast.LENGTH_SHORT).show();
                Log.d("Fragment2", "Выбран цветок: " + data[position]);
            }
        });
        return view;
    }
}