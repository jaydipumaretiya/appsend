package com.tomclaw.appsend.core;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by solkin on 23.09.17.
 */
@EBean(scope = EBean.Scope.Singleton)
public class StoreServiceHolder {

    private StoreService service;

    @AfterInject
    void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://appsend.store/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(StoreService.class);
    }

    public StoreService getService() {
        return service;
    }
}
