package br.com.vr.enderecoapi.controller

import br.com.vr.enderecoapi.domain.model.Endereco
import br.com.vr.enderecoapi.domain.repository.EnderecoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EnderecoController constructor(
        private val repository: EnderecoRepository
) {

    @GetMapping(path = ["/enderecos"])
    fun getEnderecos(): List<Endereco> {
        return repository.findAll()
    }

    @PostMapping(path = ["/enderecos"])
    fun saveEndereco(endereco: Endereco) {
        repository.save(endereco)
    }
}
