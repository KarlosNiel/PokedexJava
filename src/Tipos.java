public enum Tipos {
    NORMAL("Normal"),
    FOGO("Fogo"),
    AGUA("Água"),
    GRAMA("Grama"),
    ELETRICO("Elétrico"),
    GELO("Gelo"),
    LUTADOR("Lutador"),
    VENENOSO("Venenoso"),
    TERRESTRE("Terrestre"),
    VOADOR("Voador"),
    PSIQUICO("Psíquico"),
    INSETO("Inseto"),
    PEDRA("Pedra"),
    FANTASMA("Fantasma"),
    DRAGAO("Dragão"),
    SOMBRIO("Sombrio"),
    METAL("Metal"),
    FADA("Fada");

    private final String tipo;

    Tipos(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}