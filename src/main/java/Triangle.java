
public class Triangle {
    private int side1, side2, side3;

    public Triangle() {
    }

    public Triangle(int side1) {
        this.side1 = side1;
    }

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getPerimeterOfTriangle() throws Exception {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            double p = side1 + side2 + side3;
            System.out.println("Perimeter of the Triangle is  " + p);
        } else throw new Exception("InvalidDataException " + side1 + " " + side2 + " " + side3);
    }

    public void getAreaOfTriangle() throws Exception {
        double area = 0;
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            double s = (side1 + side2 + side3) >> 1;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            System.out.println("Area of the Triangle is " + area);
        } else throw new Exception("InvalidDataException " + side1 + " " + side2 + " " + side3);
    }

    public void getPerimeterOfIsoscelesTriangle() throws Exception {
        if (side1 > 0 && side2 > 0) {
            double p = side1 * 2 + side2;
            System.out.println("Perimeter of the Isosceles Triangle is  " + p);
        } else throw new Exception("InvalidDataException " + side1 + " " + side2);
    }

    public void getAreaOfIsoscelesTriangle() throws Exception {

        if (side1 > 0 && side2 > 0) {
            double a = (side2 >> 2) * Math.sqrt((4 * side1 * side1) - (side2 * side2));
            System.out.println("Area of the Isosceles Triangle is  " + a);
        } else throw new Exception("InvalidDataException " + side1 + " " + side2);
    }

    public void getPerimeterOfEquilateralTriangle() throws Exception {
        if (side1 > 0) {
            double p = 3 * side1;
            System.out.println("Perimeter of the Equilateral Triangle " + p);
        } else throw new Exception("InvalidDataException " + side1);
    }

    public void getAreaOfEquilateralTriangle() throws Exception {
        if (side1 > 0) {
            double a = (Math.sqrt(3) / 4) * (side1 * side1);
            System.out.println("Area of the Equilateral Triangle is  " + a);
        } else throw new Exception("InvalidDataException " + side1);
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) throws Exception {
        if (side1 <= 0)
            throw new Exception("InvalidDataException" + side1);
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) throws Exception {
        if (side2 <= 0)
            throw new Exception("InvalidDataException" + side2);
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) throws Exception {
        if (side3 <= 0)
            throw new Exception("InvalidDataException" + side3);
    }
}

