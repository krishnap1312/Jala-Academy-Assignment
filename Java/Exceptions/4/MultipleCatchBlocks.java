public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            int result = 10 / 0;
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
}
