package la.hackspace.coreupgrade.davidsmz.miprimeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragmentMapa)).getMap();

        if (map != null){
            map.addMarker(new MarkerOptions()
            .position(new LatLng(-12.088443592644063, -77.00433388352394 ))
            .title("Mi Ubicacion")
            .snippet("Calle Morelli 110, San Borja"));

            map.addMarker(new MarkerOptions()
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.tarjeta3))
            .position(new LatLng(-12.088616692923909, -77.00445055961609))
            .title("Banco BBVA Continental")
            .snippet("Av. Javier Prado Este 2010, San Borja"));

            map.addMarker(new MarkerOptions()
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.tarjeta2))
            .position(new LatLng(-12.089424492748883, -77.00400531291962))
            .title("Banco Financiero")
            .snippet("Calle Morelli 151, San Borja"));

            map.addMarker(new MarkerOptions()
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.tarjeta1))
            .position(new LatLng(-12.088991743146007, -77.00428694486618))
            .title("Banco Interbank")
            .snippet("Calle Moreli 140, San Borja"));

            map.addMarker(new MarkerOptions()
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.tarjeta4))
            .position(new LatLng(-12.089251392991729, -77.00404018163681))
            .title("Banco Banbif")
            .snippet("Calle Morelli 141, San Borja"));
        }
    }
}
