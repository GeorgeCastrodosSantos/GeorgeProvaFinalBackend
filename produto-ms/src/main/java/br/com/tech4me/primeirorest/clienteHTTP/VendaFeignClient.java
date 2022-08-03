package br.com.tech4me.primeirorest.clienteHTTP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.primeirorest.compartilhado.Venda;

@FeignClient(name= "vendas-ms", fallback = VendaFeignClientFallback.class)
public interface VendaFeignClient {
    @GetMapping(path = "/api/vendas/{venda}/lista")
    List<Venda> obterVenda(@PathVariable String venda);   
}

@Component
class VendaFeignClientFallback implements VendaFeignClient {

    @Override
    public List<Venda> obterVenda(String venda) {
        return new ArrayList<>();
    }

}