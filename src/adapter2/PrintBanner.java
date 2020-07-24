package adapter2;

import adapter1.Banner;

/*
适配旧方法的具体的实现方式
 */
public class PrintBanner extends Print{
    private Banner banner;
    PrintBanner(Banner banner){
        this.banner = banner;
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
