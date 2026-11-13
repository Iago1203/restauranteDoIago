package br.com.senai.deliveryavaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.senai.deliveryavaliacao.dto.ProdutoRequest;

import br.com.senai.deliveryavaliacao.model.Produto;
import br.com.senai.deliveryavaliacao.model.Restaurante;
import br.com.senai.deliveryavaliacao.repository.ProdutoRepository;
import br.com.senai.deliveryavaliacao.repository.RestauranteRepository;

@Service 
public class ProdutoService {
    public final ProdutoRepository produtoRepository;
    public final RestauranteRepository restauranteRepository;

    public ProdutoService(ProdutoRepository produtoRepository, RestauranteRepository restauranteRepository) {
        this.produtoRepository = produtoRepository;
        this.restauranteRepository = restauranteRepository;
    }

    public Optional<Produto> cadastrar(ProdutoRequest produtoRequest) {
        Optional<Restaurante> restauranteId = restauranteRepository.findById(produtoRequest.getRestauranteId());
        if (restauranteId.isEmpty()) {
            return Optional.empty();
        }
        Produto produto = new Produto();
        produto.setNome(produtoRequest.getNome());
        produto.setPreco(produtoRequest.getPreco());
        produto.setRestauranteId(restauranteId.get());
        return Optional.of(produtoRepository.save(produto));
    }
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
    public Optional<Produto> buscarPorId(Integer id) {
        return produtoRepository.findById(id);
    }

    public Optional<Produto> atualizar(Integer id,ProdutoRequest novosDados ) {
        Optional<Produto> produtoEncontrado = produtoRepository.findById(id);
        if (produtoEncontrado.isEmpty()) {
            return Optional.empty();
        }
        Produto produto = produtoEncontrado.get();
        produto.setNome(novosDados.getNome());

        return Optional.of(produtoRepository.save(produto));
    }
 public boolean excluir(Integer id) {

        if (!produtoRepository.existsById(id)) {
            return false;
        }
        produtoRepository.deleteById(id);
        return true;
    }


}
