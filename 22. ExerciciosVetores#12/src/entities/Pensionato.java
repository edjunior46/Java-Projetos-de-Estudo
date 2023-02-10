package entities;

public class Pensionato {
    
    private String nome;
    private String email;

    public Pensionato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String obterRelatorio(Pensionato[] arrPensionato) {
        String result = "";

        for (int i = 0; i < arrPensionato.length; i++) {
            if (arrPensionato[i] != null) {
                result += "\r\n"
                + "Quarto " + i
                + "\r\n"
                + "Nome: " + arrPensionato[i].getNome()
                + "\r\n"
                + "Email: " + arrPensionato[i].getEmail()
                + "\r\n";
            } else {
                result += "\r\n"
                + "Quarto " + i + " vazio"
                + "\r\n";
            }
        }

        return result;
    }

}
