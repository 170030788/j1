class Box
{
double length;
double breadth;
double height;
Box(double l,double b,double h)
{
length = l;
breadth = b;
height = h;
}
double volume()
{
return length * breadth * height;
}
}
class Boxdemo
{
public static void main(String args[])
{
Box myBox = new Box(10,20,30);
double vol;
vol = myBox.volume();
System.out.println("Volume is " + vol);
}
}  