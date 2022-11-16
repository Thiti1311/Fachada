package Subsistemas;

import java.util.ArrayList;

//(balanço de contas, folha de pagamento);
public class Finaceiro {

    private ArrayList<Salario> folhaDePagamento = new ArrayList<Salario>();

    public Finaceiro(){}

    public ArrayList<Salario> getFolhaDePagamento() {
        return folhaDePagamento;
    }

    public void setFolhaDePagamento(ArrayList<Salario> folhaDePagamento) {
        this.folhaDePagamento = folhaDePagamento;
    }

    public Salario addPagamento(Professor professor, float valorSalario){
        Salario novoPagamento = new Salario(professor, valorSalario);
        folhaDePagamento.add(novoPagamento);
        return novoPagamento;
    }

    public void mostrarFolha(){
        for (int i = 0; i < folhaDePagamento.size(); i++){
            System.out.println(folhaDePagamento.get(i).toString());
        }
    }

    public double valorTotal(){
        double total = 0;
        for (int i = 0; i < folhaDePagamento.size(); i++){
            total += folhaDePagamento.get(i).getValorSalario();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Folha de pagamento [ " + folhaDePagamento + " ]";
    }
}
