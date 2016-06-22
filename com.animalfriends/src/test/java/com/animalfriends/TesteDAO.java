package com.animalfriends;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import DAO.DAOGenerico;
import modelo.adocao;
import service.WbServiceAdocao;

public class TesteDAO {

	@Test
	public void teste() throws Exception {
		DAOGenerico dao = new DAOGenerico();
		
		adocao a1 = new adocao(
				"nomeAnunciante1",
				"descricaoAnimal1",
				"1",
				"nomeAnimal1",
				"especieAnimal1", 
				"sexoAnimal1", 
				"pelagemAnimal1",
				"racaAnimal1",
				"cidadeAnimal1",
				"observacao1",
				true, 
				2,
				3,
				4.);
		adocao a2 = new adocao(
				"nomeAnunciante2",
				"descricaoAnimal2",
				" 1",
				"nomeAnimal2", 
				"especieAnimal2",
				"sexoAnimal2", 
				"pelagemAnimal2", 
				"racaAnimal2",
				"cidadeAnimal2",
				"observacao2", 
				true, 
				2,
				3,
				4.);
		adocao a3 = new adocao(
				"nomeAnunciante3",
				"descricaoAnimal3",
				" 1",
				"nomeAnimal3",
				"especieAnimal3",
				"sexoAnimal3",
				"pelagemAnimal3",
				"racaAnimal3",
				"cidadeAnimal3", 
				"observacao3",
				true,
				2,
				3,
				4.);
		
		
		
		System.out.println("*** Persist - start ***");
		//inserir
		dao.inserir(a1);
		dao.inserir(a2);
		dao.inserir(a3);
		List<adocao> listaAdocao = dao.lista(adocao.class);
		

		Assert.assertEquals(3, listaAdocao.size());
		
		
		
		//alterar
		a1.setNomeAnunciante("Nome anunciante atualizado");
		dao.salvar(a1);
		adocao AlterAdocao = (adocao) dao.recupera(adocao.class, 1L );
		

		Assert.assertEquals("Nome anunciante atualizado", a1.getNomeAnunciante());
		
		//deletar
		
		dao.excluir(a3);
		Assert.assertEquals(null, a3.getId());
		
		
	}
	
}
