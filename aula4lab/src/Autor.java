public class Autor {
    String nome;
    Saga[] sagas = new Saga[10];

    void adicionarSaga(Saga sagas) {
        for (int i = 0; i < this.sagas.length; i++) {
            if(this.sagas[i] == null){
                this.sagas[i] = sagas;
                break;
            }
        }
    }

     void listarSagas() {
         for (int i = 0; i < this.sagas.length; i++) {
             if (this.sagas[i] != null) {
                 System.out.print("Saga " + (i + 1) + ": ");
                 System.out.println(this.sagas[i].nota);
             }
         }
     }

}
