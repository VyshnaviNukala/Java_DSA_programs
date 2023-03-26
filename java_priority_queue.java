import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCGPA(){
        return cgpa;
    }
    @Override
    public int compareTo(Student o){
        int cgpaComparison = - Double.compare(cgpa, o.cgpa);
        int nameComparison = name.compareTo(o.name);
        if(cgpa != 0)
            return cgpaComparison;
        if(nameComparison != 0 )
            return nameComparison;
        return Integer.compare(id, o.id);
    }
}

class Priorities {
    
    private Queue<Student> priorityQueue;
    
    public Priorities (){
        priorityQueue = new PriorityQueue<>();
    }
    
    List<Student> getStudents(List<String> events){
        for(String event: events){
            String[] parts = event.split(" ");
            if(parts.length == 1){
                // served event
                priorityQueue.poll();
            } else if(parts.length == 4){
                // enter event
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return priorityQueue.stream().sorted().collect(Collectors.toList());
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}