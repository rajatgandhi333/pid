package com.pid.rsg.model;

import lombok.Data;

import java.util.List;

@Data
public class Drawings {

    private String id;

    //partitionkey
    private String documentId;

    private List<String> Symbol;

    private String uploadedBy;

}
