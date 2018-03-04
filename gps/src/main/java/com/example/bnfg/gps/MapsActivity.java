package com.example.bnfg.gps;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    //private GpsTracker gpsTracker;
    //private Location mLocation;
    public double latitude;
    public double longitude;
    private GoogleMap mMap;
    LocationManager locationManager;
    LatLng myPosition;

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
        setContentView(R.layout.activity_maps);
        // gpsTracker = new GpsTracker(getApplicationContext());
        //mLocation = gpsTracker.getLocation();
        //latitude = mLocation.getLatitude();
        //longitude = mLocation.getLongitude();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        /*locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        if(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    LatLng myPosition;
                    myPosition = new LatLng(latitude, longitude);
                    Geocoder geocoder = new Geocoder(getApplicationContext());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(latitude,longitude,1);
                        String str = addressList.get(0).getLocality()+",";
                        str += addressList.get(0).getCountryName();
                        mMap.addMarker(new MarkerOptions().title(str).position(myPosition).visible(true).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPosition, 15));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });
        }
        else if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    latitude = location.getLatitude();
                    longitude = location.getLongitude();
                    //LatLng myPosition;
                    //myPosition = new LatLng(latitude, longitude);
                    Geocoder geocoder = new Geocoder(getApplicationContext());
                    try {
                        List<Address> addressList = geocoder.getFromLocation(latitude,longitude,1);
                        String str = addressList.get(0).getLocality()+",";
                        str += addressList.get(0).getCountryName();
                         mMap.addMarker(new MarkerOptions().title(str).position(myPosition).visible(true).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
                         mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPosition, 15));
                         mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });
        }

    }*/
    /*public boolean validLatLng(double lat, double lng) {
        if((latitude != 0.0) && (longitude != 0.0)) {
            //this.gotLocation = true;
            return true;
        } else return false;
    }*/

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

       // mMap = googleMap;
        //googleMap.setMyLocationEnabled(true);
        // googleMap.setTrafficEnabled(true);}
        //ajoute un marker sur Paris
        //googleMap.setMyLocationEnabled(true);
        //LatLng myPosition;
        //myPosition = new LatLng(latitude, longitude);
        /* if((latitude != 0.0) && (longitude != 0.0)) {
        //this.gotLocation = true;
            googleMap.addMarker(new MarkerOptions().title("Vous êtes ici").position(myPosition).visible(true).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

            //centre la google map sur Paris (avec animation de zoom)
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPosition, 15));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);*/

            /*googleMap.addMarker(new MarkerOptions().title("Rue Joss").position(Bonanjo).visible(true));

            //centre la google map sur Paris (avec animation de zoom)
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bonanjo, 15));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);*/


      //  }
        //else {

                    googleMap.addMarker(new MarkerOptions().title("Immeuble Socar").position(Akwa));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Akwa, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Ancien Dalip").position(Dalip));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Dalip, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Feu rouge Bessengue").position(Bessengue));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bessengue, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Tradex Bonamoussadi").position(Bonamoussadi));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bessengue, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("ENEO Ndokotti").position(Ndokotti));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Ndokotti, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Carrefour Marché Dakar").position(Dakar));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Dakar, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("carrefour Anatole").position(New_Bell));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(New_Bell, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Marché Mboppi").position(Mboppi));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mboppi, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Montée Marché cité des palmiers").position(Palmiers));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Palmiers, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Echangeur nouvelle route").position(Bonaberi));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bonaberi, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                    googleMap.addMarker(new MarkerOptions().title("Boulevard des nations unies").position(Nkoulmitag));

                    //centre la google map sur Paris (avec animation de zoom)
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Nkoulmitag, 15));
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
        }



}
