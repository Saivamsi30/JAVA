public class RestroBill {
    public static void main(String[] args)
    {
        RestroBill obj = new RestroBill();
        obj.sum(150,120,80,60,40,200);
    }
        public void sum(int Dalmakhni,int Rice, int Salad,int Roti,int Colddrink,int Paneer)
        {
            int total = Dalmakhni+Rice+Salad+Roti+Colddrink+Paneer;
            System.out.println("Mr.Vamsi, Your bill is: " + total);
        }
    }

