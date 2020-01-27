class Greatest
{
public static void main(String args[])
{
if(args.length==9)
{
int[][] arr=new int[3][3];

int max=-1;
int k = 0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=Integer.parseInt(args[k]);
k++;
if(max<arr[i][j])
max=arr[i][j];
}
}
System.out.println("the given array is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
System.out.println("the biggest number in array is :"+max);
}
else 
{
System.out.println("please enter 9 integer numbers");
}
}
}
