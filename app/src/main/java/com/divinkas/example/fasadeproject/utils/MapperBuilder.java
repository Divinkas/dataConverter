package com.divinkas.example.fasadeproject.utils;

import android.os.Handler;

import com.divinkas.example.fasadeproject.utils.mapper.BaseMapper;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;

public class MapperBuilder<T> {
    private BaseMapper<T> mapper;

    public MapperBuilder(BaseMapper<T> mapper) {
        this.mapper = mapper;
    }

    public void convert(final BaseResponse response, final ICallbackConverter<T> callback){
        new Handler().post(() -> mapper.onMapped(response, callback));
    }
}
