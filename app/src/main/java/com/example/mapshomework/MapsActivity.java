package com.example.mapshomework;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        int height = 100;
        int width = 100;

        LatLng clinicaDelSur = new LatLng(-16.5256137,-68.1080852);
        LatLng clinicaLaustrance = new LatLng(-16.5271273,-68.1080762);
        LatLng clinicaPetrolera = new LatLng(-16.5271273,-68.1080762);
        LatLng clinicaMetodista = new LatLng(-16.5263575,-68.1092039);
        LatLng clinicaEspecialidades = new LatLng(-16.5263575,-68.1092039);
        LatLng clinicaPrivada = new LatLng(-16.5263575,-68.1092039);
        LatLng clinicaInternacional = new LatLng(-16.534573,-68.0995893);

        BitmapDrawable bitmapdraw1 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitalone);
        Bitmap b1 =bitmapdraw1.getBitmap();
        Bitmap hospitalone = Bitmap.createScaledBitmap(b1, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaDelSur).title("Clínica del sur").icon(BitmapDescriptorFactory.fromBitmap(hospitalone)));

        BitmapDrawable bitmapdraw2 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitaltwo);
        Bitmap b2 =bitmapdraw2.getBitmap();
        Bitmap hospitaltwo = Bitmap.createScaledBitmap(b2, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaLaustrance).title("Clínica Laustrance").icon(BitmapDescriptorFactory.fromBitmap( hospitaltwo)));

        BitmapDrawable bitmapdraw3 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitaltree);
        Bitmap b3 =bitmapdraw3.getBitmap();
        Bitmap hospitaltree = Bitmap.createScaledBitmap(b3, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaPetrolera).title("Clínica Petrolera").icon(BitmapDescriptorFactory.fromBitmap( hospitaltree)));

        BitmapDrawable bitmapdraw4 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitalfour);
        Bitmap b4 =bitmapdraw4.getBitmap();
        Bitmap hospitalfour = Bitmap.createScaledBitmap(b4, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaMetodista).title("Clinica Metodista").icon(BitmapDescriptorFactory.fromBitmap( hospitalfour)));

        BitmapDrawable bitmapdraw5 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitalfive);
        Bitmap b5 =bitmapdraw5.getBitmap();
        Bitmap hospitalfive = Bitmap.createScaledBitmap(b5, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaEspecialidades).title("Clinica Especialidades").icon(BitmapDescriptorFactory.fromBitmap( hospitalfive)));

        BitmapDrawable bitmapdraw6 =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitalsix);
        Bitmap b6 =bitmapdraw6.getBitmap();
        Bitmap hospitalsix = Bitmap.createScaledBitmap(b6, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaPrivada).title("Clinica Privada").icon(BitmapDescriptorFactory.fromBitmap(hospitalsix)));

        BitmapDrawable bitmapdraw =(BitmapDrawable)getResources().getDrawable(R.drawable.hospitaltwo);
        Bitmap b =bitmapdraw.getBitmap();
        Bitmap hospitaltwo2 = Bitmap.createScaledBitmap(b, width, height, false);
        mMap.addMarker(new MarkerOptions().position(clinicaInternacional).title("Clinica Internacional").icon(BitmapDescriptorFactory.fromBitmap(hospitaltwo2)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(clinicaDelSur,16));
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
