//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        final FigureOperator operator = new FigureOperator();

        operator.addFigure(new Circle(12.0));
        operator.addFigure(new Rectangle(2.0, 4.0));
        operator.addFigure(new Square(5.0));
        operator.addFigure(new Triangle(3.0, 4.0, 5.0));
        operator.addFigure(new Parallelogram(2.0, 3.0, 133.0));

        System.out.println("Before sort:\n" + operator);
        operator.sortFigures(FigureOperator.SortPropertyType.AREA);
        System.out.println("After sort:\n" + operator);




    }



}
