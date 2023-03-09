package com.rodrigo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.model.Login;
import com.rodrigo.model.UserRegister;
import com.rodrigo.repository.BugRepository;
import com.rodrigo.repository.LoginRepository;
import com.rodrigo.repository.UserRegisterRepository;
import com.rodrigo.services.ServiceLayer;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FixToolController {

    //Instanciando objeto do Bug model
    @Autowired
    private BugRepository acaoBug;

    //Instanciando objeto do Login model
    @Autowired
    private LoginRepository acaoLogin;

    //Instanciando objeto do User Register model
    @Autowired
    private UserRegisterRepository acaoUser;

    //Instanciando a camada de serviço
    @Autowired
    private ServiceLayer service;

    //Rotas das páginas
    @GetMapping("/")
    public String mensagem() {
        return "Hello World!!";
    }

    //Funções para o Bug model
   // @PostMapping("/login")
    //public Login entrar() {
       // return 
   // }

    //Funções para o Login model
  //  @PostMapping("/login")
    //public Login entrar() {
       // return 
   // }

    //Funções para o User Register model
    //Cadastrar um novo usuário
    @PostMapping("/user-register")
    public ResponseEntity<?> cadastrar(@RequestBody UserRegister user) {
        return service.cadastrar(user);
    }

    //Listar todos os usuários
    @GetMapping("/user-list")
    public ResponseEntity<?> selecionar() {
        return service.selecionar();
    }

    //Listar por atributo 
    @GetMapping("/user-list/{loginId}")
    public ResponseEntity<?> selecionarPeloLogin(@PathVariable String loginId) {
        return service.selecionarPeloLogin(loginId);
    }

    //Editar
    @PutMapping("/user-list")
    public ResponseEntity<?> editar(@RequestBody UserRegister user) {
        return service.editar(user);
    }

    //Deletar
    @DeleteMapping("/user-list/{loginIdUser}")
    public void remover (@PathVariable String loginId) {
       // UserRegister user = selecionarPeloLogin(loginId).orElse(new UserRegister());
      //  acaoUser.delete(user);
    }

    //Contador
    @GetMapping("/user-list/contador")
    public long contador() {
        return acaoUser.count();
    }

    //Status
    @GetMapping("/status")
    public ResponseEntity<?> status() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
