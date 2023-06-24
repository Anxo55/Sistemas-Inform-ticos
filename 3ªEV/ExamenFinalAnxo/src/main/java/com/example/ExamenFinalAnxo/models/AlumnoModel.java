package com.example.ExamenFinalAnxo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="alumno")
public class AlumnoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(unique = true, nullable=false)
public long id;

public String name;
public String apellido;
public String nota1;
public String nota2;
public String nota3;


@Temporal(TemporalType.TIMESTAMP)
@Column(columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
public java.sql.Timestamp createAt;
    
}
