package welding.taal.com.mobile1app.server.controller;



import retrofit.RestAdapter;
import welding.taal.com.mobile1app.Utils.Constants;

/**
 * Created by Suneesh on 4/16/2016.
 */
public class RetrofitSingleton {

    private static RestAdapter restAdapter;
    private static final String BASE_URL = Constants.BASE_URL;

    public static RestAdapter getRestAdapter(){
        if(restAdapter == null){
            restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(BASE_URL).build();
        }
        return restAdapter;
    }


}