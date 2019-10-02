package com.dipak.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.util.Log;

import com.dipak.tourguide.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements PlacesFragment.OnListFragmentInteractionListener,DetailsFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Log.i("Item", String.valueOf(item));

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.i("Item", String.valueOf(uri));

    }
}
