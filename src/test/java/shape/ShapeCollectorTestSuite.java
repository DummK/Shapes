package shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector;

    @BeforeEach
        void beforeEach() {
            System.out.println("Test started");
        }

    @AfterEach
        void afterEach() {
            System.out.println("Test finished");
        }

    @Nested
        @DisplayName("Test Circle")
            class CircleTest {

                @Test
                    @DisplayName("Test Add Circle to ArrayList")
                        void testAddCircle() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Circle circle = new Circle(10);

                            //When
                            shapeCollector.addFigure(circle);

                            //Then
                            assertEquals(shapeCollector.getFigure(0), circle);
                        }

                @Test
                    @DisplayName("Test Remove Circle from ArrayList")
                        void testRemoveCircle() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Circle circle = new Circle(10);
                            shapeCollector.addFigure(circle);

                            //When
                            boolean result = shapeCollector.removeFigure(circle);

                            //Then
                            assertTrue(result);
                        }

                @Test
                    @DisplayName("Test Get Circle from ArrayList")
                        void testGetCircle() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Circle circle = new Circle(10);
                            shapeCollector.addFigure(circle);

                            //When
                            Shape result = shapeCollector.getFigure(0);

                            //Then
                            assertEquals(result, circle);
                        }
            }

    @Nested
        @DisplayName("Test Square")
            class SquareTest {

                @Test
                    @DisplayName("Test Add Square to ArrayList")
                        void testAddSquare() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Square square = new Square(10);

                            //When
                            shapeCollector.addFigure(square);

                            //Then
                            assertEquals(shapeCollector.getFigure(0), square);
                        }

                @Test
                    @DisplayName("Test Remove Square from ArrayList")
                        void testRemoveSquare() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Square square = new Square(10);
                            shapeCollector.addFigure(square);

                            //When
                            boolean result = shapeCollector.removeFigure(square);

                            //Then
                            assertTrue(result);
                        }

                @Test
                    @DisplayName("Test Get Square from ArrayList")
                        void testGetSquare() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Square square = new Square(10);
                            shapeCollector.addFigure(square);

                            //When
                            Shape result = shapeCollector.getFigure(0);

                            //Then
                            assertEquals(result, square);
                        }
            }

    @Nested
        @DisplayName("Test triangle")
            class TriangleTest {

                @Test
                    @DisplayName("Test Add Triangle to ArrayList")
                        void testAddTriangle() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Triangle triangle = new Triangle(10, 10, 10, 5);

                            //When
                            shapeCollector.addFigure(triangle);

                            //Then
                            assertEquals(shapeCollector.getFigure(0), triangle);
                        }

                @Test
                    @DisplayName("Test Remove Square from ArrayList")
                        void testRemoveSquare() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Triangle triangle = new Triangle(10, 10, 10, 5);
                            shapeCollector.addFigure(triangle);

                            //When
                            boolean result = shapeCollector.removeFigure(triangle);

                            //Then
                            assertTrue(result);
                        }

                @Test
                    @DisplayName("Test Get Square from ArrayList")
                        void testGetSquare() {
                            //Given
                            shapeCollector = new ShapeCollector();
                            Square square = new Square(10);
                            shapeCollector.addFigure(square);

                            //When
                            Shape result = shapeCollector.getFigure(0);

                            //Then
                            assertEquals(result, square);
                        }
            }
}
