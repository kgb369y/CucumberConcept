package cucumber.steps.models;

public class Price {
    private String product;
    private String currency;
    private Integer price;

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product
     *            the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}
