package wmotion.co.id.temantreker;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @BindView(R.id.friendsList)
    RecyclerView friendsLists;

    private FriendsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        ButterKnife.bind(this);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        initView();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        for (int i = 0; i < TemporaryData.friendsLocation.size(); i++) {
            LatLng latLng = TemporaryData.friendsLocation.get(i);
            String name = TemporaryData.friendsName.get(i);
            mMap.addMarker(new MarkerOptions().position(latLng).title(name));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        }

    }


    private void initView() {
        LinearLayoutManager layoutOrder =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        friendsLists.setLayoutManager(layoutOrder);
        friendsLists.setHasFixedSize(true);

        adapter = new FriendsListAdapter(this, new FriendsListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Log.d("Get position ", position + "");
                mMap.moveCamera(CameraUpdateFactory
                        .newLatLng(TemporaryData.friendsLocation.get(position)));
            }
        });

        friendsLists.setAdapter(adapter);
    }
}
