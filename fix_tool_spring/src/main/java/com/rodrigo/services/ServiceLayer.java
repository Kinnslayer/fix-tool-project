package com.rodrigo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rodrigo.model.Message;
import com.rodrigo.model.UserRegister;
import com.rodrigo.repository.UserRegisterRepository;



@Service
public class ServiceLayer {
    
    @Autowired
    private Message mensagem;

    //Serviço para o UserRegister
    @Autowired
    private UserRegisterRepository acaoUser;


    //Método para cadastrar um usuário
    public ResponseEntity<?> cadastrar(UserRegister user) {

        if(user.getLoginId().equals("")){
            mensagem.setMensagem("O login precisa ser preenchido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if(user.getName().equals("")){
            mensagem.setMensagem("O nome precisa ser preenchido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if(user.getEmail().equals("")){
            mensagem.setMensagem("Insira um e-mail válido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(user.getPassword().equals("")){
            mensagem.setMensagem("É necessário preencher o campo password.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(acaoUser.save(user), HttpStatus.CREATED);
        }
    }


    //Método para selecionar o usuário
    public ResponseEntity<?> selecionar() {
        return new ResponseEntity<> (acaoUser.findAll(), HttpStatus.OK);
    }


    //Método para selecionar usuário através do login
    public ResponseEntity<?> selecionarPeloLogin(String loginId) {
        
        if(acaoUser.existsById(loginId)){
            return new ResponseEntity<>(acaoUser.findById(loginId), HttpStatus.OK);
        } else {
            mensagem.setMensagem("Usuário não encontrado");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);            
        }

    }


    //Método para editar dados
    public ResponseEntity<?> editar(UserRegister user) {

        if (user.getLoginId().isEmpty()) {
            mensagem.setMensagem("Por favor insira um login válido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if(user.getName().equals("")) {
            mensagem.setMensagem("É necessário informar um nome válido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if(user.getEmail().equals("")) {
            mensagem.setMensagem("Insira um e-mail válido.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else if(user.getPassword().equals("")) {
            mensagem.setMensagem("É preciso informar uma senha válida.");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(acaoUser.save(user), HttpStatus.OK);
        }

    }


}
