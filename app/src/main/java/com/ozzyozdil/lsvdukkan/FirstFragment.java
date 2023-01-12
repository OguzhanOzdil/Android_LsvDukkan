package com.ozzyozdil.lsvdukkan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ozzyozdil.lsvdukkan.R;

public class FirstFragment extends Fragment {

    public static String changeResim;
    NavDirections action;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView hediyelikEsya = view.findViewById(R.id.img_Hediyelik);
        hediyelikEsya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHediyelikDetails(view);
            }
        });

        ImageView kirtasiye = view.findViewById(R.id.img_Kirtasiye);
        kirtasiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToKirtasiyeDetails(view);
            }
        });

        ImageView oyuncak = view.findViewById(R.id.img_Oyuncak);
        oyuncak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOyuncakDetails(view);
            }
        });

        ImageView seramik = view.findViewById(R.id.img_Seramik);
        seramik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSeramikDetails(view);
            }
        });

        ImageView tekstil = view.findViewById(R.id.img_Tekstil);
        tekstil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTekstilDetails(view);
            }
        });

    }

    public void goToHediyelikDetails(View view){

        changeResim = "hediye";

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);

    }

    public void goToKirtasiyeDetails(View view){

        changeResim = "kirtasiye";

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);

    }

    public void goToOyuncakDetails(View view){

        changeResim = "oyuncak";

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);

    }

    public void goToSeramikDetails(View view){

        changeResim = "seramik";

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);

    }

    public void goToTekstilDetails(View view){

        changeResim = "tekstil";

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);

    }

}