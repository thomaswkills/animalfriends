package service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import DAO.DAOGenerico;
import modelo.mausTratos;
@Path("/WBSMausTratos")
@ApplicationPath("/resource")
public class WbServiceMausTratos extends Application{
	@GET
	@Path("/hi")
	public String hi(){
		return "hello";
	}
	
	
	
	@POST
	@Path("/cadastraMausTratos")
	public void cadastraMausTratos(
			@FormParam ("descricaoMT") String DescricaoMT,
			@FormParam ("contatoMT") String ContatoMT,
			@FormParam ("cidadeMT") String CidadeMT,
			@FormParam ("LatitudeMT") Double LatitudeMT,
			@FormParam ("longitudeMT") Double LongitudeMT){
		
		DAOGenerico dao = new DAOGenerico();
		mausTratos mt = new mausTratos();
		mt.setDescricaoMT(DescricaoMT);
		mt.setContatoMT(ContatoMT);
		mt.setCidadeMT(CidadeMT);
		mt.setLatitudeMT(LatitudeMT);
		mt.setLongitudeMT(LongitudeMT);
		dao.inserir(mt);	
	}
	
	
	
}
