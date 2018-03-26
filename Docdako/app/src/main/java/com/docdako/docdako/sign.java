package com.docdako.docdako;

/**
 * Created by khant on 3/23/2018.
 */
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class sign extends Activity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.sign_in_up);

        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);

        // Capture button clicks
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(sign.this,page_1.class);
                if(isNetworkAvailable()) {
                    startActivity(myIntent);
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Sorry, No Internet Connection Available";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
    });
        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(sign.this,page_1.class);
                if(isNetworkAvailable()) {
                    startActivity(myIntent);
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Sorry, No Internet Connection Available";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
}
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

