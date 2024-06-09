class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

class Voter
{
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public String getVoterId()
    {
        return voterId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

public class ExceptionAge
{
    public static void main(String[] args)
    {
        try
        {
            Voter voter = new Voter("V123", "Alice", 16); // Example with age less than 18
            System.out.println("Voter created: " + voter.getName() + " (Age: " + voter.getAge() + ")");
        } catch (InvalidAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
//output
//Invalid age for voter.