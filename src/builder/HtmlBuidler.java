package builder;

/**
 * 具体的构建者1
 */
public class HtmlBuidler extends Builder{
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("<body>\r\n");
        stringBuffer.append("<title>" + title + "</title>\r\n");
    }

    @Override
    public void makeString(String string) {
        stringBuffer.append("<p>" + string + "</p>\r\n");
    }

    @Override
    public void makeItems(String item) {
        stringBuffer.append("<ul><li>" + item + "</li></ul>\r\n");
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    @Override
    public void close() {
        stringBuffer.append("</body>\r\n");
    }

}
