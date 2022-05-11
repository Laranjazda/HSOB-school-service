package com.schoolservice.controller;

import com.schoolservice.model.Aluno;
import com.schoolservice.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/api/aluno")
public class AlunoController{

    @Autowired
    protected AlunoService alunoService;

    @GetMapping("/aluno/cadastrar")
    public String cadastrar(Model model){
        model.addAttribute("aluno", new Aluno());
        return "aluno/cadastrar";
    }

    @PostMapping("/aluno/salvar")
    public String registerStudent(@ModelAttribute Aluno aluno){
        try {
            alunoService.saveNewStudent(aluno);
            return "redirect:/";
        } catch (Exception exception){
            return exception.getMessage();
        }
    }
}
