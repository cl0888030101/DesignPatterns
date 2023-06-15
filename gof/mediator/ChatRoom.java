package gof.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator{

    List<Colleague> colleagues;

    public ChatRoom() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague){
        if(colleagues.contains(colleague)){
            return;
        }
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(Colleague colleague, String message) {
        for (Colleague currColleague : colleagues){
            if (currColleague == colleague){
                System.out.println("name: " + currColleague.name + ", sending message: " + message);
            }else {
                currColleague.receive(message);
            }
        }
    }
}
