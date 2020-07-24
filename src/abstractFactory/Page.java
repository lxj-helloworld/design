package abstractFactory;

import java.util.ArrayList;

/**
 * 抽象的产品
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        System.out.println(this.makeHtml());
        System.out.println(title + " " + author + " 编写完成");
    }
    public abstract String makeHtml();
}

