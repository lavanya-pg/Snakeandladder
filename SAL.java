import java.util.Scanner;

public class SAL
{
public static void main(String[] args)
{
int PlayerPosition=1;

System.out.println("Welcome to Snake And Ladder");
int die = (int) (Math.floor( Math.random() * 10) % 6+1);
System.out.println("Die rolled is :" +die);
int option =(int) (Math.floor(Math.random() * 10)%3);
switch(option)
{
case 0:
System.out.println("No play");
PlayerPosition += 0;
break;
case 1:
System.out.println("Ladder");
PlayerPosition += die;
break;
default:
System.out.println("Snake");
PlayerPosition -= die;
if(PlayerPosition<0)
PlayerPosition=0;
}
System.out.println("Player position is : "+PlayerPosition);
}
}
