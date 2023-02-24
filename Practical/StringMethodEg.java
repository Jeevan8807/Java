public class StringMethodEg {

    public static void main(String[]args) {

        String a ="Jeevan Darekar";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.startsWith("Jee"));
        System.out.println(a.endsWith("kar"));
        System.out.println(a.charAt(5));
        System.out.println(a.length());
        System.out.println(a.replace("Jeevan","G1"));
        System.out.println(a);

        int num = 8;
        String b = String.valueOf(num);
        System.out.println(b+8);
        
    }
    
}
