class StrOps 
{ 
public static void main(String args []) 
{ 
String str1 = "When it comes to Web programming, Java is #1."; 
String str2 = new String (str1); 
String str3 = "Java strings are powerful."; 
int result, idx; char ch; 
String str5=str1.concat(str3);
System.out.println(str5);
System.out.println ("Length of str1: " + str1.length ());
for(int i=0; i < str1.length(); i++) 
System.out.print (str1.charAt (i)+"\t"); 
System.out.println (); 
String str6="india";
String str7="INDIA";
if (str6.equals (str7) ) 
System.out.println ("str6 equals str7"); 
else 
System.out.println ("str6 does not equal str7"); 
if (str6.equalsIgnoreCase (str7) ) 
System.out.println ("str6 equals str7"); 
else 
System.out.println ("str6 does not equal str7"); 
result = str7.compareTo (str7); 
if(result == 0) 
System.out.println ("str6 and str7 are equal"); 
else if(result < 0) 
System.out.println ("str6 is less than str7"); 
else 
System.out.println ("str6 is greater than str7"); 
str2 = "One Two Three One"; 
idx = str2.indexOf ("One"); 
System.out.println ("Index of first occurrence of One: " + idx); 
idx = str2.lastIndexOf("One"); 
System.out.println ("Index of last occurrence of One: " + idx); 
String str4 = "    Java     "; 
System.out.println(str4);    
System.out.println(str4.trim());
String str8=str7.toLowerCase();
System.out.println(str8);
String str9=str6.toUpperCase();
System.out.println(str9);
}
}