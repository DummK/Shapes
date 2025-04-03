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
}
