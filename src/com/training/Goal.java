package com.training;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class Goal
{
	 Scanner sc=new Scanner(System.in);
	 String query=null;
	 String first=null;
	 String last=null;
	 ArrayList<String> condition=new ArrayList<String>();
 ArrayList<String> token=new ArrayList<String>();
 public void token1() {
	 String words=null;
	 System.out.println("Enter the query:");
	 query= sc.nextLine();
	 //goal1 task1
	 StringTokenizer st = new StringTokenizer(query," ");  
	 while (st.hasMoreTokens()) {
		 words=st.nextToken();
		 token.add(words);
         System.out.println(words);			     
	     } 
 }
public void fname(){
		 System.out.print("File Name: ");
		 Pattern p = Pattern.compile("[\\w]+\\.(csv)");
		 Matcher m = p.matcher(query);  
		 while(m.find()) 
		 System.out.println(m.group());
}
public void basefilter() {
		 int index1=query.indexOf("where");
		 System.out.print("Query before where: ");
		 first=query.substring(0, index1);
		 System.out.println(first);
		 //task4
		 System.out.print("Query after where: ");
		 int index2=index1+("where".length());
		 last=query.substring(index2, query.length());
		 System.out.println(last);
}
public String conditions() {
		 System.out.println("Conditions: ");
		 Pattern p2= Pattern.compile("([\\w]+[ ]?)((<=)|(>=)|(<>)|=|<|>)([ ]?[']?[\\w]+[']?)");
		 Matcher m2= p2.matcher(last);
		 while(m2.find()) {
			 System.out.println(m2.group());
		 }
		 return "in conditions";
}
public String operator() {
		 for(String operators:token) { 
			 if((operators.equalsIgnoreCase("and"))||(operators.equalsIgnoreCase("or"))||(operators.equalsIgnoreCase("not")))
			 System.out.println("Logical operators in statement: " +operators);  
		 }  
		 return "in operator";
}
public String selectInfo() {
		System.out.println("selected fields/information from the given query");
		int index3=token.indexOf("from");
		
		condition.addAll(token.subList(1, index3));
		Iterator<String> iterator= condition.iterator();
		while(iterator.hasNext()) {
			String itrstr= iterator.next();
			System.out.println(itrstr.replace(","," "));
		}		
		return "selectinfo checked";
}
public void order() {
		if(token.contains("order")) {			
		    int index4=query.indexOf("order by")+("order by".length());
		    System.out.println("After order by:"+query.substring(index4,query.length()));
		}
		else
			System.out.println("doesn't contain any order by clause");
}	
public void group() {
		if(token.contains("group")) {
		   int index5=query.indexOf("group by")+("group by".length());
		   System.out.println("After group by:"+query.substring(index5,query.length()));
		}
		else
			System.out.println("doesn't contain any group by clause");
}
public void aggregate() {
		System.out.println("aggregate functions");
		Pattern p = Pattern.compile("[a-zA-Z]+[(][\\w]+[)]");
		Matcher m = p.matcher(query);  
		while(m.find())			
	        System.out.println(m.group());		
}
public void goal5() {
	    String csvFile = "ipl.csv";
        BufferedReader br = null;
        String csvSplit = ",";
        String line = "";
        String heading=null;
       // String[] words=null;
		  try {
			   br = new BufferedReader(new FileReader(csvFile));
	            heading=br.readLine();
	            System.out.println(heading);
	        //	words = heading.split("csvSplit");
	        	 while ((line = br.readLine()) != null) {
	                 String[] data= line.split(csvSplit);	             
	             }
	        	
		        } 
	        catch(Exception e) {
	        	System.out.println(e);
	        }
	        finally
	        {
		          if (br != null)
		          {
		                try{ 
		                	br.close();} 
		                catch (IOException e){
		                	e.printStackTrace();}
		           }
		     }
	        }
 }
                     