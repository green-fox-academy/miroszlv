public class VariableMutation
{

    public static void main(String[] args) {

        int a = 3;
        a += 10;

        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean numberRelationF = f1 > f2;
        System.out.println(numberRelationF);

        int g1 = 350;
        int g2 = 200;
        boolean numberRelationI = (g2 * 2 ) > g1;
        System.out.println(numberRelationI);

        int h = 135798745;
        boolean numberRelationT = ( h / 11) > 0 ;
        System.out.println(numberRelationT);

        int i1 = 10;
        int i2 = 3;
        boolean numberRelationR = i1 >(i2 * i2) && i1 < (i2 * i2 * i2);
        System.out.println(numberRelationR);

        int j = 1521;
        boolean numberRelationE = (j / 3) == 0 || (j / 5) == 0;
        System.out.println(numberRelationE);

        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = k + " " + k + " " + k + " " + k;

        System.out.println(k);


    }
}
