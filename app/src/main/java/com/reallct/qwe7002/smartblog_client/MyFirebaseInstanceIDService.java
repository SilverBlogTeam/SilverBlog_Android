package com.reallct.qwe7002.smartblog_client;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //request.send_request("{\"token\":\""+refreshedToken+"\"}","sign_notify");
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }
}
