package com.example.bnfg.gpsbanking;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    //static final LatLng Bonanjo = new LatLng(4.042709299999999, 9.687720600000034);
    static final LatLng Akwa = new LatLng(4.049862399999999, 9.695212999999967);
    static final LatLng Dalip = new LatLng(4.045825100000001, 9.698256300000025);
    static final LatLng Bessengue = new LatLng(4.0486986, 9.709840699999972);
    static final LatLng Bonamoussadi = new LatLng(4.0921933, 9.745163700000037);
    static final LatLng Ndokotti = new LatLng(4.044926091221631, 9.73487377166748);
    static final LatLng Dakar = new LatLng(4.0253453, 9.735135300000024);
    static final LatLng New_Bell = new LatLng(4.027069400000001, 9.713045999999963);
    static final LatLng Mboppi = new LatLng(4.0464053, 9.715820000000008);
    static final LatLng Palmiers = new LatLng(4.0522088, 9.76302620000001);
    static final LatLng Bonaberi = new LatLng(4.072323, 9.675041700000065);
    static final LatLng Nkoulmitag = new LatLng(4.0378961, 9.719341100000065);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().title("Immeuble Socar").position(Akwa));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Akwa, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Ancien Dalip").position(Dalip));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Dalip, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Feu rouge Bessengue").position(Bessengue));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bessengue, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Tradex Bonamoussadi").position(Bonamoussadi));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bessengue, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("ENEO Ndokotti").position(Ndokotti));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Ndokotti, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Carrefour Marché Dakar").position(Dakar));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Dakar, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("carrefour Anatole").position(New_Bell));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(New_Bell, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Marché Mboppi").position(Mboppi));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mboppi, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Montée Marché cité des palmiers").position(Palmiers));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Palmiers, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Echangeur nouvelle route").position(Bonaberi));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bonaberi, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

        mMap.addMarker(new MarkerOptions().title("Boulevard des nations unies").position(Nkoulmitag));

        //centre la google map sur Paris (avec animation de zoom)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Nkoulmitag, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
    }
}
