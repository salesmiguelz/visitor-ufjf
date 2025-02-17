package org.example;

public class SMSNotification implements Notification{
    private String mensagem;
    private int numeroTelefone;

    public SMSNotification(int numeroTelefone, String mensagem){
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
    }

    public int getNumeroTelefone(){return numeroTelefone;}
    public String getMensagem(){
        return mensagem;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSMSNotification(this);
    }
}



