package FlyWeight;

import java.util.Random;

public class TrainTicket implements Ticket{
    public String from;
    public String to;
    public String bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(100);
        System.out.println("购买从" + from + "到" + to + "的" + bunk + " 火车票，价格为： " + price);
    }
}
