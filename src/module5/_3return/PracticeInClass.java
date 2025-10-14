package module5._3return;

public class PracticeInClass {
    public static int maximum(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max)
            max = array[i];
        }
        return max;
    }
    
    public static void main(String [] args) {
        int [] g = new int [5];
        for (int i = 0; i < g.length; i++) {
            g[i] = (int)((Math.random() * 10) + 1);
            System.out.println(g[i]);
        }
        int max = maximum(g);
        System.out.println("The maximum value is: " + max);
        
    }
}
