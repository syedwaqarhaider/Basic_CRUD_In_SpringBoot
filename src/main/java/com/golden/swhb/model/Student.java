package com.golden.swhb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private final String cms_id;
    private final String studentName;

    public Student(@JsonProperty("id") String cms_id, @JsonProperty("name") String studentName)
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
