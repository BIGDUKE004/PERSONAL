public class Maximum{
    public static void main(String[] args){

int [] list = {3, 9, 1, 7, 5};
int max = list [0];

for(int index = 0; index < list.length; index++){

if(max < list[index]){
max = list[index];
}

}

System.out.println(max);
}
}
