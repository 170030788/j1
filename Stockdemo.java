class Stockdemo
{
      String  name,symbol;
      double Prev_closing_stock,curr_closing_price;

      

      Stockdemo(String name, String symbol, double Prev_closing_stock,double  curr_closing_price)
      {
              this.name=name;
              this.symbol=symbol;
              this.Prev_closing_stock=Prev_closing_stock;
              this.curr_closing_price= curr_closing_price;
      }
       

      double getChangePercentage()
      {
               return (Prev_closing_stock/ curr_closing_price)*100;
      }

      public static void main(String args[])
      {
               Stockdemo s=new Stockdemo("loki","$",10.0,12.0);
               System.out.println("The Percentage is: "+s.getChangePercentage());
      }

}