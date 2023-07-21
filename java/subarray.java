import java.util.*;
class subarray{

public static void main(String[] args) {


Scanner s = new Scanner(System.in);

String st = s.next();

int count=0;

char ch[] = st.toCharArray();


 

for(int i=0; i<ch.length; i++)

{

int start =i;

int flag = 0;

for(int j=0;j<ch.length;j++)

{

if(ch[(start+j)%ch.length]=='(')

{

flag++;

}

else

{

flag--;

if(flag<0)

break;

}

}

if(flag==0)

{

count++;

}

}

System.out.println(count);
}}