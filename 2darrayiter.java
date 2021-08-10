import java.util.*;
class for2d
{
public static void main(String geetu[])
{
int arr[][]=new int[3][3];
Scanner obj=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=obj.nextInt();
}
}
for(int i[]:arr)
{
for(int j:i)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}


