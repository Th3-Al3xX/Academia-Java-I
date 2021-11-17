import java.time.LocalDate;

public class Data {
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }


    private int dia;
    private int mes;
    private int ano;
    public LocalDate diaUM = LocalDate.of(1970,01,01);

    public String mostrarData(){
        return dia + "/" + mes + "/" + ano;
    }

    public static boolean verificarData(int dia, int mes, int ano){
        if (dia >= 1 && dia <= 31 &&
            mes >= 1 && mes <= 12 &&
            ano >= 1970){
            return true;
        } else {
            return false;
        }

    }
}
