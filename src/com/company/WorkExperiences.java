package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class WorkExperiences
{
    private String experience;
    private String duty;

    public WorkExperiences()
    {
    }

    public WorkExperiences(String experience, String duty)
    {
        this.experience = experience;
        this.duty = duty;
    }

    public String getExperience()
    {
        return experience;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
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
