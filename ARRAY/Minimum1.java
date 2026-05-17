public class Minimum1{
    public static void main(String[] args){

        int [] numbers = {12,32,43,5,23};
        int smallest = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(smallest > numbers[index]){
                smallest = numbers[index];
                 
            }
         
        }

         System.out.println(smallest);

}
}
