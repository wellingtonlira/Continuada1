package com.example.avaliacao_c1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/loja")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

     @GetMapping("/produtos")
    public ResponseEntity getJogosLista() {
        if (produtos.isEmpty()) {
            // 204 No Content
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(produtos);
        }
    }

    @PostMapping("/cadastra/jogo")
    public ResponseEntity cadastrarProduto(@RequestBody Jogo novoJogo) {
        produtos.add(novoJogo);
        // 201 ou 400 Bad request
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/cadastra/livro")
    public ResponseEntity cadastrarLivro(@RequestBody Livro novoLivro) {
        produtos.add(novoLivro);
        return ResponseEntity.created(null).build();
    }

//Metodo Delete
    @DeleteMapping("/comprar/produto/{id}")
    public ResponseEntity comprarJogo(@PathVariable int id) {
        if (produtos.size() >= id) {
            produtos.remove(id-1);
            return ResponseEntity.ok().build();
            // 200
        } else {
            return ResponseEntity.notFound().build();
            // 404 Not Found
        }
    }

}