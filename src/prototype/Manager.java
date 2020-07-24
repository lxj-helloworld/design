package prototype;

import java.util.HashMap;

/**
 * Client 管理现有类，并可用现有类对象创建出新的对象
 */
public class Manager {
    private HashMap<String,Product> showCase = new HashMap<>();
    public void register(String name,Product product){
        showCase.put(name,product);
    }
    public Product createProduct(String prototypeName){
        return showCase.get(prototypeName).createClone();
    }
}

