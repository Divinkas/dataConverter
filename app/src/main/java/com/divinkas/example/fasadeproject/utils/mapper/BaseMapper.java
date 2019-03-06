package com.divinkas.example.fasadeproject.utils.mapper;

import android.os.Handler;
import android.os.Looper;

import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;

public abstract class BaseMapper<T> {
    public ICallbackConverter<T> callback;

    public BaseMapper(ICallbackConverter<T> callback) {
        this.callback = callback;
    }

    public abstract void convertResponse(BaseResponse response);

    protected void onMapped(T model, ICallbackConverter<T> callback){
        new Handler(Looper.getMainLooper()).post(() -> callback.onModelConverted(model));
    }
    public interface ICallbackConverter<T> {
        void onModelConverted(T model);
    }
}
