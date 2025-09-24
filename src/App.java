public class App {
    public static void main(String[] args) throws Exception {
        
        Reader dog = new Reader();
        // get the users name
        String name = dog.getString("Enter Name:");
        System.out.println(name);
        // Delaring the 4 numbers
        int num_1 = Methods.randInt(1,10);
        int num_2 = Methods.randInt(1,10);
        int num_3 = Methods.randInt(1,10);
        double num_4 = Methods.randInt(1,10);
        // round the double using the method round double
        int rounded_num_4 = (int)Methods.roundDouble(0, num_4);
        // start a score tracker
        int score = 0;
        // print the equations 
        int u_awnser1 = dog.getInt("What is "+num_1 + "+"+ num_2+"= ");
                int c_awnser_1 = num_1 + num_2;
        // checking the awnsers
        if (u_awnser1 == c_awnser_1){
            score +=1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            System.out.println("Correct awnser is: "+ c_awnser_1);
        }
        //2
        int u_awnser2 = dog.getInt("What is "+num_2 + "-"+ num_3+"= ");
        int c_awnser_2 = num_2 - num_3;
        if (u_awnser2 == c_awnser_2){
            score +=1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            System.out.println("Correct awnser is: "+ c_awnser_2);
        }
        //3
        int u_awnser3 = dog.getInt("What is "+ num_3 + "*"+ rounded_num_4+"= ");
        int c_awnser_3 = num_3 * rounded_num_4;
        if (u_awnser3 == c_awnser_3){
            score +=1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            System.out.println("Correct awnser is: "+ c_awnser_3);
        }
        // 4
        double u_awnser4 = Methods.roundDouble(0, dog.getDouble("What is "+ rounded_num_4 + "/"+ num_1+"= "));
        double c_awnser_4 =  (Methods.roundDouble(0, rounded_num_4 / num_1));
        if (u_awnser4 == c_awnser_4){
            score +=1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            System.out.println("Correct awnser is: "+ c_awnser_4);
        }
        // 5
        int u_awnser5 = dog.getInt("Find the remainder of: "+ num_2 + "/"+ rounded_num_4+ "= "); 
        int c_awnser_5 = (int) Methods.roundDouble(0, num_2 % rounded_num_4);
        if (u_awnser5 == c_awnser_5){
            score +=1;
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            System.out.println("Correct awnser is: "+ c_awnser_5);
        }
        System.out.println(score+"/5");
        // find the awnsers








        






    }
}

