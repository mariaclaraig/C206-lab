public class Corredor extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento(){
        System.out.println("O corredor colocou o equipamento. ");
    }

    @Override
    public void treinar(){
        System.out.println("O atleta treina corrida. ");
    }

}
