package com.ozzyozdil.lsvdukkan;

import static android.content.Context.MODE_PRIVATE;
import static com.ozzyozdil.lsvdukkan.MainActivity.puan;
import static com.ozzyozdil.lsvdukkan.SecondFragment.imgDetails;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BuyFragment extends Fragment {

    ImageView img;
    TextView txt_Buy;
    TextView product;
    TextView price;
    int adet = 1;
    String puanStr;
    int totalPuan;
    SharedPreferences sPref;

    public BuyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // SharedPreferences Total Puan
        sPref = requireContext().getSharedPreferences("com.ozzyozdil.lsvdukkan", MODE_PRIVATE);
        int puanint = sPref.getInt("puanint", 0);
        totalPuan = puanint;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buy, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button backButon = view.findViewById(R.id.btn_BackSecond);
        backButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = BuyFragmentDirections.actionBuyFragmentToSecondFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });

        if (imgDetails.equals("anahtarlik")){
            img = view.findViewById(R.id.img_Buy);
            img.setImageResource(R.drawable.anahtarlik);

            txt_Buy = view.findViewById(R.id.txt_Buy);
            txt_Buy.setText("Zincirli Anahtarlık");
        }
        else if (imgDetails.equals("defter")){
            img = view.findViewById(R.id.img_Buy);
            img.setImageResource(R.drawable.defter);

            txt_Buy = view.findViewById(R.id.txt_Buy);
            txt_Buy.setText("Defter");
        }
        else if (imgDetails.equals("oyuncak1")){
            img = view.findViewById(R.id.img_Buy);
            img.setImageResource(R.drawable.oyuncak1);

            txt_Buy = view.findViewById(R.id.txt_Buy);
            txt_Buy.setText("Oyuncak Ayı (Beyaz)");
        }
        else if (imgDetails.equals("bardak")){
            img = view.findViewById(R.id.img_Buy);
            img.setImageResource(R.drawable.bardak);

            txt_Buy = view.findViewById(R.id.txt_Buy);
            txt_Buy.setText("Bardak (Köpek)");
        }
        else{
            img = view.findViewById(R.id.img_Buy);
            img.setImageResource(R.drawable.atki2);

            txt_Buy = view.findViewById(R.id.txt_Buy);
            txt_Buy.setText("Atkı");
        }

        product = view.findViewById(R.id.txt_ProductCount);
        price = view.findViewById(R.id.txt_Price);

        Button upper = view.findViewById(R.id.btn_Upper);
        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adet += 1;
                product.setText("Adet: " + adet);
                price.setText("Fiyat: " + adet * 20 + "TL");
            }
        });

        Button lower = view.findViewById(R.id.btn_Lower);
        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (adet > 1){
                    adet -= 1;
                    product.setText("Adet: " + adet);
                    price.setText("Fiyat: " + adet * 20 + "TL");
                }
            }
        });

        Button buy = view.findViewById(R.id.btn_Buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalPuan += adet * 5;
                puanStr = "Puan: " + totalPuan;
                puan.setText(puanStr);

                Toast.makeText(requireContext(), adet * 5 + " puan hesabınıza eklendi", Toast.LENGTH_SHORT).show();

                SharedPreferences sharedPreferences = requireContext().getSharedPreferences("com.ozzyozdil.lsvdukkan", MODE_PRIVATE);
                sharedPreferences.edit().putInt("puanint", totalPuan).apply();
                sharedPreferences.edit().putString("puanstr", puanStr).apply();
            }
        });
    }
}