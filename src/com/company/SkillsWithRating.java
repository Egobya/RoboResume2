package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class SkillsWithRating
{
    private String skills;
    private String duty;
    private ArrayList<String> duties;

    public SkillsWithRating(String skills, String duty)
    {
        duties = new ArrayList<>();
    }

    public String getSkills()
    {
        return skills;
    }

    public void setSkills(String skills)
    {
        this.skills = skills;
    }

    public String getDuty()
    {
        return duty;
    }

    public void setDuty(String duty)
    {
        this.duty = duty;
    }
}
