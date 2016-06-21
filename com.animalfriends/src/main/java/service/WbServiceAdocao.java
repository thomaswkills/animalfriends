package service;

import java.util.Date;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import DAO.DAOGenerico;
import modelo.adocao;

@Path("/WBSAdocao")
@ApplicationPath("/resource")
public class WbServiceAdocao extends Application {
	@GET
	@Path("/hi")
	public String hi(){
		return "hello";
	}
	
	
	
	@POST
	@Path("/cadastraAdocao")
	public void cadastraAdocao(
			@FormParam ("nomeAnunciante") String nomeAnunciante,
			@FormParam ("estadoAnunciante") String estadoAnunciante,
 			@FormParam ("descricaoAnimal") String descricaoAnimal,
			@FormParam ("telefoneAnunciante") String telefoneAnunciante,
			@FormParam ("nomeAnimal")String nomeAnimal,
			@FormParam ("especieAnimal") String especieAnimal,
			@FormParam ("sexoAnimal") String sexoAnimal,
			@FormParam ("pelagemAnimal") String pelagemAnimal,
			@FormParam ("racaAnimal") String racaAnimal,
			@FormParam ("cidadeAnimal") String cidadeAnimal,
			@FormParam ("observacao") String observacao,
			@FormParam ("cpfAnunciante")int cpfAnunciante,
			@FormParam ("idadeAnimal")int idadeAnimal,
			@FormParam ("castrado")Boolean castrado,
			@FormParam ("dataCadastro")Date dataCadastro)
	{
		DAOGenerico dao = new DAOGenerico();
		adocao ad = new adocao();
		ad.setNomeAnunciante(nomeAnunciante);
		ad.setEstadoAnunciante(estadoAnunciante);
		ad.setDescricaoAnimal(descricaoAnimal);
		ad.setTelefoneAnunciante(telefoneAnunciante);
		ad.setNomeAnimal(nomeAnimal);
		ad.setEspecieAnimal(especieAnimal);
		ad.setSexoAnimal(sexoAnimal);
		ad.setPelagemAnimal(pelagemAnimal);
		ad.setRacaAnimal(racaAnimal);
		ad.setCidadeAnimal(cidadeAnimal);
		ad.setObservacao(observacao);
		ad.setCpfAnunciante(cpfAnunciante);
		ad.setIdadeAnimal(idadeAnimal);
		ad.setCastrado(castrado);
		ad.setDataCadastro(dataCadastro);
		dao.inserir(ad);
		
		System.out.println("Method");
		
	}

}
