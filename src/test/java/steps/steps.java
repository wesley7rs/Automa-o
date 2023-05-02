package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.elementos;
import metodos.metodos;

public class steps {

	metodos m = new metodos();
	elementos e = new elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.executarNavegador(url, "Abrindo Navegador");
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
		m.click(e.getBtnAbrirConta(), "Selecionando Botão Abrir Conta");
	}

	@Given("^selecionar o botao para voce$")  
	public void selecionar_o_botao_para_voce() throws Throwable {
		m.pausa(3000, "pause anttes de clicar no botão");
		m.click(e.getBtnAbrirConta(), "Selecionando Botão Abrir Conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.peencher(e.getCampoNome(), "Flash Code", "Preenchendo o Campo Nome");
		m.peencher(e.getCampoTelefone(), "11111111111", "Preenchendo o Campo Telefone");
		m.peencher(e.getCampoEmail(), "testeteste@gmail.com", "Preenchendo o Campo Email");
		m.peencher(e.getCampoCpf(), "39202954046", "Preenchendo o Campo Cpf");
	}

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		m.click(e.getBtnQueroSerCliente(), "Selecionando Botão Quero Ser Cliente");
	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {

	}

}
