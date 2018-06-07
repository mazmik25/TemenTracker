package wmotion.co.id.temantreker;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class TemporaryData {

    public static final List<Integer> friendsAvatar = new ArrayList<Integer>(){{
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
        add(R.mipmap.ic_launcher_round);
    }};

    public static final List<String> friendsName = new ArrayList<String>(){{
        add("Suci");
        add("Hafizh");
        add("Pandu");
        add("Rakhul");
        add("Azmi");
        add("Patrick");
        add("Jihada");
        add("Della");
        add("Sarah");
        add("Nabilah");
    }};

    public static final List<LatLng> friendsLocation = new ArrayList<LatLng>(){{
        add(new LatLng(-6.1718483,106.6329608));
        add(new LatLng(-6.408712,106.7881574));
        add(new LatLng(-6.5976289,106.7973811));
        add(new LatLng(-6.3014501,106.7760412));
        add(new LatLng(-6.3705863,106.8214165));
        add(new LatLng(-6.1915504,106.7306074));
        add(new LatLng(-6.1462085,106.8151206));
        add(new LatLng(-6.3714593,106.8123933));
        add(new LatLng(-6.3674221,106.8493861));
        add(new LatLng(-6.372998,106.8326143));
    }};

    public static List<Integer> getFriendsAvatar() {
        return friendsAvatar;
    }

    public static List<String> getFriendsName() {
        return friendsName;
    }

    public static List<LatLng> getFriendsLocation() {
        return friendsLocation;
    }
}
