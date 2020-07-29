package com.example.makanan_indonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.rv_makanan);
        rvMakanan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());
        showRecyclerCardView();
    }
    private void showRecyclerCardView(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        CardViewMakananAdapter cardViewHeroAdapter = new CardViewMakananAdapter(list);
        rvMakanan.setAdapter(cardViewHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;



        }
    }

}
