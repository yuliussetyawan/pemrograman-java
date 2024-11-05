package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        // gunakan setter method
        category.setId("ID");
        // ini akan diignore akan class Category declare setter method dan menggunakan private attribute
        System.out.println(category.getId());
    }
}
