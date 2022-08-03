package br.com.tech4me.vendasms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.vendasms.repository.VendaRepositorio;
import br.com.tech4me.vendasms.compartilhado.VendaDto;
import br.com.tech4me.vendasms.model.Venda;

@Service
public class VendaServiceImpl implements VendaService {
    @Autowired
    private VendaRepositorio repo;

    @Override
    public VendaDto criarVenda(VendaDto venda) {        
        return salvarVenda(venda);
    }

    @Override
    public List<VendaDto> obterTodos() {
        List<Venda> venda = repo.findAll();

        return venda.stream()
            .map(vendas -> new ModelMapper().map(venda, VendaDto.class))
            .collect(Collectors.toList());
    }

    @Override
    public Optional<VendaDto> obterPorId(String id) {
        Optional<Venda> venda = repo.findById(id);

       if(venda.isPresent()) {
           return Optional.of(new ModelMapper().map(venda.get(), VendaDto.class));
       }

       return Optional.empty();
    }

    @Override
    public void removerVenda(String id) {
        repo.deleteById(id);
    }

    @Override
    public VendaDto atualizarVenda(String id, VendaDto venda) {
        venda.setId(id);
        return venda.atualizarVenda(id, this);
    }

    public VendaDto salvarVenda(VendaDto venda) {
        ModelMapper mapper = new ModelMapper();
        Venda vendaEntidade = mapper.map(venda, Venda.class);
        vendaEntidade = repo.save(vendaEntidade);

        return mapper.map(vendaEntidade, VendaDto.class);
    }

}