package decorator;

/**
 * 测试类
 */
public class Main {
    public static void main(String[] args){
        Person person = new Boy();
        //穿上贵的衣服
        PersonCloth personClothExpensive = new ExpensiveCloth(person);
        System.out.println("穿上昂贵的衣服");
        personClothExpensive.dressed();
        System.out.println("=============");
        //穿上便宜的衣服
        PersonCloth personClothCheap = new CheapCloth(person);
        System.out.println("穿上便宜的衣服");
        personClothCheap.dressed();

    }
}
