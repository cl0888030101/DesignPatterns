package gof.mediator;

public class ChatRoomTest {
    public static void main(String[] args) {

        ChatRoomMediator chatRoom = new ChatRoom();
        Colleague c1 = new ColleagueImpl("c1", chatRoom);
        Colleague c2 = new ColleagueImpl("c2", chatRoom);
        Colleague c3 = new ColleagueImpl("c3", chatRoom);
        Colleague c4 = new ColleagueImpl("c4", chatRoom);

        chatRoom.addColleague(c1);
        chatRoom.addColleague(c2);
        chatRoom.addColleague(c3);
        chatRoom.addColleague(c4);

        c1.send("this is message from c1");
    }
}
