//When creating this class, we selected "record" instead of class.
//Different from a class, there is a set of parentheses after the name of this record, LPAStudent.
//We can set parameters in teh parentheses similar to the constructor.
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {

}

//The purpose of the Record is to replace the boilerplate code of the POJO, but to be more restrictive.
//Java calls them "plain data carriers".

//The record is a special class that contains data, that's not meant to be altered.
//In other words, it seeks to achieve immutability for the data in its members.
//It contains only the most fundamental methods, such as constructors and accessors(or getters).
//Best of all, you the developer, don't have to write or generate any of this code.

//What does Java tell us about what is implicitly created when we declare a record as we did in this code?
//public record LPAStudent(String id, String name, String dateOfBirth, String classList) {}

//First, it's important to understand that the part that's in parentheses is called the record header.
//The record header consists of record components, a comma delimited list of components.

//For each component in the header, Java generates the following:
//A field with the same name and declared type as the record component.
//The field is declared private and final (Meaning the field can't be modified).
//The field is sometimes referred to as a component field.
//Java also generates a toString method that prints out each attribute in a formatted String.
//In addition to creating a private final field for each component, Java generates a public accessor method for each component.
//This method has the same name and type of the component, but it doesn't have any kind of special prefix, no get, or is, for example.
//The accessor method, for id in the above example, is simply id().
