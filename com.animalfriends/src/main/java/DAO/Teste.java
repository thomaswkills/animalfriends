package DAO;

import modelo.adocao;

public class Teste {
public static void main(String[] args) {
	
	DAOGenerico dao = new DAOGenerico();
for(int i =0;i<10;i ++)	{
adocao a = new adocao();

a.setNomeAnimal("Rex");
a.setCidadeAnimal("End of the World");
	dao.inserir(a);
}
}
}
