package proxy;

public class Client {
    public static void main(String[] args){
        //构造一个小明
        ILawsuiit xiaoming = new XiaoMing();
        //构造一个代理律师
        ILawsuiit lawer = new Laywer(xiaoming);
        //律师提出诉讼申请
        lawer.submit();
        //律师进行举证
        lawer.burden();
        //律师代替小明进行辩护
        lawer.defend();
        //律师完成诉讼
        lawer.finish();
    }
}
