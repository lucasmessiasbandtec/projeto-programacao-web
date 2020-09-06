package com.lucas.projetosprint01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/obras")
public class CentroCulturalController {

    //Atributos
    private List<Obra> obras = new ArrayList<Obra>();
    private List<Compravel> compras = new ArrayList<Compravel>();

    //endpoint para adicionar uma pintura ao Centro Cultural
    @PostMapping("/pintura")
    public ResponseEntity adicionaPintura(@RequestBody Pintura p) {

        obras.add(p);
        return ResponseEntity.status(201).build();
    }

    //endpoint para adicionar uma escultura ao Centro Cultural
    @PostMapping("/escultura")
    public ResponseEntity adicionaEscultura(@RequestBody Escultura e) {

        obras.add(e);
        return ResponseEntity.status(201).build();
    }

    //endpoint para adicionar um filme ao Centro Cultural
    @PostMapping("/filme")
    public ResponseEntity adicionaFilme(@RequestBody Cinema c) {

        obras.add(c);
        return ResponseEntity.status(201).build();
    }

    //endpoint para adicionar uma dança ao Centro Cultural
    @PostMapping("/danca")
    public ResponseEntity adicionaFilme(@RequestBody Danca d) {

        obras.add(d);
        return ResponseEntity.status(201).build();
    }

    //endpoint para adicionar uma música ao Centro Cultural
    @PostMapping("/musica")
    public ResponseEntity adicionaMusica(@RequestBody Musica m) {

        obras.add(m);
        return ResponseEntity.status(201).build();
    }

    //endpoint para adicionar um livro ao Centro Cultural
    @PostMapping("/livro")
    public ResponseEntity adicionaLivro(@RequestBody Literatura l) {

        obras.add(l);
        return ResponseEntity.status(201).build();
    }

    //endpoint para exibir as obras disponíveis no Centro Cultural
    @GetMapping
    public ResponseEntity listarObras() {
        if (obras.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(obras);
        }
    }

    //endpoint para exibir as obras disponíveis pelo movimento artístico
    @GetMapping("/movimento/{id}")
    public ResponseEntity exibirMovimento(@PathVariable String id) {
          List<Obra> obrasMovimento = obras.stream().filter(obra -> obra.getMovimentoArtistico().equals(id))
                  .collect(Collectors.toList());

          if (obrasMovimento.isEmpty()) {
              return ResponseEntity.status(204).build();
          } else {
              return ResponseEntity.ok(obrasMovimento);
          }
    }

    //endpoint para exibir as obras pelos artistas
    @GetMapping("/artista/{id}")
    public ResponseEntity exibirArtista(@PathVariable String id) {
        List<Obra> obrasArtista = obras.stream().filter(obra -> obra.getArtista().equals(id))
                .collect(Collectors.toList());

        if(obrasArtista.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(obrasArtista);
        }
    }

    //endpoint para deletar uma obra do Centro Cultural
    @DeleteMapping("/{id}")
    public ResponseEntity excluirObra(@PathVariable int id) {
        if (obras.size() >= id) {
            obras.remove(id -1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }

    //endpoint para comprar uma pintura
    @PostMapping("/comprarpintura")
    public ResponseEntity compraPintura(@RequestBody Pintura p) {

        compras.add(p);
        return ResponseEntity.status(201).build();
    }

    //endpoint para comprar uma escultura
    @PostMapping("/comprarescultura")
    public ResponseEntity compraEscultura(@RequestBody Escultura e) {

        compras.add(e);
        return ResponseEntity.status(201).build();
    }

    //endpoint para saber o total da venda
    @GetMapping("/total")
    public Double calculaTotalVenda() {
        Double total = 0.0;

        for (Compravel c : compras) {
            total += c.getValorPreco();
        }

        return total;
    }

    //endpoint para listar as obras compradas
    @GetMapping("/comprados")
    public ResponseEntity getCompras() {
        if (compras.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(compras);
        }
    }
}
