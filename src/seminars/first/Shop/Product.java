package seminars.first.Shop;

public class Product {

    private Integer cost; // Стоимость продукта
    private String title; // Название

    public Product(String name, int price) {
        title = name;
        cost = price;
    }


    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return cost.equals(other.cost) && title.equals(other.title);
    }
}