package com.divinkas.example.fasadeproject.utils;

import android.os.Handler;

import com.divinkas.example.fasadeproject.utils.mapper.BaseMapper;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;

public class MapperStrategy<T> {
    private BaseMapper<T> mapper;

    public MapperStrategy(BaseMapper<T> mapper) {
        this.mapper = mapper;
    }

    public void convert(final BaseResponse response){
        new Handler().post(() -> mapper.convertResponse(response));
    }
}
