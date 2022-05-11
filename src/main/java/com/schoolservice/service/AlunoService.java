package com.schoolservice.service;

import com.schoolservice.model.Aluno;
import com.schoolservice.repository.DAO;
import org.springframework.stereotype.Service;

@Service
public class AlunoService extends DAO {

    public void saveNewStudent(Aluno aluno) {
        try {
            schooldb.save(aluno);
        } catch (Exception exception){
            logger.error(exception.getMessage());
            throw new IllegalArgumentException(exception.getMessage());
        }
    }
}
