public class practice1 {
    public static void main(String[] args) {
        String str="diode";
        String newstr="coding";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if (newstr.indexOf(c)==0) {
                newstr+="c";
                
            }
        }
    }
    
}
