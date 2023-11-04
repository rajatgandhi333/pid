package com.pid.rsg.model;

import lombok.Data;

import java.util.Date;

@Data
public class Document {

    private String id;

    private String documentName;

    private Date createdOn;
}
