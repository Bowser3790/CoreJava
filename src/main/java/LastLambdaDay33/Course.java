package LastLambdaDay33;

/*
To create a POJO (Plain Old Java Object) class do the following steps:
1) Create Private Variables
2) Create Constructor
3) Create Method without Parameters
4) Create Getters and Setters
4) Create toString() method
 */

public class Course {
    // classes are templates for objects
    private String courseName;

    private int numOfStudents;

    private String season;

    private double averageScore;

    // how do you create constructors for your variables? right click, generate and select all variables and ok.

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }
    public Course(){ // sometimes we need constructors without parameters so this is why we will also create a
        // constructor without parameters (manually create)

    }
    // Next step is to create getters.  How? Right click and select generate-> getters and setters, and select ok.


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
        // note if you do not have the string method, all that will be provided is the Hash Code and we will not be able to see the output.
    }
}
