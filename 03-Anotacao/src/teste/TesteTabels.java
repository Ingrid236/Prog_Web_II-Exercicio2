package teste;

import modelo.Profissional;
import modelo.SuperTabela;
import modelo.Pessoa;

public class TesteTabels {
	public static void main(String[] args) {
		Pessoa tab = new Pessoa();
		tab.setId(10);
		tab.setNome("coisa");
		printTableData(tab);
		tab.setPk(20);
		printTableData(tab);
		Profissional p = new Profissional();
		p.setCpf(11122233345L);
		p.setNome("Profissional da alegria");
		printTableData(p);
		p.setCpf(99922233345L);
		printTableData(p);
	}

	private static void printTableData(SuperTabela tab) {
		System.out.println("Classe:"+tab.getClass().getName());
		System.out.println("Table Name:"+tab.getTableName());
		System.out.println("Tabela pknome:"+ tab.getPkName());
		System.out.println("Valor PK:"+ tab.getPk());
		System.out.println("------------------------------");
	}
}
