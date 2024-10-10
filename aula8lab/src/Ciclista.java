public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento(){
        System.out.println("O ciclista colocou o equipamento. ");
    }

    @Override
    public void treinar(){
        System.out.println("O atleta treina ciclismo. ");
    }
}
