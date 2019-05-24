package com.example.tablayout;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {


    View v;
    RecyclerView recyclerView;
    String[] course={"B.tech","BCA","MBA","M.tech","B.sc","B.com","B.ed","hkj","hkhk","yioiuo","gjhgg","dgghj","fgjgjk"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v= inflater.inflate(R.layout.fragment_fragment1, container, false);
        recyclerView=v.findViewById(R.id.programmingList);
        programmingAdaptar p=new programmingAdaptar(course,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(p);

        return v;
    }

}
