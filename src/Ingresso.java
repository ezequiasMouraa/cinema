public class Ingresso {

    private Filme filme;
    private String tipoIngresso;
    private int horarioSessao;

    public Ingresso(Filme filme, String tipoIngresso, int horarioSessao) {
        this.filme = filme;
        this.tipoIngresso = tipoIngresso;
        this.horarioSessao = horarioSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public int getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(int horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public float getValor() {
        if (tipoIngresso.equals("inteiro")) {
            return 24;
        } else {
            return 12;
        }
    }
}
