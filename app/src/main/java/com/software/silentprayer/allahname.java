package com.software.silentprayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.AbstractPreferences;

public class allahname extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Button previousButton;
    private Button nextButton;
    private List<String> textList;
    private TextPagerAdapter adapter;
    private int currentPage = 0;
    private SharedPreferences sharedPreferences;
    //   private AbstractPreferences Prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allahname);

        viewPager = findViewById(R.id.viewPager);
        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        // Load the last saved page index or default to 0 if not found
        currentPage = sharedPreferences.getInt("currentPage", 0);

        textList = new ArrayList<>();
        textList.add("الرَّحْمَنُ");
        textList.add("الرَّحِيمُ");
        textList.add("الْمَلِكُ");
        textList.add("الْقُدُّوسُ");
        textList.add("السَّلاَمُ");
        textList.add("الْمُؤْمِنُ");
        textList.add("الْمُهَيْمِنُ");
        textList.add("الْعَزِيزُ");
        textList.add("الْجَبَّارُ");
        textList.add("الْمُتَكَبِّر");
        textList.add("الْخَالِقُ");
        textList.add("الْبَارِئُ");
        textList.add("الْمُصَوِّرُ");
        textList.add("الْغَفَّارُ");
        textList.add("الْقَهَّارُ");
        textList.add("الْوَهَّابُ");
        textList.add("الرَّزَّاقُ");
        textList.add("الْفَتَّاحُ");
        textList.add("اَلْعَلِيْمُ");
        textList.add("الْقَابِضُ");
        textList.add("الْبَاسِطُ");
        textList.add("الْخَافِضُ");
        textList.add("الرَّافِعُ");
        textList.add("الْمُعِزُّ");
        textList.add("ٱلْمُذِلُّ");
        textList.add("السَّمِيعُ");
        textList.add("الْبَصِيرُ");
        textList.add("الْحَكَمُ");
        textList.add("الْعَدْلُ");
        textList.add("اللَّطِيفُ");
        textList.add("الْخَبِيرُ");
        textList.add("الْحَلِيمُ");
        textList.add("الْعَظِيمُ");
        textList.add("الْغَفُور");
        textList.add("الشَّكُورُ");
        textList.add("الْعَلِيُّ");
        textList.add("الْكَبِيرُ");
        textList.add("الْحَفِيظُ");
        textList.add("المُقيِت");
        textList.add("اﻟْﺣَسِيبُ");
        textList.add("الْجَلِيلُ");
        textList.add("الْكَرِيمُ");
        textList.add("الرَّقِيبُ");
        textList.add("ٱلْمُجِيبُ");
        textList.add("الْوَاسِعُ");
        textList.add("الْحَكِيمُ");
        textList.add("الْوَدُودُ");
        textList.add("الْمَجِيدُ");
        textList.add("الْبَاعِثُ");
        textList.add("الشَّهِيدُ");
        textList.add("الْحَقُ");
        textList.add("الْوَكِيلُ");
        textList.add("الْقَوِيُ");
        textList.add("الْمَتِينُ");
        textList.add("الْوَلِيُّ");
        textList.add("الْحَمِيدُ");
        textList.add("الْمُحْصِي");
        textList.add("الْمُبْدِئُ");
        textList.add("ٱلْمُعِيدُ");
        textList.add("الْمُحْيِي");
        textList.add("اَلْمُمِيتُ");
        textList.add("الْحَيُّ");
        textList.add("الْقَيُّومُ");
        textList.add("الْوَاجِدُ");
        textList.add("الْمَاجِدُ");
        textList.add("الْواحِدُ");
        textList.add("اَلاَحَدُ");
        textList.add("الصَّمَدُ");
        textList.add("الْقَادِرُ");
        textList.add("الْمُقْتَدِرُ");
        textList.add("الْمُقَدِّمُ");
        textList.add("الْمُؤَخِّرُ");
        textList.add("الأوَّلُ");
        textList.add("الآخِرُ");
        textList.add("الظَّاهِرُ");
        textList.add("الْبَاطِنُ");
        textList.add("الْوَالِي");
        textList.add("الْمُتَعَالِي");
        textList.add("الْبَرُّ");
        textList.add("التَّوَابُ");
        textList.add("الْمُنْتَقِمُ");
        textList.add("العَفُوُ");
        textList.add("الرَّؤُوفُ");
        textList.add("مَالِكُ ٱلْمُلْكُ");
        textList.add("ذُوالْجَلاَلِ وَالإكْرَامِ");
        textList.add("الْمُقْسِطُ");
        textList.add("الْجَامِعُ");
        textList.add("ٱلْغَنيُّ");
        textList.add("ٱلْمُغْنِيُّ");
        textList.add("اَلْمَانِعُ");
        textList.add("الضَّارَ");
        textList.add("النَّافِعُ");
        textList.add("النُّورُ");
        textList.add("الْهَادِي");
        textList.add("الْبَدِيعُ");
        textList.add("اَلْبَاقِي");
        textList.add("الْوَارِثُ");
        textList.add("الرَّشِيدُ");
        textList.add("الصَّبُورُ");




        adapter = new TextPagerAdapter(textList);
        viewPager.setAdapter(adapter);



        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPage > 0) {
                    currentPage--;
                    viewPager.setCurrentItem(currentPage);
                    saveCurrentPage(currentPage);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPage < textList.size() - 1) {
                    currentPage++;
                    viewPager.setCurrentItem(currentPage);
                    saveCurrentPage(currentPage);
                }
            }
        });

    }

    private void saveCurrentPage(int currentPage) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("currentPage", currentPage);
        editor.apply();
    }
}

