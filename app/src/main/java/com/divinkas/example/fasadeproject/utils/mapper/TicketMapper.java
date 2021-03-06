package com.divinkas.example.fasadeproject.utils.mapper;

import com.divinkas.example.fasadeproject.viewmodel.model.TicketModel;
import com.divinkas.example.fasadeproject.viewmodel.response.BaseResponse;
import com.divinkas.example.fasadeproject.viewmodel.response.TicketResponse;

public class TicketMapper extends BaseMapper<TicketModel> {

    public TicketMapper(ICallbackConverter<TicketModel> callback) {
        super(callback);
    }

    @Override
    public void convertResponse(BaseResponse response) {
        TicketResponse ticketResponse = (TicketResponse) response;

        TicketModel model = new TicketModel();

        model.setId(ticketResponse.getIdTicket());
        model.setName(ticketResponse.getNameTicket());

        onMapped(model, callback);
    }

}
