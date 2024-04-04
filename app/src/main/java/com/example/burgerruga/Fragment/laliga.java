package com.example.burgerruga.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgerruga.AdapterListLaliga;
import com.example.burgerruga.DataItem;
import com.example.burgerruga.R;

import java.util.ArrayList;
import java.util.List;

public class laliga extends Fragment implements AdapterListLaliga.ItemClickListener {

    private RecyclerView recyclerView;
    private AdapterListLaliga adapter;
    private List<DataItem> dataList;

    public laliga() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.laliga_fragment, container, false);

        recyclerView = view.findViewById(R.id.rvList2);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Real Madrid", "1", R.drawable.rmd));
        dataList.add(new DataItem("Barcelona", "2", R.drawable.fcb));
        dataList.add(new DataItem("Girona", "3", R.drawable.grn));
        dataList.add(new DataItem("Atletico Madrid", "4", R.drawable.atm));
        dataList.add(new DataItem("Athletic Club", "5", R.drawable.acb));
        dataList.add(new DataItem("Real Sociedad", "6", R.drawable.rsc));
        dataList.add(new DataItem("Real Betis", "7", R.drawable.rbfc));
        dataList.add(new DataItem("Valencia", "8", R.drawable.vcf));
        dataList.add(new DataItem("Osasuna", "9", R.drawable.ofc));
        dataList.add(new DataItem("Villarreal", "10", R.drawable.cvf));

        adapter = new AdapterListLaliga(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        // Handle item click event here
    }
}

