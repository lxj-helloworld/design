package builder;

/**
 * 具体的构建者2
 */
public class TextBuilder extends Builder{
    private StringBuffer stringBuffer = new StringBuffer("");
    @Override
    public void makeTitle(String title) {
        stringBuffer.append("================");
        stringBuffer.append("[" + title + "]");
        stringBuffer.append("\r\n");
    }

    @Override
    public void makeString(String string) {
        stringBuffer.append("#####" + string + "\r\n");
    }

    @Override
    public void makeItems(String item) {
        stringBuffer.append("@@@ " + item + "\r\n");
    }

    @Override
    public void close() {
        stringBuffer.append("================");
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }
}
