public class SAL
{
public static void main(String[] args)
{
System.out.println("welcome to snake and ladder program");
int playerposition = 1;
System.out.println("playerposition is : " +playerposition);
int dice = (int) (Math.floor(Math.random() * 10) % 6+1);
System.out.println("dice rolled is : " +dice);
}
}
