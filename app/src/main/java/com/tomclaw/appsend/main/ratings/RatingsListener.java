package com.tomclaw.appsend.main.ratings;

/**
 * Created by solkin on 03.08.17.
 */
public interface RatingsListener {

    int STATE_LOADED = 0x01;
    int STATE_LOADING = 0x02;
    int STATE_FAILED = 0x03;

    int onNextPage();

    void onRetry();

}
