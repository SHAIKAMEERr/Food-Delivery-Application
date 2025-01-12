import java.time.LocalDate;

public class OrderHistory
{
    private int orderHistoryId;
    private int orderId;
    private int userId;
    private LocalDate dateTime;
    private float totalAmount;
    private String status;

    public int getOrderHistoryId() {
        return orderHistoryId;
    }

    public void setOrderHistoryId(int orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
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

    public OrderHistory(int orderHistoryId, int orderId, int userId, LocalDate dateTime, float totalAmount, String status) {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
        this.userId = userId;
        this.dateTime = dateTime;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public OrderHistory(int orderHistoryId, int orderId, int userId, LocalDate dateTime, float totalAmount) {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
        this.userId = userId;
        this.dateTime = dateTime;
        this.totalAmount = totalAmount;
    }
    public OrderHistory(int orderHistoryId, int orderId, int userId, LocalDate dateTime) {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
        this.userId = userId;
        this.dateTime = dateTime;
    }
    public OrderHistory(int orderHistoryId, int orderId, int userId) {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
        this.userId = userId;
    }
    public OrderHistory(int orderHistoryId, int orderId)
    {
        this.orderHistoryId = orderHistoryId;
        this.orderId = orderId;
    }
    public OrderHistory(int orderHistoryId)
    {
        this.orderHistoryId = orderHistoryId;
    }
    public  OrderHistory()
    {

    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "orderHistoryId=" + orderHistoryId +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", dateTime=" + dateTime +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
