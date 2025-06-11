public class Ebook extends Livros {
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        setValor(getValor() - getValor() * porcentagem);
        return true;

    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
