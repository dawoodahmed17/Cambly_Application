package com.example.cambly_application;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class home_activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    private AppBarLayout appBarLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

        appBarLayout = (AppBarLayout) findViewById(R.id.app_barid);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new BaseFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_activity, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_subscribe) {

        } else if (id == R.id.nav_messages) {

        } else if (id == R.id.nav_minutes) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new Fragmentfreeminutes()).addToBackStack(null).commit();
        } else if (id == R.id.nav_referralcode) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new FragmentReferralCode()).addToBackStack(null).commit();
        } else if (id == R.id.nav_reservation) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new FragmentReservations()).addToBackStack(null).commit();
        }else if (id == R.id.nav_stats) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new Fragment_stats()).addToBackStack(null).commit();
        }else if (id == R.id.nav_history) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new FragmentHistory()).addToBackStack(null).commit();
        }else if (id == R.id.nav_help) {

        }else if (id == R.id.nav_rateone) {

        }else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
