   public class Smallest{
    public static void main(String...args){
    int [] box = {10, 20, 30, 40, 50};
    int smallest = box[0];
    for(int a = 0; a < box.length; a++){
if(smallest > box[a]){
smallest = box[a];
}
}
System.out.println(smallest);
}

}
