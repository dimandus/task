import java.util.Arrays;
import java.util.List;

/**
 * Created by Dimandus on 11.10.2015.
 */
public class Solver {


    /**
     * ������ ������� ������� ���������� ��������� ������� � ������
     *
     * @param symbol �������� ������
     * @param source ������, � ������� ������� �����
     * @return ���������� ���������
     */
    public static int currentCharInString(char symbol, String source) {
        if (source == null) {
            return 0;
        }

        int entries = 0;
        for (int i = 0; i < source.length(); i++) {
            if (symbol == source.charAt(i)) {
                entries++;
            }
        }
        return entries;
    }


    /**
     * ������� �������, ������� �� ���� �� ���� ��������
     *
     * @param mas ������ � ������� ������
     * @return ���� �� ���������
     */
    public static boolean arrayDuplicates(String[] mas) {
        if (mas == null || mas.length == 0) { //���� ��� ������ ������
            return false;
        }

        boolean res = false;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] != null && mas[j] != null) {
                    if (mas[i].equals(mas[j])) {
                        res = true;
                    }
                }
            }
        }

        return res;
    }


    /**
     * ������������ ��������� ������������ ������
     *
     * @param left  ������ �������
     * @param right ������ �������
     * @return �������-�����
     */
    public static Matrix multiMatr(Matrix left, Matrix right) {

        if (left == null || right == null) {
            return null;
        }

        if (left.columnCount != right.rowCount) {
            return null;
        }

        Matrix res = new Matrix(left.rowCount, right.columnCount);
        for (int i = 0; i < left.rowCount; i++) {

            for (int j = 0; j < right.columnCount; j++) {
                double itemToWrite = 0;
                for (int k = 0; k < left.columnCount; k++) {
                    itemToWrite += left.getElementAt(i, k) * right.getElementAt(k, j);
                }
                res.setElementAt(i, j, itemToWrite);
            }

        }

        return res;
    }


    /**
     * ������� ����������� ��������
     *
     * @param firstArr  ������ ������
     * @param secondArr ������ ������
     * @return ������, � ������� ���������� �������� �����������
     */
    public static double[] arraysCross(double[] firstArr, double[] secondArr) {

        if(firstArr == null || secondArr ==null){
            return  null;
        }



        double[] arrayCross = new double[Math.min(firstArr.length, secondArr.length)];
        int resCounter = 0;
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]) {
                    arrayCross[resCounter] = firstArr[i];
                    resCounter++;
                }
            }
        }

        return Arrays.copyOf(arrayCross, resCounter);
    }


}
