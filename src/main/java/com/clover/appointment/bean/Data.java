package com.clover.appointment.bean;

public class Data
{
    private String languagesspoken;

    public String getLanguagesspoken ()
    {
        return languagesspoken;
    }

    public void setLanguagesspoken (String languagesspoken)
    {
        this.languagesspoken = languagesspoken;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [languagesspoken = "+languagesspoken+"]";
    }
}
