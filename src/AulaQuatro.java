public class AulaQuatro {
    public static void main(String[] args) {
        System.out.println(ex1(4,8));
    }

    private static int ex1(int i, int j) {
        int produto = 0;
        for (int x = 0; x <= i;x++){
            produto = i + j;
        }
        return produto;
    }
}

