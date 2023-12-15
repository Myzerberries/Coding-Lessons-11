public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){                             //We replaced, "Student s = new Student with LPAStudent...
            LPAStudent s = new LPAStudent("S92300" + i,      //We got the same output, except this time with brackets.
                    switch(i){                                  //This effectively replaces 56 lines of code with 1, except
                case 1 -> "Mary";                               //LPAStudent doesn't have or support setter methods. But
                case 2 -> "Carol";                              //the other functionality, calling the constructor with 4
                case 3 -> "Tim";                                //parameters, and printing the data out, is implicitly part
                case 4 -> "Harry";                              //of the record.
                case 5 -> "Lisa";
                default -> "Anonymous";                         //Here we are using a switch expression as a parameter
                    },                                          //to a constructor.
                    "05/11/1985",
                    "Java Masterclass");

            System.out.println(s);                              //toString method not called on the object s here, because
                                                                //Java has a built-in feature which allows every object,
        }                                                       //when passed to System.out.println, to have the toString
                                                                //method implicitly executed if you've created such a
                                                                //method on your class.

        //Below we are creating an object with our POJO and an object with our record:

        Student pojoStudent = new Student("s923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //record.Student.setClassList(recordStudent.classList() + ", Java OCP Exam 829     <- Not valid, as the record does
        //not use setters, since the record is designed to be immutable.

        //Why is the record built to be immutable?
        //There are more use cases for immutable data transfer objects, and keeping them well encapsulated.
        //You want to protect data from unexpected mutations.
        //If you want to modify data on your class, you won't be using the record.
        //You can use code generation options for POJO.
        //But if you're reading a lot of records, from a database or source file, and simply passing this data around,
        //then the record is a big improvement.

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList()); //Java's implicit code doesn't
                                                                                              //include the prefix "get", but
                                                                                              //simply uses the same name as
                                                                                              //the component, or field.
    }

}

// A plain old Java object, whose acronym in POJO, is a class that generally only has instance fields.
//It's used to house data, and pass data, between functional classes.
//It usually has few, if any methods other than getters and setters.
//Many database frameworks use POJO's to read data from, or to write data to, databases files or streams.
//A POJO lets you extend and combine your definition of data types.
//A POJO also might be called a bean, or a JavaBean.
//A JavaBean is just a POJO, with some extra rules applied to it.
//A POJO is sometimes called an Entity, because it mirrors database entities.
//Another acronym is DTA, for Data Transfer Object.
//It's a description of an object, that can be modified as just data.

//There are many generation tools, that will turn a data model into generated POJOs or JavaBeans.
//We've seen examples of similar code generation in Intellij, which allowed us to generate getters, setters, and
//constructors in a uniform way based on our classes fields.