import java.io.*;

public class Arquivo {

    public void lerJogos(){
        FileInputStream fluxoEntrada = null;
        InputStreamReader geradorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;

        try{
            fluxoEntrada = new FileInputStream("arquivoScratch.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);
            String leitura = bufferEntrada.readLine();

            while(leitura != null){
                System.out.println(leitura);
                leitura = bufferEntrada.readLine();
            }
        }
        catch(Exception e){
            System.err.printf(String.valueOf(e));
        }
        finally{
            try{
                assert bufferEntrada != null;
                bufferEntrada.close();
                System.out.println("Sistema foi encerrado. ");
            }
            catch(IOException e){
                System.err.printf(String.valueOf(e));
            }
        }
    }

    public void lerJogo(double preco){
        FileInputStream fluxoEntrada = null;
        InputStreamReader geradorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;

        try{
            fluxoEntrada = new FileInputStream("arquivoScratch.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);
            String leitura = bufferEntrada.readLine();

            while(leitura != null){
                if(leitura.contains("Preço: " + preco)){
                    System.out.println(leitura);
                }
                leitura = bufferEntrada.readLine();
            }
        }
        catch(Exception e){
            System.err.printf(String.valueOf(e));
        }
        finally{
            try{
                assert bufferEntrada != null;
                bufferEntrada.close();
            }
            catch(IOException e){
                System.err.printf(String.valueOf(e));
            }
        }
    }

    public void escrever(Jogo jogo){
        FileOutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;

        try{
            fluxoSaida = new FileOutputStream("arquivoScratch.txt", true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            bufferSaida.write("Jogo: { ID: " + jogo.getId() + ", Nome: " + jogo.getNome() + ", Preço: " + jogo.getPreco() + " }");
            bufferSaida.newLine();
        }
        catch(Exception e){
            System.err.printf(String.valueOf(e));
        }
        finally{
            try{
                assert bufferSaida != null;
                bufferSaida.close();
            }
            catch(IOException e){
                System.err.printf(String.valueOf(e));
            }
        }
    }
}
