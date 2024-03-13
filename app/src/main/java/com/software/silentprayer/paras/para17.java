package com.software.silentprayer.paras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.software.silentprayer.R;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class para17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para17);


        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("seventeen.pdf")
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true)
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
    }
}