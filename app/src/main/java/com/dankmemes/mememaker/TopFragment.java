package com.dankmemes.mememaker;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TopFragment extends Fragment {

    EditText topInputText;
    EditText bottomInputText;
    Button memeButton;
    interface TopFragmentListener{
        void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopFragmentListener)getActivity();// Say Here
        }catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString());
        }
    }

    TopFragmentListener activityCommander;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_top, container, false);

        topInputText = view.findViewById(R.id.topInputText);
        bottomInputText = view.findViewById(R.id.bottomInputText);
        memeButton = view.findViewById(R.id.memeButton);

        memeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String top = topInputText.getText().toString();
                String bottom = bottomInputText.getText().toString();

                // This will call createMeme method in MainActivity...
                activityCommander.createMeme(top,bottom);
            }
        });

        return view;
    }
}
