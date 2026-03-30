/* public class exercicioForEWhile {

    public static void main(String[] args) {

        int cp = 1; //contador prinicipal
        int cs = 1; //contador secundário

        for (cp = 1 ; cp <= 5; cp++) {
            System.out.println("Número: " + cp);


            while (cs == cp){
                System.out.println(cs);
                System.out.println(cs);
                System.out.println(cs);
                cs++;
            }




    }
    }
}

 */


public class exercicioForEWhile {

    public static void main(String[] args) {

        for (int cp = 1 ; cp <= 5; cp++)
        {
            System.out.println("Número: " + cp);

            int cs = 1;

            while (cs <= 3)
            {
                System.out.println(cp);
                cs++;
            }
        }
    }
}
