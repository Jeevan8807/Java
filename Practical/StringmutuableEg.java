public class StringmutuableEg {

    public static void main(String args[]) {
        StringBuffer s1= new StringBuffer(" Jeevan Darekar ");
        System.out.println(s1.append("vashi "));
        System.out.println(s1);

        System.out.println(s1.insert(0,"NGO - "));
        StringBuilder s2 = new StringBuilder("Java Professional");
        System.out.println(s2.replace(6,9,"hari"));
        System.out.println(s2.delete(5,9));
        System.out.println(s2.reverse());
        
    }
    
}
