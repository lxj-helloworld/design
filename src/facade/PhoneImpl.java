package facade;

public class PhoneImpl implements Phone{
    @Override
    public void dail() {
        System.out.println("拨号");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
