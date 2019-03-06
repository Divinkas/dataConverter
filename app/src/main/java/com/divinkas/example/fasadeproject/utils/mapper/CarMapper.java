package com.divinkas.example.fasadeproject.utils.mapper;

import com.divinkas.example.fasadeproject.viewmodel.model.TicketModel;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;

public class CarMapper extends BaseMapper<TicketModel> {

    public CarMapper(ICallbackConverter<TicketModel> callback) {
        super(callback);
    }

    @Override
    public void convertResponse(BaseResponse response) {
        TicketModel model = new TicketModel();
        model.setId(2);


        onMapped(model, callback);
    }
}
