public class testAbstractShape {
    public static void main(String[] args) {
        RectangleShape rectangle, rectRef;
        BoxShape box, boxRef;
        Shape refShape;
        rectangle = new RectangleShape(12, 4);
        System.out.println("Line 4: Rectangle \n" + rectangle);
        refShape = rectangle;
        System.out.println("\nPolymorphism: Invoking Subclass method with superclass object reference : =  "
                + refShape.area() + "\n");

    }

}
