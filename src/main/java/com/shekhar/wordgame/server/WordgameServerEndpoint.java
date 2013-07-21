package com.shekhar.wordgame.server;

import java.util.logging.Logger;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/game")
public class WordgameServerEndpoint {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @OnOpen
    public void onOpen(Session session) {
        logger.info("Connected ... " + session.getId());
    }
    
    @OnMessage
    public String onMessage(String message , Session session){
        return "";
    }
    
}
