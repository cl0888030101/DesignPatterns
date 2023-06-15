package gof.mediator;

import java.util.List;

public class ColleagueImpl extends Colleague{

    public ColleagueImpl(String name, ChatRoomMediator chatRoomMediator) {
        super(name, chatRoomMediator);
    }

    @Override
    public void send(String message) {
        this.chatRoomMediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("name: " + this.name + ", received message: " + message);
    }
}
