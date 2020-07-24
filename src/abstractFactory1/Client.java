package abstractFactory1;

public class Client {
    public static void main(String args[]){
        //生产Q3的工厂
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();
        System.out.println("===============");
        //生产Q7的工厂
        CarFactory carFactoryQ7 = new Q7Factory();
        carFactoryQ7.createTire().tire();
        carFactoryQ7.createEngine().engine();
        carFactoryQ7.createBrake().brake();
    }
}
