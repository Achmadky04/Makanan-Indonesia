package com.example.makanan_indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_JUDUL = "extra_judul";
    public static final String EXTRA_DESC = "extra_desc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDatajdlRecived = findViewById(R.id.jdl_mkn);
        TextView tvDatadescRecived = findViewById(R.id.desc_mkn);
        ImageView tvDataimageReceived = findViewById(R.id.image);

        int gambar = getIntent().getIntExtra(EXTRA_IMAGE,0);
        String judul = getIntent().getStringExtra(EXTRA_JUDUL);
        String desc = getIntent().getStringExtra(EXTRA_DESC);

        Glide.with(this)
            .load(gambar)
            .apply(new RequestOptions().override(350,550))
                .into(tvDataimageReceived);
        tvDatajdlRecived.setText(judul);
        tvDatadescRecived.setText(desc);


    }
}