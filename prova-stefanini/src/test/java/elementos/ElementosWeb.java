package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	
	private By nome = By.id("name");
	private By email = By.id("email");
	private By senha = By.id("password");
	private By cadastrar = By.id("register");
	private By validamsg = By.xpath("//*[@id=\"root\"]/div/div/div[2]/h2[2]");
	
	
	
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getValidamsg() {
		return validamsg;
	}

}
