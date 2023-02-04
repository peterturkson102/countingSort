    public static String pangrams(String s) {
    // Write your code here
String alpha = "abcdefghijklmnopqrstuvwxyz";
String nen = "";
int a=0;
int x=0;
while(a<alpha.length()&&x<s.length()){
    if(Character.toLowerCase(alpha.charAt(a))==Character.toLowerCase(s.charAt(x))){
        nen += alpha.charAt(a);
        a++;
        x=0;
    }else{
        x++;
    }
    
    
}
 return nen.equals(alpha)?"pangram":"not pangram"; }

}
