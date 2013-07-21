package com.shekhar.wordgame.client;

import java.util.logging.Logger;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ClientEndpoint
public class WordgameClientEndpoint {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @OnOpen
    public void onOpen(Session session){
        logger.info("Connected ... "+session.getId());
    }
    
    @OnMessage
    public String onMessage(String message, Session session){
        return null;
    }
}
