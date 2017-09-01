package com.dankmemes.mememaker;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {


    TextView topOutputText;
    TextView bottomOutputText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bottom, container, false);

        topOutputText = view.findViewById(R.id.topOutputText);
        bottomOutputText = view.findViewById(R.id.bottomOutputText);
        return view;
    }
    // MainActivity will call this one...
    public void setMemeText(String top, String bottom)
    {
        topOutputText.setText(top.trim());
        bottomOutputText.setText(bottom.trim());
    }
}
