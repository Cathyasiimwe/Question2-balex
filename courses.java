package com.mycompany.balex;
    
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class courses {
    // Define a class to store course details
    static class Course {
        String courseName;
        int tuition;

        Course(String courseName, int tuition) {
            this.courseName = courseName;
            this.tuition = tuition;
        }

        @Override
        public String toString() {
            return "Course Name: " + courseName + ", Tuition: " + tuition;
        }
    }

    // Initialize a map to store course information
    private static final Map<String, Course> coursesMap = new HashMap<>();

    static {
        // Populate the map with course details
        coursesMap.put("BSE", new Course("Software Engineering", 900000));
        coursesMap.put("BIT", new Course("Information Technology", 750000));
        coursesMap.put("BCS", new Course("Computer Science", 800000));
        coursesMap.put("BCE", new Course("Computer Engineering", 950000));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Course ID: ");
            String courseId = scanner.nextLine().toUpperCase();
            
            Course course = coursesMap.get(courseId);
            
            if (course != null) {
                System.out.println(course);
            } else {
                System.out.println("Wrong CourseID details");
            }
        }
    }
}

