import java.util.Arrays;

/**
 * Created by Dimandus on 11.10.2015.
 */

public class Tester {

    /**
     * ������ ����� ��������� ������� � ����������� ��������� ������� � ������
     * @return ������ ���� ��� ���
     */
    public static boolean testCurrentCharInString() {
        boolean allOk = true;

        //������� ��������
        if (Solver.currentCharInString('A', "MAMA") != 2) {
            allOk = false;
        }

        //������� ������
        if (Solver.currentCharInString('A', "") != 0) {
            allOk = false;
        }

        //������� ������
        if (Solver.currentCharInString('A', "        ") != 0) {
            allOk = false;
        }

        //� ����� ��������
        if (Solver.currentCharInString('A', " A    A ") != 2) {
            allOk = false;
        }

        //��� ����������
        if (Solver.currentCharInString('Q', "MAMA") != 0) {
            allOk = false;
        }

        //������ �����������
        String nullStr = null;
        if (Solver.currentCharInString('A', nullStr) != 0) {
            allOk = false;
        }

        return allOk;
    }


    /**
     * ������ ����� ��������� ������� � ����������� ���������� � �������
     * @return ������ ���� ��� ���
     */
    public static boolean testArrayDuplicates() {
        boolean allOk = true;

        String[] testMas = {"AA", "BB", "AA"};

        //������� ��������
        if (Solver.arrayDuplicates(testMas) != true) {
            allOk = false;
        }

        //��� ����������
        if (Solver.arrayDuplicates(new String[]{"AA", "BB"}) != false) {
            allOk = false;
        }

        //������ �����������
        String[] nullMas = new String[5];
        if (Solver.arrayDuplicates(nullMas) != false) {
            allOk = false;
        }
        return allOk;
    }

    /**
     * ������ ����� ��������� ������� � ���������� ������
     * @return ������ ���� ��� ���
     */
    public static boolean testMultiMatr() {
        boolean allOk = true;

        Matrix testMatr = new Matrix(new double[][]{{1}});
        Matrix resultMatr;

        //������� ��������
        resultMatr = Solver.multiMatr(new Matrix(new double[][]{{1}}), new Matrix(new double[][]{{1}}));
        if (!(Matrix.isEqual(resultMatr, testMatr))) {
            allOk = false;
        }

        //������������ ������������
        testMatr = new Matrix(1, 1);
        resultMatr = Solver.multiMatr(new Matrix(new double[][]{{1, 2}}), new Matrix(new double[][]{{1}}));
        if (!(Matrix.isEqual(resultMatr, testMatr))) {
            allOk = false;
        }


        return allOk;
    }

    /**
     * ������ ����� ��������� ������� � ������������ ��������
     * @return ������ ���� ��� ���
     */
    public static boolean testArraysCross() {
        boolean allOk = true;


        //����������� ��������
        if (!Arrays.equals(Solver.arraysCross(new double[]{1, 2, 3}, new double[]{2}), new double[]{2})) {
            allOk = false;
        }

        //���� ��� �����������
        if (!Arrays.equals(Solver.arraysCross(new double[]{1, 2, 3}, new double[]{4, 5, 6}), new double[]{})) {
            allOk = false;
        }

        return allOk;
    }
}
