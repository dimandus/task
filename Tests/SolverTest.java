import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimandus on 20.10.2015.
 */
public class SolverTest {

    @Test
    public void testCurrentCharInStringNotEmpty() throws Exception {
        assertEquals("Основной функционал не работает", 2, Solver.currentCharInString('A', "MAMA"));
    }

    @Test
    public void testCurrentCharInStringWithEmptyString() throws Exception {
        assertEquals("В пустой строке не должно быть совпадений", 0, Solver.currentCharInString('A', ""));
    }

    @Test
    public void testCurrentCharInStringWithSpaces() throws Exception {
        assertEquals("Пробелы не должны мешать", 0, Solver.currentCharInString('A', "        "));
    }

    @Test
    public void testCurrentCharInStringNoMatches() throws Exception {
        assertEquals("Если нет совпадений", 0, Solver.currentCharInString('Q', "MAMA"));
    }

    @Test
    public void testCurrentCharInStringNullString() throws Exception {
        assertEquals("Строка отсутствует", 0, Solver.currentCharInString('A', null));
    }

    @Test
    public void testArrayDuplicatesHasDuplicates() throws Exception {
        assertTrue("Должно быть совпадение", Solver.arrayDuplicates(new String[]{"AA", "BB", "AA"}));
    }

    @Test
    public void testArrayDuplicatesWithEmptyArray() throws Exception {
        assertFalse("Не должно быть совпадений", Solver.arrayDuplicates(new String[5]));
    }

    @Test
    public void testMultiMatrNormal() throws Exception {
        assertArrayEquals("Не умножаются верно", Solver.multiMatr(new Matrix(new double[][]{{1}}), new Matrix(new double[][]{{1}})).items,
                new Matrix(new double[][]{{1}}).items);

    }

    @Test
    public void testMultiMatrDimensionsNotMatch() throws Exception {
        assertNull("На выходе должен быть null", Solver.multiMatr(new Matrix(new double[][]{{1, 2}}), new Matrix(new double[][]{{1}})));

    }

    @Test
    public void testMultiMatrOneOrMoreMatrixIsNull() throws Exception {
        assertNull("На выходе должен быть null", Solver.multiMatr(new Matrix(null), new Matrix(new double[][]{{1, 2}, {1, 2}})));
        assertNull("На выходе должен быть null", Solver.multiMatr(new Matrix(new double[][]{{1, 2}, {1, 2}}), null));
        assertNull("На выходе должен быть null", Solver.multiMatr(null, null));

    }

    @Test
    public void testArraysCrossHasMatch() throws Exception {
        assertArrayEquals("Должны найтись совпадения", Solver.arraysCross(new double[]{1, 2, 3}, new double[]{2, 3, 4}), new double[]{2,3},Double.MIN_VALUE);

    }

    @Test
    public void testArraysCrossHasNotMatch() throws Exception {
        assertArrayEquals("Совпадений нет", Solver.arraysCross(new double[]{1, 2, 3}, new double[]{4, 5, 6}), new double[]{},Double.MIN_VALUE);

    }

    @Test
    public void testArraysCrossOneOrMoreArraysIsNull() throws Exception {
        assertNull("Совпадений нет", Solver.arraysCross(null, new double[]{4, 5, 6}));
        assertNull("Совпадений нет", Solver.arraysCross(new double[]{1, 2, 3}, null));
        assertNull("Совпадений нет", Solver.arraysCross(null, null));

    }

    @Test
    public void testArraysCrossWithEmptyArrays() throws Exception {
        assertArrayEquals("Совпадений нет", Solver.arraysCross(new double[]{1, 2, 3}, new double[]{}), new double[]{}, Double.MIN_VALUE);
        assertArrayEquals("Совпадений нет", Solver.arraysCross(new double[]{}, new double[]{1, 2, 3}), new double[]{}, Double.MIN_VALUE);
        assertArrayEquals("Совпадений нет", Solver.arraysCross(new double[]{}, new double[]{}), new double[]{}, Double.MIN_VALUE);
    }
}