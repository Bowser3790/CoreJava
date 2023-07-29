package LastLambdaDay33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class forCourseObject1 {
    public static void main(String[] args) {
        Course TurkishDayTime = new Course("Turkish Day Time", 124, "Spring", 97.2);
        Course TurkishNightTime = new Course("Turkish Night Time", 130, "Spring", 87.4);
        Course EnglishDayTime = new Course("English Day Time", 100, "Spring", 90.2);
        Course EnglishNightTime = new Course("English Night Time", 115, "Spring", 95.9);


        List<Course> TechProCourses = new ArrayList<>();
        TechProCourses.add(TurkishDayTime);
        TechProCourses.add(TurkishNightTime);
        TechProCourses.add(EnglishDayTime);
        TechProCourses.add(EnglishNightTime);
        System.out.println(TechProCourses);

        System.out.println(CheckIfAllAvgScoresAboveNumber(TechProCourses, 91));
        System.out.println(CheckContainsAtLeastOneCourseHasTurkish(TechProCourses, "Turkish"));
        PrintScoreWhoIsHighest(TechProCourses);
        System.out.println(skipFirstTwoElementsSortAvgScoreAscending(TechProCourses));
        //[course{courseName='English Night Time', numOfStudents=115, season='Spring', averageScore=95.9}, course{courseName='Turkish Day Time', numOfStudents=124, season='Spring', averageScore=97.2}]
        // as you can see we created a List<> return type because there are two data elements returned.
        printNumOfStudentsDescendingOnlyThirdElement(TechProCourses);

    }
    // create method to check if all average scores are greater than 91.

    public static boolean CheckIfAllAvgScoresAboveNumber(List<Course> TechProCourses, double avg){
        // will compare the given values to the average this is why there are 2 parameters in the List<Course> 1)TechProCourses, 2) avg these 2 will compare to each other.
        return TechProCourses.stream().allMatch(t-> t.getAverageScore()>avg);

    }
    public static boolean CheckContainsAtLeastOneCourseHasTurkish(List<Course> TechProCourses, String word){
        return TechProCourses.stream().
                anyMatch(t->t.getCourseName().contains(word));

    }
    public static void PrintScoreWhoIsHighest(List<Course> TechProCourses){
       Course TechProCourse = TechProCourses.
               stream().
               sorted(Comparator.comparing(Course::getAverageScore).reversed()).
               findFirst().
               get();
       System.out.println(TechProCourse);
    }
    // Create a method to Sort the List elements according to the average score in ascending order and skip the first two elements.
    public static List<Course> skipFirstTwoElementsSortAvgScoreAscending(List<Course> TechProCourses){
        // you need return type to be List<Course> when:
        // when you skip the first two courses you will have multiple courses.
        // if your method will return multiple data then you will need List<> return type.
        // every time multiple data needs List<> return type...
        return TechProCourses.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());

        // collect(toList) -> collects multiple data to list.
        // if you are going to return multiple data you need to put it in a collection to hold the data.
        // if you know the data is definitely unique then you can use the collect.(collectors.toSet()).
        // if you cannot decide which collection to save it to then use collect.(collectors.toCollection()).

    }
    // create a method to Sort List Elements by number of students in descending order and print just the 3rd one.
    public static void printNumOfStudentsDescendingOnlyThirdElement(List<Course> TechProCourses){
        List<Course> course = TechProCourses.
                stream().
                sorted(Comparator.comparing(Course::getNumOfStudents)).
                skip(2).limit(1).collect(Collectors.toList());
        System.out.println(course);

    }
}
