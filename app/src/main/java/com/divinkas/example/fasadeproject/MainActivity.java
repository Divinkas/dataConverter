package com.divinkas.example.fasadeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.divinkas.example.fasadeproject.utils.MapperStrategy;
import com.divinkas.example.fasadeproject.utils.mapper.BaseMapper;
import com.divinkas.example.fasadeproject.utils.mapper.TicketMapper;
import com.divinkas.example.fasadeproject.viewmodel.model.TicketModel;
import com.divinkas.example.fasadeproject.viewmodel.response.TicketResponse;

public class MainActivity extends AppCompatActivity implements BaseMapper.ICallbackConverter<TicketModel> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create response
        TicketResponse response = new TicketResponse();
        response.setIdTicket(1);
        response.setNameTicket("qwe");
        response.setDateTicket("12-12-2019");

        // convert data
        MapperStrategy<TicketModel> mapperBuilder = new MapperStrategy<>(new TicketMapper(this));
        mapperBuilder.convert(response);
    }

    @Override
    public void onModelConverted(TicketModel model) {
        // use converted data
        int id = model.getId();
    }
}
