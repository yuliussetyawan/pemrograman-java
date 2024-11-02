class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        // super keyword akan digunakan untuk mengakses parent method (Shape)
        return super.getCorner();
    }
}
