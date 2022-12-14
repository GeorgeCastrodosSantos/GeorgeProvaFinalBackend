package br.com.tech4me.primeirorest.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.primeirorest.clienteHTTP.VendaFeignClient;
import br.com.tech4me.primeirorest.compartilhado.ProdutoDto;
import br.com.tech4me.primeirorest.model.Produto;
import br.com.tech4me.primeirorest.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    @Autowired
    private VendaFeignClient vendaMsClient;

    @Override
    public ProdutoDto criarProduto(ProdutoDto produto) {
        return salvarProduto(produto);
    }

    @Override
    public List<ProdutoDto> obterTodos() {
        List<Produto> produtos = repo.findAll();

        return produtos.stream()
            .map(produto -> new ModelMapper().map(produto, ProdutoDto.class))
            .collect(Collectors.toList());
    }

    @Override
    public Optional<ProdutoDto> obterPorId(String id) {
        Optional<Produto> produto = repo.findById(id);
 
         
        if(produto.isPresent()) {
            ProdutoDto dto = new ModelMapper().map(produto.get(), ProdutoDto.class);
            dto.setVenda(vendaMsClient.obterVenda(id));
            return Optional.of(dto);
        }
 
        return Optional.empty();
     }

    @Override
    public void removerProduto(String id) {
        repo.deleteById(id);
    }

    @Override
    public ProdutoDto atualizarProduto(String id, ProdutoDto produto) {
        produto.setId(id);
        return salvarProduto(produto);
    }

    private ProdutoDto salvarProduto(ProdutoDto produto) {
        ModelMapper mapper = new ModelMapper();
        Produto produtoEntidade = mapper.map(produto, Produto.class);
        produtoEntidade = repo.save(produtoEntidade);

        return mapper.map(produtoEntidade, ProdutoDto.class);
    }
}
