package maju.company.redeSocial.model;

public class UsuarioLogin {
	
	private String nomeCompleto;
    private String email;
    private String senha;
    private String token;

    public String getNome() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getEmail() {
        return email;
    }
    public void setUsuario(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

}
