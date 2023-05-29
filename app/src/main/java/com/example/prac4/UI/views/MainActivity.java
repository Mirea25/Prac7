package com.example.prac4.UI.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.prac4.R;
import com.example.prac4.UI.viewmodels.ViewModel;
import com.example.prac4.UI.views.fragment2;
import com.example.prac4.UI.views.fragment3;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewModel viewModel = new ViewModelProvider(this).get(ViewModel.class);

        viewModel.addItem(1,"text");
        viewModel.getItemId().observe(this, itemId -> {

        });
    }

    public void replaceFragments(fragment2 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, inst).commit();
    }
    public void replaceFragments(fragment3 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, inst).commit();
    }
}