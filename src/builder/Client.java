package builder;

/**
 * 使用者
 */
public class Client {
    public static void main(String[] args){
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        StringBuffer stringBuffer = textBuilder.getStringBuffer();
        System.out.println("this is the textBuilder");
        System.out.println(stringBuffer);

        HtmlBuidler htmlBuidler = new HtmlBuidler();
        director = new Director(htmlBuidler);
        director.construct();
        stringBuffer = htmlBuidler.getStringBuffer();
        System.out.println("this is the htmlBuilder");
        System.out.println(stringBuffer);

    }
}
