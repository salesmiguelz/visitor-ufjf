package org.example;

public class EmailNotification implements Notification{
    private String email;
    private String mensagem;

    public EmailNotification(String email, String mensagem){
        this.email = email;
        this.mensagem = mensagem;
    }

    public String getEmail() {
        return email;
    }

    public String getMensagem(){
        return mensagem;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEmailNotification(this);
    }
}
