package com.example.drawerlayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    MaterialToolbar idTopAppBar;
    DrawerLayout idDrawer;
    NavigationView idNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTopAppBar = findViewById(R.id.idTopAppBar);

        idDrawer = findViewById(R.id.idDrawer);

        idTopAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,idDrawer,idTopAppBar,R.string.open_drawer, R.string.close_drawer);
                idDrawer.addDrawerListener(toggle);

                toggle.syncState();
            }
        });







    }
}