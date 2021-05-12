package org.example.usecase.exceptions;

public class ClientException extends RuntimeException {
    public enum Type {
        CLIENT_NOT_FOUND("El cliente no existe", 404);

        private String message;
        private Integer status;

        public ClientException build() {
            return new ClientException(this);
        }

        Type(String message, Integer status) {
            this.message = message;
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public Integer getStatus() {
            return status;
        }
    }

    private final ClientException.Type type;

    private ClientException(ClientException.Type type) {
        super(type.message);
        this.type = type;
    }

    public ClientException.Type getType() {
        return type;
    }
}
