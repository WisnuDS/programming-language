package com.dicoding.programinglanguage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetilProgramingLanguage extends AppCompatActivity implements View.OnClickListener {
    TextView tvName, tvDesc;
    Button btnRefrensi;
    ImageView imvPhoto;
    String reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_programing_language);
        tvName = findViewById(R.id.tv_name_detil);
        tvDesc = findViewById(R.id.tv_descripsion);
        btnRefrensi = findViewById(R.id.btn_referensi);
        imvPhoto = findViewById(R.id.detil_photo);
        btnRefrensi.setOnClickListener(this);

        String name,desc,photo;

        name = getIntent().getStringExtra("EXTRA_NAME");
        desc = getIntent().getStringExtra("EXTRA_DESC");
        photo = getIntent().getStringExtra("EXTRA_PHOTO");
        reference = getIntent().getStringExtra("EXTRA_REFERENCE");

        tvName.setText(name);
        tvDesc.setText(desc);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(150,150))
                .into(imvPhoto);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_referensi){
            Intent referenceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(reference));
            startActivity(referenceIntent);
        }
    }
}
