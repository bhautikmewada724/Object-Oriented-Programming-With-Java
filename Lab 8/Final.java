// //Final As A Variable 
// public class Final {
//     public static void main(String[] args) {
//         Final f = new Final();
//         f.run();
//     }

// final int speedlimit=90;
// void run(){
//     speedlimit=200;//cannot assign a value to final variable speedlimit
//     System.out.println(speedlimit);
// }
// }

//----------------

// //Final As A Method
// public class Final{
//     public static void main(String[] args) {
//         Pulsar p = new Pulsar();  //non-static variable this cannot be referenced from a static context
//         p.run();
//     }
   
// }
// class Bike{
//             final void run(){
//                 System.out.println("Running Bike");
//             }
//         }
//         class Pulsar extends Bike{
//             void run()    //run() in Pulsar cannot override run() in Bike
//             {
//                 System.out.println("Running Pulsar");
//             }
//         }

//--------------------
//Final As A Class
public class Final{
        public static void main(String[] args) {
            Pulsar p = new Pulsar();
            p.run();
        }
}
final class Bike{
    void run(){
        System.out.println("Running Bike");
    }
}
class Pulsar extends Bike //cannot inherit from final Bike
{
    void run(){
        System.out.println("Running Pulsar");
    }
}


