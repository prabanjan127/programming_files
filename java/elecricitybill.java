import java.util.*;
class details{
void display(){
Scanner det=new Scanner(System.in);
System.out.println("custome no:");
int customer_no=det.nextInt();
System.out.println("custome name:");
String customer_name=det.next();
System.out.println("previous month reading:");
int prev_month=det.nextInt();
System.out.println("current month reading:");
int current_month=det.nextInt();
System.out.println("enter ur type of EB connection 'domestic' or 'commercial' :");
String EB_connection=det.next();
int units=current_month-prev_month;

if(EB_connection.equals("domestic")){
  if(units<=100){
System.out.println(units*1);
}
else if(units<=200 && units>=101){
System.out.println(units*2.50);
}
else if(units<=500 && units>=201){
System.out.println(units*4);
}
else{
System.out.println(units*6);
}}
else{
System.out.println();
}
}}
class current{
public static void main(String args[]){
details de=new details();
de.display();
}}