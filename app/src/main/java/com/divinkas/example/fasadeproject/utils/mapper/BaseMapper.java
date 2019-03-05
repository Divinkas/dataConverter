package com.divinkas.example.fasadeproject.utils.mapper;

import android.os.Handler;
import android.os.Looper;

import com.divinkas.example.fasadeproject.utils.ICallbackConverter;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;

public abstract class BaseMapper<T> {
    protected T model;

    public BaseMapper(T model) {
        this.model = model;
    }

    public abstract void onMapped(BaseResponse response, ICallbackConverter<T> callback);

    protected void sendToMain(T model, ICallbackConverter<T> callback){
        new Handler(Looper.getMainLooper()).post(() -> callback.setModel(model));
    }
}
