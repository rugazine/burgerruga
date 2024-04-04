package com.example.burgerruga.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgerruga.AdapterListScorer; // Ubah import ini
import com.example.burgerruga.DataItem;
import com.example.burgerruga.R;

import java.util.ArrayList;
import java.util.List;

public class Scorer extends Fragment implements AdapterListScorer.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterListScorer adapter; // Ubah tipe Adapter ini
    private List<DataItem> dataList;

    public Scorer() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.scorerl_fragment, container, false);

        recyclerView = view.findViewById(R.id.rvList);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Lionel Messi", "474 Goal", R.drawable.m10));
        dataList.add(new DataItem("Ronaldo", "292 Goal", R.drawable.cr7goal));
        dataList.add(new DataItem("Telmo Zarra", "277 Goal", R.drawable.telmo));
        dataList.add(new DataItem("Karim Benzema", "238 Goal", R.drawable.benzema));
        dataList.add(new DataItem("Hugo Sanchez", "234 Goal", R.drawable.hugo));


        adapter = new AdapterListScorer(dataList, getContext()); // Ubah inisialisasi Adapter ini
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
