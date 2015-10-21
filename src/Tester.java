import java.util.Arrays;

/**
 * Created by Dimandus on 11.10.2015.
 */

public class Tester {

    /**
     * Данный метод тестирует функцию с нахождением заданного символа в строке
     * @return прошел тест или нет
     */
    public static boolean testCurrentCharInString() {
        boolean allOk = true;

        //Обычная проверка
        if (Solver.currentCharInString('A', "MAMA") != 2) {
            allOk = false;
        }

        //Нулевой символ
        if (Solver.currentCharInString('A', "") != 0) {
            allOk = false;
        }

        //Нулевая строка
        if (Solver.currentCharInString('A', "        ") != 0) {
            allOk = false;
        }

        //С кучей пробелов
        if (Solver.currentCharInString('A', " A    A ") != 2) {
            allOk = false;
        }

        //Нет совпадений
        if (Solver.currentCharInString('Q', "MAMA") != 0) {
            allOk = false;
        }

        //Строка отсутствует
        String nullStr = null;
        if (Solver.currentCharInString('A', nullStr) != 0) {
            allOk = false;
        }

        return allOk;
    }


    /**
     * Данный метод тестирует функцию с нахождением дубликатов в массиве
     * @return прошел тест или нет
     */
    public static boolean testArrayDuplicates() {
        boolean allOk = true;

        String[] testMas = {"AA", "BB", "AA"};

        //Обычная проверка
        if (Solver.arrayDuplicates(testMas) != true) {
            allOk = false;
        }

        //Нет совпадений
        if (Solver.arrayDuplicates(new String[]{"AA", "BB"}) != false) {
            allOk = false;
        }

        //Массив отсутствует
        String[] nullMas = new String[5];
        if (Solver.arrayDuplicates(nullMas) != false) {
            allOk = false;
        }
        return allOk;
    }

    /**
     * Данный метод тестирует функцию с умножением матриц
     * @return прошел тест или нет
     */
    public static boolean testMultiMatr() {
        boolean allOk = true;

        Matrix testMatr = new Matrix(new double[][]{{1}});
        Matrix resultMatr;

        //Обычная проверка
        resultMatr = Solver.multiMatr(new Matrix(new double[][]{{1}}), new Matrix(new double[][]{{1}}));
        if (!(Matrix.isEqual(resultMatr, testMatr))) {
            allOk = false;
        }

        //Несовпадение размерностей
        testMatr = new Matrix(1, 1);
        resultMatr = Solver.multiMatr(new Matrix(new double[][]{{1, 2}}), new Matrix(new double[][]{{1}}));
        if (!(Matrix.isEqual(resultMatr, testMatr))) {
            allOk = false;
        }


        return allOk;
    }

    /**
     * Данный метод тестирует функцию с пересечением массивов
     * @return прошел тест или нет
     */
    public static boolean testArraysCross() {
        boolean allOk = true;


        //Стандартная проверка
        if (!Arrays.equals(Solver.arraysCross(new double[]{1, 2, 3}, new double[]{2}), new double[]{2})) {
            allOk = false;
        }

        //Если нет пересечения
        if (!Arrays.equals(Solver.arraysCross(new double[]{1, 2, 3}, new double[]{4, 5, 6}), new double[]{})) {
            allOk = false;
        }

        return allOk;
    }
}
