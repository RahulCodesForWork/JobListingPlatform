package com.project.joblisting.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "JobPost")
public class Post {

    private String profile;
    private String desc;
    private int exp;
    private String techs[];

}
