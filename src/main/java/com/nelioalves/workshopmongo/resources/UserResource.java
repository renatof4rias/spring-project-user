package com.nelioalves.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController                                       // <- Anotacao responsavel por dizer que a classe eh um recurso REST
@RequestMapping(value= "/users")                      // <- Anotacao responsavel por dizer o endereco dos endpoint 
public class UserResource {


//---------------------------------------------------------------------------------------------------------------------------------	

	@RequestMapping(method=RequestMethod.GET)                                    // <- Anotacao responsavel por dizer que o end point deste metodo eh o GET (quando eu utilizar GET/users) o metodo vai ser chamado
	public ResponseEntity<List<User>>  findAll(){												 
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
//---------------------------------------------------------------------------------------------------------------------------------	
	
	
}
