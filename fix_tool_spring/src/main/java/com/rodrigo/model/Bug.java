package com.rodrigo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bug")
@Data
public class Bug {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bugId;

    private String responsible;

    private String title;

    private String urgency;

    private String type;

    private String description;
    
    private Date createdAt;
    

}
