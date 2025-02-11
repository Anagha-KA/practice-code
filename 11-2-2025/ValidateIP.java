public class ValidateIP {
    public static void main(String[] args) {
        System.out.println(isValidIP("222.111.111.111")); // true
        System.out.println(isValidIP("5555..555")); // false
        System.out.println(isValidIP("0.0.0.255")); // true
        System.out.println(isValidIP("0.0.0.0255")); // false
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\."); 
        if (parts.length != 4) return false;

        for (String part : parts) {
            if (!part.matches("\\d+") || part.length() > 1 && part.startsWith("0")) return false;
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) return false;
        }
        return true;
    }
}