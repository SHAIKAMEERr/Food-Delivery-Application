public class Menu
{
    private int menuId;
    private int resturantId;
    private String menuName;
    private float price;
    private String description;
    private boolean isAlivable;
    private  String imgPath;
    public int getMenuId()
    {
        return menuId;
    }
    public void setMenuId(int menuId)
    {
        this.menuId = menuId;
    }
    public int getResturantId()
    {
        return resturantId;
    }
    public void setResturantId(int resturantId)
    {
        this.resturantId = resturantId;
    }
    public String getMenuName()
    {
        return menuName;
    }
    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public boolean isAlivable()
    {
        return isAlivable;
    }
    public void setAlivable(boolean alivable)
    {
        isAlivable = alivable;
    }
    public String getImgPath()
    {
        return imgPath;
    }
    public void setImgPath(String imgPath)
    {
        this.imgPath = imgPath;
    }
    public Menu(int menuId, int resturantId, String menuName, float price, String description, boolean isAlivable, String imgPath)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.isAlivable = isAlivable;
        this.imgPath = imgPath;
    }
    public Menu(int menuId, int resturantId, String menuName, float price, String description, boolean isAlivable)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.isAlivable = isAlivable;
    }
    public Menu(int menuId, int resturantId, String menuName, float price, String description)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
        this.menuName = menuName;
        this.price = price;
        this.description = description;
    }
    public Menu(int menuId, int resturantId, String menuName, float price)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
        this.menuName = menuName;
        this.price = price;
    }
    public Menu(int menuId, int resturantId, String menuName)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
        this.menuName = menuName;
    }
    public Menu(int menuId, int resturantId)
    {
        this.menuId = menuId;
        this.resturantId = resturantId;
    }
    public Menu(int menuId)
    {
        this.menuId = menuId;
    }
    public  Menu()
    {}
    @Override
    public String toString()
    {
        return "Menu{" +
                "menuId=" + menuId +
                ", resturantId=" + resturantId +
                ", menuName='" + menuName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isAlivable=" + isAlivable +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
