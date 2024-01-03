package com.lms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@Entity
public class Book {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@NotNull(message= "please provide title")
    private String title;
	
	@NotNull(message= "please provide author name")
    private String author;
    
	@Column(unique= true)
	@NotNull(message= "please provide isbn")
    private String isbn;
    
	@NotNull(message= "please provide genre of book")
    private String genre;

}
