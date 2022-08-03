package br.com.tech4me.vendasms.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.vendasms.compartilhado.VendaDto;

public interface VendaService {
    VendaDto criarVenda(VendaDto venda);
    List<VendaDto> obterTodos();
    Optional<VendaDto> obterPorId(String id);
    void removerVenda(String id);   
    VendaDto atualizarVenda(String id, VendaDto venda);
}
