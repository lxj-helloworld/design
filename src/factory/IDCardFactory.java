package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成产品的工厂，实现了产品的生产过程
 */
public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public List<String> getOwners() {
        return owners;
    }

    @Override
    protected void resisterProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
