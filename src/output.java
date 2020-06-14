import java.util.Scanner;
public class output {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int v2 = 1;
        int v3 = 1;
        int v1 = v2 + v3;
        System.out.println(v1);
        String v4;
        String v5 = "ola";
        v4 = v5;
        int v8 = 2;
        int v9 = 3;
        int v7 = (int)Math.pow(v8,v9);
        int v6 = v7;
        boolean v11 = false;
        boolean v10 = v11;
        boolean v13 = false;
        boolean v12 = v13;
        int v16 = v6;
        int v17 = 1;
        int v15 = v16 * v17;
        double v14 = v15;
        int v21 = v6;
        double v22 = v14;
        boolean v18 = v21 != v22;
        if(v18) {
            String v23 = "Diferentes";
            System.out.println(v23);
            String v25 = v4;

            String v26 = "ola";
            boolean v24 = !v25.equals(v26);
            if(v24) {
                String v27 = "strings iguais";
                System.out.println(v27);
                boolean v28 = true;
                v12 = v28;
            } 
        } 
        else {
            String v30 = v4;
            double v31 = v14;
            boolean v29 = v30 > v31;
            if(v29) {
                String v32 = "maiores";
                System.out.println(v32);
            } 
            else {
                String v33 = "menores";
                System.out.println(v33);
            }

        }

         int v35 = 0;
        int v34 = v35; 
        while (true) {
        	int v37 = v34;
        	int v38 = 10;
        	boolean v36 = v37 <= v38;
        	if (!v36){
        	   break;
           }   
           int v40 = v34;
           int v41 = 1;
           int v39 = v40 + v41;
           v34 = v39;

           while (true) {
           	int v43 = v6;
           	int v44 = 50;
           	boolean v42 = v43 >= v44;
           	if (!v42){
           	   break;
              }   
              String v46 = "Valor de  d2: ";
              int v47 = v6;
              String v45 = v46 + v47;
              System.out.println(v45);
           } 
           v34 ++;
           v34 = v34;
        } 
        System.out.print("Enter something");
        String v49 = sc.nextLine();
        String v48 = v49;
    }
}