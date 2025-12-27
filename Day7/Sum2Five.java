public class Sum2Five {
    public static int sum(int i) {
        if (i > 5) return 0;      
        return i + sum(i + 1);    
    }

    public static void main(String[] args) {
        int i = 1; 
        System.out.println(sum(i));
    }
}