public class Maximum{
    public static void main(String[] args){

        int [] numbers = {12,32,95,55,23};
        int biggest = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(biggest < numbers[index]){
                biggest = numbers[index];
                 
            }
         
        }

         System.out.println(biggest);

}
}
