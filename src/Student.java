public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {                          //toString method is a special method in Java that allows us to
        return "Student{" +                             //print out the state of our object. When this code is generated,
                "id='" + id + '\'' +                    //Intellij adds the @Override statement. Any statement that starts
                ", name='" + name + '\'' +              //with the @ symbol is called an annotation.
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +    //Annotations are a type of metadata. Metadata is a way of formally
                '}';                                    //describing additional information about our code.

    }                                                   //Annotations are more structured, and have more meaning, than comments.
                                                        //This is because they can be used by the compiler, or other types
                                                        //of pre-processing functions, to get information about the code.
                                                        //Metadata doesn't affect how the code runs, so this code will still run
                                                        //with our without the annotation.


    //Adding getters and setters to our POJO (Student) gives us all we need to manipulate data, setting, updating, and
    //retrieving data.

    //Intellij's generation tool generates code like getters and setters for us, called boilerplate code.
    //Boilerplate code is repetitive and follows a pattern, which is why code generation tools can create it for us.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }


}


//The @Override annotation is one of the most common annotations in Java that you'll use.
//It tells the compiler that this is a special type of method in Java, an overridden method.

//An overridden is not the same thing as an overloaded method.
//An overridden method is a special method in Java, that other classes can implement, if they use a specified method signature.
