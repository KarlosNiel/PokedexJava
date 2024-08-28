public class Pokemon {
    private String nome;
    private String sexo;
    private double altura;
    private double Peso;
    private int numeroDex;
    private String tipo1;
    private String tipo2;
    private String grupo1;
    private String grupo2;
    private String habilidade1;
    private String habilidade2;
    private String evolucao1;
    private String evolucao2;

    public Pokemon(String nome, String sexo, double altura, double peso, int numeroDex, String tipo1, String tipo2,
                   String grupo1, String grupo2, String habilidade1, String habilidade2, String evolucao1, String evolucao2) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        Peso = peso;
        this.numeroDex = numeroDex;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.grupo1 = grupo1;
        this.grupo2 = grupo2;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.evolucao1 = evolucao1;
        this.evolucao2 = evolucao2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public int getNumeroDex() {
        return numeroDex;
    }

    public void setNumeroDex(int numeroDex) {
        this.numeroDex = numeroDex;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getGrupo1() {
        return grupo1;
    }

    public void setGrupo1(String grupo1) {
        this.grupo1 = grupo1;
    }

    public String getGrupo2() {
        return grupo2;
    }

    public void setGrupo2(String grupo2) {
        this.grupo2 = grupo2;
    }

    public String getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }

    public String getEvolucao1() {
        return evolucao1;
    }

    public void setEvolucao1(String evolucao1) {
        this.evolucao1 = evolucao1;
    }

    public String getEvolucao2() {
        return evolucao2;
    }

    public void setEvolucao2(String evolucao2) {
        this.evolucao2 = evolucao2;
    }

    @Override
    public String toString() {
        if (this.getNome().equalsIgnoreCase("Eevee")) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m" + '\n' +
                    "Peso: " + Peso + "kg" + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao1 + " ou " + evolucao2 + " ou " + "Flareon" + '\n';
        } else if (this.tipo2 == null && this.grupo2 == null && this.evolucao1 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + "Sem evoluções descobertas para este pokémon" + '\n';
        } else if (this.tipo2 == null && this.grupo2 == null && this.evolucao1 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao2 + '\n';
        } else if (this.tipo2 == null && this.grupo2 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao1 + '\n';
        } else if (this.tipo2 == null && this.evolucao1 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + " e " + grupo2 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + "Sem evoluções descobertas para este pokémon" + '\n';
        } else if (this.tipo2 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + '\n' +
                    "grupo: " + grupo1 + " e " + grupo2 + '\n' +
                    "habilidades: " + habilidade1 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao1 + '\n';
        } else if (this.grupo2 == null && this.evolucao1 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + " e " + tipo2 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + "Sem evoluções descobertas para este pokémon" + '\n';
        } else if (this.grupo2 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + " e " + tipo2 + '\n' +
                    "grupo: " + grupo1 + '\n' +
                    "habilidades: " + habilidade1 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao1 + '\n';
        } else if (this.evolucao1 == null && this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + " e " + tipo2 + '\n' +
                    "grupo: " + grupo1 + " e " + grupo2 + '\n' +
                    "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                    "Evoluções: " + "Sem evoluções descobertas para este pokémon" + '\n';
        } else if (this.evolucao2 == null) {
            return  "Nome: " + nome + '\n' +
                    "Sexo: " + sexo + '\n' +
                    "Altura: " + altura + "m " + '\n' +
                    "Peso: " + Peso + "kg " + '\n' +
                    "Numero: " + numeroDex + '\n' +
                    "tipagem: " + tipo1 + " e " + tipo2 + '\n' +
                    "grupo: " + grupo1 + " e " + grupo2 + '\n' +
                    "habilidades: " + habilidade1 + '\n' +
                    "Evoluções: " + nome + " -----> " + evolucao1 + '\n';
        }
        return  "Nome: " + nome + '\n' +
                "Sexo: " + sexo + '\n' +
                "Altura: " + altura + "m" + '\n' +
                "Peso: " + Peso + "kg" + '\n' +
                "Numero: " + numeroDex + '\n' +
                "tipagem: " + tipo1 + ' ' + tipo2 + '\n' +
                "grupo: " + grupo1 + " e " + grupo2 + '\n' +
                "habilidades: " + habilidade1 + ' ' + "ou" + ' ' + habilidade2 + '\n' +
                "Evoluções: " + nome + " -----> " + evolucao1 + " -----> " + evolucao2 + '\n';
    }
}

