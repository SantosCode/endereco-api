package br.com.vr.enderecoapi.domain.repository

import br.com.vr.enderecoapi.domain.model.Endereco
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EnderecoRepository : JpaRepository<Endereco, Long>