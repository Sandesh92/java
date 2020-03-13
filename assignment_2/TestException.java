
public class TestException{
    public static void main(String[] args){
        try{
            int result = divideInt(10,5);
            System.out.format("10 divide by 5 is %d%n",result);
            divideInt(10,0);
            System.out.format("10 divided by 0 is %d%n",result);
        }
        catch(OwnException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int divideInt(int i ,int j) throws OwnException{
        if(j==0){
            throw new OwnException("Divisor cannot be zero!");
        }
        return i/j;
    }
}
