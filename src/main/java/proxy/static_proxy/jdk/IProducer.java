package proxy.static_proxy.jdk;

public interface IProducer {
    /**
     * 销售
     *
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     *
     * @param money
     */
    public void afterService(float money);
}
