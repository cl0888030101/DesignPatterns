package gof.mediator;

import java.util.List;

public abstract class Colleague {
    protected String name;
    protected ChatRoomMediator chatRoomMediator;

    public Colleague(String name, ChatRoomMediator chatRoomMediator) {
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
