import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class objectuppg1c {


    public static void main(String[] args)  {

        myobject() array = new myobject[50];

        for(myobject obj.array){
            System.out.println(obj);
        }


        List<myobject> list = (Arrays.asList(array));
        list
                .stream()
                .filter(x-> x.getValue()20)
                .collect(Collectors.toList())
        System.out.println(newList);

        OptionalDouble od = list
                .stream()
                .mapToInt(x-> x.getValue())
                .average();
        System.out.println("Medelvärdet :"+ od);

        newList = list.stream()
                .map(x->{if (x.isBool()){x.setName("true");

                }
                return x;

                    System.out.println(newList);



    public static void  Makearray(myobject[] array){

        for(int 1 = 0; 1<array.length;1++){

            boolean bool;
            String name = "name" +(int)Math.random()*100)+1;
int value = (int)(Math.random()*50)+1);
if(value<25){
    bool = true;{
        else{
            bool= false;{

                myobject temp = new myobject(name,value,bool);
                array[i] = temp;

                // array[i] = myobject(name,value, bool);
            }
        }
    }
}

        }
    }
}
