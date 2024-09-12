import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class AulaSeis {
    static FileReader fr;
    static BufferedReader br;
    static FileWriter fw;
    static BufferedWriter bw;
    public static final String ARQ_ENTRADA = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\entrada.txt";
    static final String ARQ_SAIDA = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\saida.txt";

    public static void main(String[] args) throws IOException {
        fr = new FileReader(ARQ_ENTRADA);
        br = new BufferedReader(fr);
        fw = new FileWriter(ARQ_SAIDA);
        bw = new BufferedWriter(fw);

        ex4Campeonato();
    }
        private static void ex1Ordenacao() throws IOException {
        String linha = br.readLine();
        ArrayList<String> nomes = new ArrayList<>();
        while (linha != null) {
            nomes.add(linha);
            linha = br.readLine();
        }
        Collections.sort(nomes);

        for (String nome : nomes) {
            bw.write(nome + "\n");
        }
        bw.flush();
    }

    private static void ex2AcimaDaMedia() throws IOException {
        String linha = br.readLine();
        String [] valores = linha.split("-");
        String time1 = valores[0];
        String time2 = valores[1];
        int golsTime1 = Integer.parseInt(valores[2]);
        int golsTime2 = Integer.parseInt(valores[3]);
        if(golsTime1 > golsTime2){
            fw.write("Vencedor: " + time1+"\n");
        } else if(golsTime2 > golsTime1){
            System.out.println("Vencedor: " + time2+"\n");
        } else {
            System.out.println("Empate\n");
        }
    }
    public static void ex3Campeonato(){

        String linha;
    }
    public static void ex4Campeonato() throws IOException {
        int nTimes = Integer.parseInt(br.readLine());
        String[] nomesTimes = new String[nTimes];
        int[] pontosTimes = new int[nTimes];

        for (int i = 0; i < nTimes; i++) {
            nomesTimes[i] = br.readLine().substring(2);
        }
        int nPartidas = Integer.parseInt(br.readLine());
        for (int i = 0; i < nPartidas; i++) {
            String[] partida = br.readLine().split(" ");
            int codTime1 = Integer.parseInt(partida[0]);
            int codTime2 = Integer.parseInt(partida[1]);
            int golsTime1 = Integer.parseInt(partida[2]);
            int golsTime2 = Integer.parseInt(partida[3]);

            if (golsTime1 > golsTime2) {
                pontosTimes[codTime1] += 3;
            } else if (golsTime2 > golsTime1) {
                pontosTimes[codTime2] += 3;
            } else {
                pontosTimes[codTime1] += 1;
                pontosTimes[codTime2] += 1;
            }
        }

        for (int i = 0; i < nTimes; i++) {
            bw.write(nomesTimes[i] + ": " + pontosTimes[i] + " pontos\n");
        }
        bw.flush();
        int maxPontos = -1;
        String campeao = "";
        for (int i = 0; i < nTimes; i++) {
            if (pontosTimes[i] > maxPontos) {
                maxPontos = pontosTimes[i];
                campeao = nomesTimes[i];
            }
        }
        bw.write("Campeão: " + campeao + "\n");
        bw.flush();
    }
    }

