package com.lucas.projetosprint01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/centro")
public class CentroCulturalController {

    //Atributos
    private List<Obra> obras = new ArrayList<Obra>();
    private List<Compravel> compras = new ArrayList<Compravel>();

    //endpoint para adicionar uma pintura ao Centro Cultural
    @PostMapping("/adicionarpintura")
    public void adicionaPintura(@RequestBody Pintura p) {
        obras.add(p);
    }

    //endpoint para adicionar uma escultura ao Centro Cultural
    @PostMapping("/adicionarescultura")
    public void adicionaEscultura(@RequestBody Escultura e) {
        obras.add(e);
    }

    //endpoint para adicionar um filme ao Centro Cultural
    @PostMapping("/adicionarfilme")
    public void adicionaFilme(@RequestBody Cinema c) {
        obras.add(c);
    }

    //endpoint para adicionar uma dança ao Centro Cultural
    @PostMapping("/adicionardanca")
    public void adicionaFilme(@RequestBody Danca d) {
        obras.add(d);
    }

    //endpoint para adicionar uma música ao Centro Cultural
    @PostMapping("/adicionarmusica")
    public void adicionaMusica(@RequestBody Musica m) {
        obras.add(m);
    }

    //endpoint para adicionar um livro ao Centro Cultural
    @PostMapping("/adicionarlivro")
    public void adicionaLivro(@RequestBody Literatura l) {
        obras.add(l);
    }

    //endpoint para exibir as obras disponíveis no Centro Cultural
    @GetMapping("/obras")
    public List<Obra> getObras() {
        return obras;
    }

    //endpoint para exibir as obras disponíveis pelo movimento artístico
    @GetMapping("/movimento/{id}")
    public String exibirMovimento(@PathVariable String id) {
          String movimento = "";

        for (Obra o : obras) {
            if (id.equals(o.getMovimentoArtistico())) {
                movimento += ((o.getNome()) + " | ");
            }
        }
        return movimento;
    }

    //endpoint para exibir as obras pelos artistas
    @GetMapping("/artista/{id}")
    public String exibirArtista(@PathVariable String id) {
        String artista = "";

        for (Obra o : obras) {
            if (id.equals(o.getArtista())) {
                artista += ((o.getNome()) + " | ");
            }
        }
        return artista;
    }

    //endpoint para deletar uma obra do Centro Cultural
    @DeleteMapping("/excluir/{id}")
    public void excluirObra(@PathVariable int id) {
        obras.remove(id - 1);
    }

    //endpoint para comprar uma pintura
    @PostMapping("/comprarpintura")
    public void compraPintura(@RequestBody Pintura p) {
        compras.add(p);
    }

    //endpoint para comprar uma escultura
    @PostMapping("/comprarescultura")
    public void compraEscultura(@RequestBody Escultura e) {
        compras.add(e);
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
    public List<Compravel> getCompras() {
        return compras;
    }
}
