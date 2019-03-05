package com.divinkas.example.fasadeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.divinkas.example.fasadeproject.utils.ICallbackConverter;
import com.divinkas.example.fasadeproject.utils.MapperBuilder;
import com.divinkas.example.fasadeproject.utils.mapper.TicketMapper;
import com.divinkas.example.fasadeproject.viewmodel.model.TicketModel;
import com.divinkas.example.fasadeproject.viewmodel.response.TicketResponse;

public class MainActivity extends AppCompatActivity implements ICallbackConverter<TicketModel> {

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
        MapperBuilder<TicketModel> mapperBuilder = new MapperBuilder<>(new TicketMapper());
        mapperBuilder.convert(response, this);
    }

    @Override
    public void setModel(TicketModel model) {
        // use converted data
        int id = model.getId();
    }
}
