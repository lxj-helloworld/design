package FlyWeight;

public class Main {
    public static void main(String[] args){
        Ticket ticket1 = TicketFactory.getTicket("北京","上海");
        ticket1.showTicketInfo("上铺");
        Ticket ticket2 = TicketFactory.getTicket("北京","上海");
        ticket2.showTicketInfo("下铺");
        Ticket ticket3 = TicketFactory.getTicket("北京","青岛");
        ticket3.showTicketInfo("坐铺");
    }
}
