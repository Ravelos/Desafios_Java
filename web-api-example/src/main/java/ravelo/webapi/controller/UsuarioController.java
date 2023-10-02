package ravelo.webapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ravelo.webapi.model.Usuario;
import ravelo.webapi.repository.UsuarioRepository;

import java.util.List;

@RestController
@RestController("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.listAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PostMapping ()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
