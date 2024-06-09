import java.util.HashMap;
import java.util.Map;

public class StudentGrade
{
    private Map<String, Integer> grades;

    // Constructor to initialize the HashMap
    public StudentGrade()
    {
        this.grades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade)
    {
        grades.put(name, grade);
        System.out.println("Added student " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name)
    {
        if (grades.containsKey(name))
        {
            grades.remove(name);
            System.out.println("Removed student " + name);
        } else
        {
            System.out.println("Student " + name + " not found");
        }
    }

    // Method to display a student's grade by name
    public Integer getGrade(String name)
    {
        if (grades.containsKey(name))
        {
            System.out.println("Student " + name + " has grade " + grades.get(name));
            return grades.get(name);
        } else {
            System.out.println("Student " + name + " not found");
            return null;
        }
    }

    // Main method to demonstrate HashMap operations
    public static void main(String[] args)
    {
        StudentGrade sg = new StudentGrade();
        sg.addStudent("Alice", 85);
        sg.addStudent("Bob", 92);
        sg.getGrade("Alice");  // Should print 85
        sg.getGrade("Bob");    // Should print 92
        sg.getGrade("Charlie"); // Should print "not found"
        sg.removeStudent("Alice");
        sg.getGrade("Alice");  // Should print "not found"
    }
}

