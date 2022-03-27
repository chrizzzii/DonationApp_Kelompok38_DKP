import java.util.Arrays;

public class tempatdonasi {
    private String[][] data;

    public tempatdonasi() {
        String[][] data = new String[][]{
                {"Panti Asuhan A - Jakarta" , "Panti Asuhan B - Bandung"},
        };
        for (String[] s : data) {
            System.out.println(Arrays.toString(s));
        }
    }
}
