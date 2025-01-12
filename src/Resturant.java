public class Resturant
{
    private  int resturantId;
    private String resturantName;
    private  int delivaryTime;
    private String cuisineTime;
    private String address;
    private float ratings;
    private boolean isActive;
    private int adminId;
    private String imgPath;

    public int getResturantId() {
        return resturantId;
    }

    public void setResturantId(int resturantId) {
        this.resturantId = resturantId;
    }
    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public int getDelivaryTime() {
        return delivaryTime;
    }

    public void setDelivaryTime(int delivaryTime) {
        this.delivaryTime = delivaryTime;
    }

    public String getCuisineTime() {
        return cuisineTime;
    }

    public void setCuisineTime(String cuisineTime) {
        this.cuisineTime = cuisineTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }
    public int getAdminId()
    {
        return adminId;
    }
    public void setAdminId(int adminId)
    {
        this.adminId = adminId;
    }
    public String getImgPath()
    {
        return imgPath;
    }
    public void setImgPath(String imgPath)
    {
        this.imgPath = imgPath;
    }
    @Override
    public String toString()
    {
        return "Resturant{" +
                "resturantId=" + resturantId +
                ", resturantName='" + resturantName + '\'' +
                ", delivaryTime=" + delivaryTime +
                ", cuisineTime='" + cuisineTime + '\'' +
                ", address='" + address + '\'' +
                ", ratings=" + ratings +
                ", isActive=" + isActive +
                ", adminId=" + adminId +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }

    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime, String address, float ratings, boolean isActive, int adminId, String imgPath) {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
        this.address = address;
        this.ratings = ratings;
        this.isActive = isActive;
        this.adminId = adminId;
        this.imgPath = imgPath;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime, String address, float ratings, boolean isActive, int adminId) {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
        this.address = address;
        this.ratings = ratings;
        this.isActive = isActive;
        this.adminId = adminId;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime, String address, float ratings, boolean isActive) {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
        this.address = address;
        this.ratings = ratings;
        this.isActive = isActive;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime, String address, float ratings) {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
        this.address = address;
        this.ratings = ratings;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime, String address)
    {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
        this.address = address;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime, String cuisineTime)
    {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
        this.cuisineTime = cuisineTime;
    }
    public Resturant(int resturantId, String resturantName, int delivaryTime)
    {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
        this.delivaryTime = delivaryTime;
    }
    public Resturant(int resturantId, String resturantName)
    {
        this.resturantId = resturantId;
        this.resturantName = resturantName;
    }
    public Resturant(int resturantId)
    {
        this.resturantId = resturantId;
    }
    public Resturant()
    {

    }
}
