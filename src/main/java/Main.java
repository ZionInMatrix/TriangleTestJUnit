public class Main {
    public static void main(String[] args) {
        Triangle originalTriangle = new Triangle(12, 12, 0);
        Triangle isoscelesTriangle = new Triangle(12, 12);
        Triangle equilateralTriangle = new Triangle(12, 12);
        System.out.println("========================================");
        try {
            originalTriangle.getPerimeterOfTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            originalTriangle.getAreaOfTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========================================");
        try {
            isoscelesTriangle.getPerimeterOfIsoscelesTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            isoscelesTriangle.getAreaOfIsoscelesTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========================================");
        try {
            equilateralTriangle.getPerimeterOfEquilateralTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            equilateralTriangle.getAreaOfEquilateralTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
