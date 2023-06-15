package gof.mediator;

interface ChatRoomMediator {
    void sendMessage(Colleague colleague, String message);
    void addColleague(Colleague colleague);
}
