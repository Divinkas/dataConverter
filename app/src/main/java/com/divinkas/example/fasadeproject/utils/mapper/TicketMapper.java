package com.divinkas.example.fasadeproject.utils.mapper;

import com.divinkas.example.fasadeproject.utils.ICallbackConverter;
import com.divinkas.example.fasadeproject.viewmodel.model.TicketModel;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;
import com.divinkas.example.fasadeproject.viewmodel.response.TicketResponse;

public class TicketMapper extends BaseMapper<TicketModel> {

    public TicketMapper() {
        super(new TicketModel());
    }

    @Override
    public void onMapped(BaseResponse response, ICallbackConverter<TicketModel> callback) {
        TicketResponse response_ticket = (TicketResponse) response;

        model.setId(response_ticket.getIdTicket());
        model.setName(response_ticket.getNameTicket());

        sendToMain(model, callback);
    }

}
