package com.golden.swhb.model;

public class Student {
    private final String cms_id;
    private final String studentName;

    public Student(String cms_id, String studentName)
    {
          this.cms_id=cms_id;
          this.studentName=studentName;
    }

    public String getCMSID()
    {
        return this.cms_id;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
    
}
