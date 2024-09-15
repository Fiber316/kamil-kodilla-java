package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.jupiter.api.*;


public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Test for adding shape")
    @Test
    void testCaseAddFShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(10);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assertions.assertEquals(1, shapeCollector.shapes.size());
    }
    @DisplayName("Test for removing shape")
    @Test
    void testCaseAddShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(10);
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertEquals(0, shapeCollector.shapes.size());
    }
    @DisplayName("Test for getting shape")
    @Test
    void testCaseGetShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(10);
        shapeCollector.addFigure(shape);
        //When
        Shape receivedShape = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(shape, receivedShape);
    }
   // @DisplayName("Test for getting list of figures")
   // @Test
    //void testCaseGetShape() {
        //Given
      //  ShapeCollector shapeCollector = new ShapeCollector();
      //  Shape shape1 = new Square(10);
     //   Shape shape2 = new Circle(10);
     //   Shape shape3 = new Triangle(10, 10);

       // shapeCollector.addFigure(shape1);
      //  shapeCollector.addFigure(shape2);
      //  shapeCollector.addFigure(shape3);

        //When
      //  shapeCollector.showFigures();
        //Then
       // Assertions.assertEquals(shape, receivedShape);
    //}
}
