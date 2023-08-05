import java.util.*;  
public class TestJavaCollection7{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Mahi");  
set.add("Karthik");  
set.add("Harsha");  
set.add("Sujith");
set.add("Rakesh"); 
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}