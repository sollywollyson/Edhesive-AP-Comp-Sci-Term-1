import java.util.Scanner;

class Lesson_32_Activity_Four {
      
        public static void realTime(int original)
        {
        double flip = (double) original;
        int hours = (int)(flip/3600);
        int minutes = (int)((flip/3600 - hours) * 60);
        int seconds = (int)(((((flip/3600) - hours) * 60) - minutes) * 60);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        }
        
        public static void main(String[] args)
        {
        realTime(6342);
        }
}