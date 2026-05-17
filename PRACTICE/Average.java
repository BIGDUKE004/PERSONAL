public class Average{
        public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

int total = 0;
int gradecounter = 1;
int average = 0;
        while(gradecounter <= 10){

System.out.print("ENTER A GRADE: ");
    int num = input.nextInt();

total += num;

gradecounter++;

average = total / 10;
//gradecounter++;
System.out.println("your average is: " + average);

}







}
}
