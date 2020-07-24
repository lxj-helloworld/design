package factory;

/**
 * 具体的产品实现类
 */
public class IDCard extends Product{
    private String owner;
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用了" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
