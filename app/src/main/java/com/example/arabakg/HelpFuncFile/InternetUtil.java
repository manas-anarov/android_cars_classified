package com.example.arabakg.HelpFuncFile;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;



import java.net.URL;
import java.net.URLConnection;

public class InternetUtil {

    public static   boolean myInternetConnection(Context context){

        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (mWifi.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isOnline(Context context){


        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connManager.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()){
            return true;
        }else {
            return false;
        }

    }


    public static boolean isInternetOnline(Context context){


        if ( InternetUtil.myInternetConnection(context) || InternetUtil.isOnline(context)){
                return true;
        }else {
            Toast.makeText(context, "Проверьте интернет", Toast.LENGTH_SHORT).show();
            return false;
        }

    }




    public static boolean isConnectedToServer(String url, int timeout) {
        try{
            URL myUrl = new URL(url);
            URLConnection connection = myUrl.openConnection();
            connection.setConnectTimeout(timeout);
            connection.connect();

            return true;
        } catch (Exception e) {
            // Handle your exceptions
            return false;
        }
    }



}
