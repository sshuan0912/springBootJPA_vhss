package com.example.demo.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EnrolledCourse {

    private String first_name;
    private String last_name;
    private String course_name;
}
