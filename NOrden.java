public class NOrden {
    public static void main(String[] args) {

        System.out.println("Introduce tres números enteros: ");

        int x = Integer.parseInt(System.console().readLine());
        int y = Integer.parseInt(System.console().readLine());
        int z = Integer.parseInt(System.console().readLine());

        if ((x > y) && (x > z)) {
            if (y > z) {
                System.out.println("El orden es: " + x + " > " + y + " > " + z);
            } else {
                System.out.println("El orden es: " + x + " > " + z + " > " + y);
            }
        } else if ((y > x) && (y > z)) {
            if (x > z) {
                System.out.println("El orden es: " + y + " > " + x + " > " + z);
            } else {
                System.out.println("El orden es: " + y + " > " + z + " > " + x);
            }
        } else if ((z > x) && (z > y)) {
            if (x > y) {
                System.out.println("El orden es: " + z + " > " + x + " > " + y);
            } else {
                System.out.println("El orden es: " + z + " > " + y + " > " + x);
            }
        }
    }
}
