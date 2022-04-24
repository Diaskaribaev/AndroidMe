package com.example.androidme.ui;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidme.AndroidImage;
import com.example.androidme.R;

import java.util.List;

public class BodyFragment extends Fragment {

    private List<Integer> ImageIds;
    private int ListIndex;


    public BodyFragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_body,container,false);

        final ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_id);

        if(ImageIds != null){
            imageView.setImageResource(ImageIds.get(ListIndex));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ListIndex < ImageIds.size()-1){
                        ListIndex++;
                    }else{
                        ListIndex=0;
                    }
                    imageView.setImageResource(ImageIds.get(ListIndex));

                }
            });


        }else{

        }



        return rootView;
    }


    public void setImageIds(List<Integer> imageIds) {
        ImageIds = imageIds;
    }

    public void setListIndex(int listIndex) {
        ListIndex = listIndex;
    }
}
