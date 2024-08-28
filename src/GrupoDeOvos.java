public enum GrupoDeOvos {
    AMORFO("Amorfo"),
    INSETO("Inseto"),
    DRAGAO("Dragão"),
    FADA("Fada"),
    CAMPO("Campo"),
    VOADOR("Voador"),
    GRAMA("Grama"),
    HUMANOIDE("Humanoíde"),
    MINERAL("Mineral"),
    MONSTRO("Monstro"),
    AGUA_1("Água 1"),
    AGUA_2("Água 2"),
    AGUA_3("Água 3"),
    DITTO("Ditto"),
    INDETERMINADO("Indeterminado");

    private final String grupo;

    GrupoDeOvos(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }
}