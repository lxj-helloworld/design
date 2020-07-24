package responsibility;

/**
 * 抽象的处理者
 */
public abstract class Leader {
    protected Leader nextLeader;

    /**
     * 自身能报销的额度权限
     * @return
     */
    public abstract int limit();

    /**
     * 处理报销行为
     * @param money
     */
    public abstract void handler(int money);

    /**
     * 处理报账请求
     * @param money
     */
    public final void handlerRequest(int money){
        if(money < limit()){ //如果自己能够处理，就处理
            handler(money);
        }else{
            //如果处理不了，传递给下一个处理者
            if(null != nextLeader){
                nextLeader.handlerRequest(money);
            }
        }
    }
}
