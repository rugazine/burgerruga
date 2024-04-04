package com.example.burgerruga.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgerruga.AdapterList;
import com.example.burgerruga.DataItem;
import com.example.burgerruga.R;

import java.util.ArrayList;
import java.util.List;

public class PemainTerbaik extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;

    public PemainTerbaik() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.bestplayer_fragment, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Lionel Messi", "1", R.drawable.messi));
        dataList.add(new DataItem("Ronaldo", "2", R.drawable.cr7));
        dataList.add(new DataItem("Maradona", "3", R.drawable.mrdn));
        dataList.add(new DataItem("Iniesta", "4", R.drawable.iniesta));
        dataList.add(new DataItem("Zinedine Zidane", "5", R.drawable.zizi));
        dataList.add(new DataItem("Ruga Zinedine", "6", R.drawable.rugabola));


        adapter = new AdapterList(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
