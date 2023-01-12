package com.ozzyozdil.lsvdukkan;

import static com.ozzyozdil.lsvdukkan.FirstFragment.changeResim;

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

public class SecondFragment extends Fragment {

    public static String imgDetails;

    ImageView img;
    ImageView img_2;
    ImageView img_3;
    ImageView img_4;
    ImageView img_5;
    ImageView img_6;

    TextView txt;
    TextView txt_2;
    TextView txt_3;
    TextView txt_4;
    TextView txt_5;
    TextView txt_6;

    public SecondFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (changeResim.equals("hediye")){

            imgDetails = "anahtarlik";

            img = view.findViewById(R.id.img);
            img.setImageResource(R.drawable.anahtarlik);

            txt = view.findViewById(R.id.txt);
            txt.setText("Zincirli Anahtarlık");

            img_2 = view.findViewById(R.id.img_2);
            img_2.setImageResource(R.drawable.anahtarlik1);

            txt_2 = view.findViewById(R.id.txt_2);
            txt_2.setText("Anahtarlık (Mavi)");

            img_3 = view.findViewById(R.id.img_3);
            img_3.setImageResource(R.drawable.anahtarlik3);

            txt_3 = view.findViewById(R.id.txt_3);
            txt_3.setText("Kalp Anahtarlık");

            img_4 = view.findViewById(R.id.img_4);
            img_4.setImageResource(R.drawable.bileklik);

            txt_4 = view.findViewById(R.id.txt_4);
            txt_4.setText("Bileklik");

            img_5 = view.findViewById(R.id.img_5);
            img_5.setImageResource(R.drawable.kilif);

            txt_5 = view.findViewById(R.id.txt_5);
            txt_5.setText("Telefon Kılıfı");

            img_6 = view.findViewById(R.id.img_6);
            img_6.setImageResource(R.drawable.rozet);

            txt_6 = view.findViewById(R.id.txt_6);
            txt_6.setText("Lösev Rozet");
        }
        else if (changeResim.equals("kirtasiye")){

            imgDetails = "defter";

            img = view.findViewById(R.id.img);
            img.setImageResource(R.drawable.defter);

            txt = view.findViewById(R.id.txt);
            txt.setText("Defter");

            img_2 = view.findViewById(R.id.img_2);
            img_2.setImageResource(R.drawable.defter3);

            txt_2 = view.findViewById(R.id.txt_2);
            txt_2.setText("Defter (Aslan)");

            img_3 = view.findViewById(R.id.img_3);
            img_3.setImageResource(R.drawable.kagit);

            txt_3 = view.findViewById(R.id.txt_3);
            txt_3.setText("Not Kağıdı");

            img_4 = view.findViewById(R.id.img_4);
            img_4.setImageResource(R.drawable.kalem);

            txt_4 = view.findViewById(R.id.txt_4);
            txt_4.setText("Kalem");

            img_5 = view.findViewById(R.id.img_5);
            img_5.setImageResource(R.drawable.kalemlik);

            txt_5 = view.findViewById(R.id.txt_5);
            txt_5.setText("Kalemlik");

            img_6 = view.findViewById(R.id.img_6);
            img_6.setImageResource(R.drawable.takvim);

            txt_6 = view.findViewById(R.id.txt_6);
            txt_6.setText("Takvim");
        }
        else if (changeResim.equals("oyuncak")){

            imgDetails = "oyuncak1";

            img = view.findViewById(R.id.img);
            img.setImageResource(R.drawable.oyuncak1);

            txt = view.findViewById(R.id.txt);
            txt.setText("Oyuncak Ayı (Beyaz)");

            img_2 = view.findViewById(R.id.img_2);
            img_2.setImageResource(R.drawable.oyuncak2);

            txt_2 = view.findViewById(R.id.txt_2);
            txt_2.setText("Oyuncak Bebek (Kız)");

            img_3 = view.findViewById(R.id.img_3);
            img_3.setImageResource(R.drawable.oyuncak3);

            txt_3 = view.findViewById(R.id.txt_3);
            txt_3.setText("Oyuncak Ayı (Kahverengi)");

            img_4 = view.findViewById(R.id.img_4);
            img_4.setImageResource(R.drawable.oyuncak4);

            txt_4 = view.findViewById(R.id.txt_4);
            txt_4.setText("Oyuncak Bebek (Erkek)");
        }
        else if (changeResim.equals("seramik")){

            imgDetails = "bardak";

            img = view.findViewById(R.id.img);
            img.setImageResource(R.drawable.bardak);

            txt = view.findViewById(R.id.txt);
            txt.setText("Bardak (Köpek)");

            img_2 = view.findViewById(R.id.img_2);
            img_2.setImageResource(R.drawable.bardak2);

            txt_2 = view.findViewById(R.id.txt_2);
            txt_2.setText("Bardak (Arı)");

            img_3 = view.findViewById(R.id.img_3);
            img_3.setImageResource(R.drawable.bardak3);

            txt_3 = view.findViewById(R.id.txt_3);
            txt_3.setText("Bardak (Yılbaşı)");

            img_4 = view.findViewById(R.id.img_4);
            img_4.setImageResource(R.drawable.bardak4);

            txt_4 = view.findViewById(R.id.txt_4);
            txt_4.setText("Bardak (İkili)");

            img_5 = view.findViewById(R.id.img_5);
            img_5.setImageResource(R.drawable.bardak5);

            txt_5 = view.findViewById(R.id.txt_5);
            txt_5.setText("Bardak (Balık)");
        }
        else{

            imgDetails = "atki2";

            img = view.findViewById(R.id.img);
            img.setImageResource(R.drawable.atki2);

            txt = view.findViewById(R.id.txt);
            txt.setText("Atkı");

            img_2 = view.findViewById(R.id.img_2);
            img_2.setImageResource(R.drawable.eldiven);

            txt_2 = view.findViewById(R.id.txt_2);
            txt_2.setText("Eldiven");

            img_3 = view.findViewById(R.id.img_3);
            img_3.setImageResource(R.drawable.sapka);

            txt_3 = view.findViewById(R.id.txt_3);
            txt_3.setText("Şapka (Kelebek)");

            img_4 = view.findViewById(R.id.img_4);
            img_4.setImageResource(R.drawable.sapka1);

            txt_4 = view.findViewById(R.id.txt_4);
            txt_4.setText("Şapka (Kedi)");

            img_5 = view.findViewById(R.id.img_5);
            img_5.setImageResource(R.drawable.tshort);

            txt_5 = view.findViewById(R.id.txt_5);
            txt_5.setText("Tişört");

            img_6 = view.findViewById(R.id.img_6);
            img_6.setImageResource(R.drawable.yastik);

            txt_6 = view.findViewById(R.id.txt_6);
            txt_6.setText("Yastık");
        }

        ImageView img = view.findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToImgBuy(view);
            }
        });

        Button backButon = view.findViewById(R.id.btn_backFirst);
        backButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = SecondFragmentDirections.actionSecondFragmentToFirstFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });
    }

    public void goToImgBuy(View view){
        NavDirections action = SecondFragmentDirections.actionSecondFragmentToBuyFragment();
        Navigation.findNavController(view).navigate(action);
    }
}