public class OrderItem
{
    private int orderItemId;
    private int orderId;
    private int menuId;
    private int quality;
    private float subTotal;

    public int getOrderItemId()
    {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId)
    {
        this.orderItemId = orderItemId;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public int getMenuId()
    {
        return menuId;
    }

    public void setMenuId(int menuId)
    {
        this.menuId = menuId;
    }

    public int getQuality()
    {
        return quality;
    }

    public void setQuality(int quality)
    {
        this.quality = quality;
    }

    public float getSubTotal()
    {
        return subTotal;
    }

    public void setSubTotal(float subTotal)
    {
        this.subTotal = subTotal;
    }

    public OrderItem(int orderItemId, int orderId, int menuId, int quality, float subTotal)
    {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.menuId = menuId;
        this.quality = quality;
        this.subTotal = subTotal;
    }
    public OrderItem(int orderItemId, int orderId, int menuId, int quality)
    {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.menuId = menuId;
        this.quality = quality;
    }
    public OrderItem(int orderItemId, int orderId, int menuId)
    {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.menuId = menuId;
    }
    public OrderItem(int orderItemId, int orderId)
    {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
    }
    public OrderItem(int orderItemId)
    {
        this.orderItemId = orderItemId;
    }
    public  OrderItem()
    {

    }
    @Override
    public String toString()
    {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderId=" + orderId +
                ", menuId=" + menuId +
                ", quality=" + quality +
                ", subTotal=" + subTotal +
                '}';
    }
}
