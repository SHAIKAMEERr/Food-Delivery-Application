import java.time.LocalDate;

public class OrderTable
{
    private int orderId;
    private int resturantId;
    private int userId;
    private LocalDate orderDate;
    private float totalAmount;
    private String status;
    private String paymentMode;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getResturantId() {
        return resturantId;
    }

    public void setResturantId(int resturantId) {
        this.resturantId = resturantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public OrderTable(int orderId, int resturantId, int userId, LocalDate orderDate, float totalAmount, String status, String paymentMode) {
        this.orderId = orderId;
        this.resturantId = resturantId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paymentMode = paymentMode;
    }
    public OrderTable(int orderId, int resturantId, int userId, LocalDate orderDate, float totalAmount, String status)
    {
        this.orderId = orderId;
        this.resturantId = resturantId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public OrderTable(int orderId, int resturantId, int userId, LocalDate orderDate, float totalAmount)
    {
        this.orderId = orderId;
        this.resturantId = resturantId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
    public OrderTable(int orderId, int resturantId, int userId, LocalDate orderDate)
    {
        this.orderId = orderId;
        this.resturantId = resturantId;
        this.userId = userId;
        this.orderDate = orderDate;
    }
    public OrderTable(int orderId, int resturantId, int userId)
    {
        this.orderId = orderId;
        this.resturantId = resturantId;
        this.userId = userId;
    }
    public OrderTable(int orderId, int resturantId)
    {
        this.orderId = orderId;
        this.resturantId = resturantId;
    }
    public OrderTable(int orderId)
    {
        this.orderId = orderId;
    }
    public OrderTable()
    {

    }
    @Override
    public String toString()
    {
        return "OrderTable{" +
                "orderId=" + orderId +
                ", resturantId=" + resturantId +
                ", userId=" + userId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }
}
