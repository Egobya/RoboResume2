package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> RoboResume = new ArrayList<String>();

        int size = 20;
        int counter = 0;
        boolean quit = false;
        String name[] = new String[size];
        String email_address[] = new String[size];
        String educational_achievements[] = new String[size];
        String work_experiences[] = new String[size];
        String Duties[] = new String[20];
        String skills_with_rating[] = new String[size];
        String recordAgain = "";
        String skill = "";

        String Experience = "";
        String rating = "";
        SkillsWithRating skillsWithRating = new SkillsWithRating(skill, rating);

        while (quit == false) {
            System.out.println("enter a name:");
            name[counter] = keyboard.nextLine();
            System.out.println("enter email_address:");
            email_address[counter] = keyboard.nextLine();
            System.out.println("educational_achievement:");
            educational_achievements[counter] = keyboard.nextLine();
            String educational_achievement = "";
            //do
            WorkExperiences WorkExperieces = new WorkExperiences();
            WorkExperiences e;

            // do{

            e = new WorkExperiences();

            System.out.println("Enter a experince duty");
            e.setDuty(keyboard.nextLine());
            //e.setDuty(eDuty);
            //WorkExperiences.addWorkExperiences(e);

            while (educational_achievement.equalsIgnoreCase("n")) {
                System.out.println("Enter another educational achievement(Y/N)");
                educational_achievement = keyboard.nextLine();
                System.out.println("enter educational_achievement:");

                educational_achievements[counter] = keyboard.nextLine();

            }
                System.out.println("enter experiences");
                work_experiences[counter] = keyboard.nextLine();
                System.out.println("enter skills_with_rating:");
                skills_with_rating[counter] = keyboard.nextLine();
                // recordAgain = keyboard.next();

                //when user is done entering record the print them
                //for (int i = 0; i < 20; i++) {

                System.out.println("======================================================");

                System.out.println("a name:" + name[counter]);
                System.out.println("");

                System.out.println("email_address:" + email_address[counter]);
                System.out.println("");

                System.out.println("education:" + educational_achievements[counter]);
                System.out.println("");

                System.out.println("experiences:" + work_experiences[counter]);
                System.out.println("");
                System.out.println("duties" + e.getDuty());
                System.out.println("skills_with_rating:" + skills_with_rating[counter]);
                System.out.println("");

                System.out.println("Do you want to enter another record?(Y/N)");
                keyboard = new Scanner(System.in);
                recordAgain = keyboard.nextLine();

                if (recordAgain.equalsIgnoreCase("N")) {
                    quit = true;
                } else {
                    counter++;

             /*      //add a new Duty
                    Duties.add(new duty"");
                    Duty duty1 = new duty();

                    //Create a duty form

                    //you can see how many duties in your experience List

                    System.out.println("How many Duties in your experience");
                    System.out.println;

                    for (String e : experiences.getDuties()) {
                        outString += "Duty";
                        outString += ++counter;
                        outString += ", ";
                        outString += e;
                        outString += "\n";
*/
                }

            }
        }

    }



