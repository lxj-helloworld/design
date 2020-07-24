package component;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件和文件夹的抽象类
 *
 * 叶子角色和复合物角色的父类
 */
public abstract class Dir {
    //声明一个List元素存储文件夹下的所有元素
    protected List<Dir> dirs = new ArrayList<>();
    private String name;//当前文件或者文件夹的名称
    public Dir(String name) {
        this.name = name;
    }
    //添加一个文件或者文件夹
    public abstract void addDir(Dir dir);
    //移除一个文件或者文件夹
    public abstract void removeDir(Dir dir);
    //清除文件夹下的所有元素
    public abstract void clear();
    //输入文件夹目录结构
    public abstract void print();
    //获取文件夹下所有的文件或者文件夹
    public abstract List<Dir> getFiles();
    //获取文件或者文件夹的名称

    public String getName() {
        return name;
    }
}
