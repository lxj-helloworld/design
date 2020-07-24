package abstractFactory;

/**
 * 具体的零件
 */
public class ListLink extends Link{

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href = '"+url+"'/> " + caption + "</li>";
    }
}
