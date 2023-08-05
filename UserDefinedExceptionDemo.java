class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    public void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        Voter voter = new Voter();

        try {
            voter.vote(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
