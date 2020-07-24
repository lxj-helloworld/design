package template;

public class RunTemplate {
    public static void main(String[] args){
        AbstractDisplay charDisplay = new CharDisplay('a');
        AbstractDisplay stringDiaplay = new StringDisplay("message");
        System.out.println("这是第一种算法实现的输入内容：");
        charDisplay.display();
        System.out.println("这是第二种算法实现的输入内容：");
        stringDiaplay.display();
    }
}
