package tests;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.ElementosWeb;
import pages.CadastrarUsuario;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	CadastrarUsuario cadu = new CadastrarUsuario();
	
	

	@Dado("^que eu acesse o site \"([^\"]*)\" para realizar um cadastro$")
	public void que_eu_acesse_o_site_para_realizar_um_cadastro(String site) throws Throwable {
		metodos.abrirNavegador(site, "CHROME", "acessando a tela para realizar cadastro");

	}

	@Quando("^informar os dados do novo usuario$")
	public void informar_os_dados_do_novo_usuario() throws Throwable {
		cadu.preencherDadosUsuario("Bruno Fernandes", "bruno.fernandes@gmail.com", "stefanini01");
		metodos.pausa(3000, "esperando");
		metodos.screnShoot("informar dados do usuário");

	}

	@Entao("^cadastro realizado$")
	public void cadastro_realizado() throws Throwable {
	cadu.enviarCadastro();
	metodos.pausa(3000, "esperando");
	metodos.screnShoot("usuário cadastrado");
	metodos.pausa(3000, "esperando");
	metodos.fecharBrowser("fechando navegador");
		
		

	}



}
