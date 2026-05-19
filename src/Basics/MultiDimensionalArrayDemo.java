package Basics;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {

        String[][] citys = new String[3][3];

        citys[0][0] = "İstanbul";
        citys[0][1] = "Tekirdağ";
        citys[0][2] = "Sakarya";
        citys[1][0] = "Malatya";
        citys[1][1] = "Adıyaman";
        citys[1][2] = "Mardin";
        citys[2][0] = "İzmir";
        citys[2][1] = "Çanakkale";
        citys[2][2] = "Burdur";

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                System.out.println(citys[i][j]);

            }

            System.out.println("---------------");

        }

    }

}
