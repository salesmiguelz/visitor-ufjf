package org.example;

public class PushNotification implements Notification{
    private String dispositivo;
    private String mensagem;

    public String aceitar(Visitor visitor) {
        return visitor.exibirPushNotification(this);
    }

    public PushNotification(String dispositivo, String mensagem){
        this.dispositivo = dispositivo;
        this.mensagem = mensagem;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String getMensagem(){
        return mensagem;
    }

}
