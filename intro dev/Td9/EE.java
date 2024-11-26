package Td9;

public class EE {
    private int[] ensTab;
    private int cardinal;

    public EE(int max){
        this.cardinal = 0;
        this.ensTab = new int[max];
    }

    public EE(int[] tableau, int max){
        this.cardinal = tableau.length;
        this.ensTab = new int[max];
        for (int i = 0; i < this.ensTab.length; i++) {
            this.ensTab[i] = tableau[i];
        }
    }

    public EE(EE tab){
        this.cardinal = tab.cardinal;
        int[] x = new int[tab.cardinal];
        for (int i = 0; i < x.length; i++) {
            x[i] = tab.ensTab[i];
        }
        ensTab = x;
    }

    public String toString(){
        String x = "";
        for (int i = 0; i < this.cardinal; i++) {
            x += ensTab[i];
        }
        return x;
    }

    public static void main(String args[]){
        int[] x = {1,4,6,2,7,3,0};
        EE e1 = new EE(4);
        System.out.println(e1.toString());
        System.out.println(e1.ensTab.length);
    }





}
