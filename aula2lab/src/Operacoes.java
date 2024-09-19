public class Operacoes{

    int n;

    int calcFatorial(int n) {
        int fatorial = 1;
        for (int i=1; i<=n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    void mostraPares(int n){

        for(int i=1; i<n ; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
