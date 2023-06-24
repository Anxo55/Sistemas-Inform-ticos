package com.example.ExamenFinalAnxo.Controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ExamenFinalAnxo.models.AlumnoModel;
import com.example.ExamenFinalAnxo.services.AlumnoService2;

import org.springframework.ui.Model;

@Controller
public class AlumnoController {

    @Autowired
    AlumnoService2 alumnoService2;

    @RequestMapping("/alumnos/guardarForm")
    public String guardarForm(){  
    return "guardarForm";
    
    }

    @PostMapping("/guardar")
    public String guardar(Model model, @RequestParam Map<String, String> body) {
        String name = body.get("name");
        String apellido = body.get("apellido");
        String nota1 = body.get("nota1");
        String nota2 = body.get("nota2");
        String nota3 = body.get("nota3");
        AlumnoModel nuevoAlumno = new AlumnoModel();
        nuevoAlumno.name = name;
        nuevoAlumno.apellido = apellido;
        nuevoAlumno.nota1 = nota1;
        nuevoAlumno.nota2 = nota2;
        nuevoAlumno.nota3 = nota3;
        Date date = new Date(0);
        Timestamp ts = new Timestamp(date.getTime());
        nuevoAlumno.createAt = (Timestamp) ts;
        alumnoService2.create(nuevoAlumno);

        ArrayList<AlumnoModel> alumno = alumnoService2.getAll();
        model.addAttribute("alumno", alumno);
        return "alumnosList";
    }

    @RequestMapping("/alumnos")
    public String listar(Model model) {
        ArrayList<AlumnoModel> alumnos = alumnoService2.getAll();
        model.addAttribute("alumnos", alumnos);
        return "alumnosList";
    }

    @RequestMapping("/alumno/{name}")
    public String listarPorNombre(Model model, @PathVariable String name) {
        ArrayList<AlumnoModel> alumnos = alumnoService2.getByName(name);
        model.addAttribute("alumnos", alumnos);
        return "alumnosList";
    }


}
