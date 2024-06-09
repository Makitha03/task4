class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }

        if (!name.matches("^[a-zA-Z\\s]*$")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and other methods can be added here
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class StudAgeName {
        public static void main(String[] args) {
            try {
                // Creating a student with valid details
                Student student1 = new Student(101, "Alice", 18, "Mathematics");
                System.out.println("Student details: Roll No - " + student1.getRollNo() + ", Name - " + student1.getName() + ", Age - " + student1.getAge() + ", Course - " + student1.getCourse());

                // Creating a student with invalid age
                Student student2 = new Student(102, "Bob", 22, "Physics");

                // Creating a student with invalid name
                Student student3 = new Student(103, "Carol@123", 20, "Chemistry");
            } catch (AgeNotWithinRangeException | NameNotValidException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    //output
//Student details: Roll No - 101, Name - Alice, Age - 18, Course - Mathematics
//Error: Age is not within the range of 15 to 21