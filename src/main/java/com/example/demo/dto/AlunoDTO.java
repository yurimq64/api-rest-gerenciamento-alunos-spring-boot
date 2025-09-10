package com.example.demo.dto;

import com.example.demo.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public class AlunoDTO {

    private Long id;
    private String nome;
    private String email;

    public AlunoDTO() {
    }

    public AlunoDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
