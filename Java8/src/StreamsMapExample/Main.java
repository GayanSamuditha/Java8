package StreamsMapExample;

import comparator.Employee;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        //HashMap for adding student name and marks
        Map<String, Integer> studentList = new HashMap<>();

        studentList.put("Gayan", 87);
        studentList.put("Iresh", 72);
        studentList.put("Abishek", 12);
        studentList.put("Thevaki", 30);
        studentList.put("Chethana", 90);
        studentList.put("Randima", 68);
        System.out.println(studentList);

        //filtering using List - stream the studentList
        List<String> filteredStudentList = studentList.entrySet()
                .stream()
                .filter(ent -> ent.getValue() > 60)
                .map(m -> m.getKey())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("==========================");
        System.out.println(filteredStudentList);

    }
}