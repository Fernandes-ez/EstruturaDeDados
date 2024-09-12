import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AulaCinco {
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



        br.close();
        bw.close();
        fr.close();
        fw.close();
//        leitura();
//        escrita();
//        formataDataSubString();
//        formataDataSplit();
//        separarNome();

//        quiz();
//        ordenarNome();
    }

    private static void ordenarNome() {
        String nomeCompleto = "Ricardo Molinari dos Prazeres";
        String[] nomeOrdenado = nomeCompleto.split(" ");
        for(String nome : nomeOrdenado){
            if (!nome.equals(nome.toLowerCase())){


                System.out.println(" nome: "+ nome);

            }
        }
    }

    private static void quiz() {
        Scanner scan = new Scanner(System.in);
        String respostaCerta = "pedro álvares cabral";
        System.out.println("Quem descobriu o Brasil?");
        String respostaUsuário = scan.nextLine();

        respostaUsuário = respostaUsuário.trim();
        respostaUsuário = respostaUsuário.toLowerCase();

        if (respostaUsuário.equals(respostaCerta)){
            System.out.println("Acertou!");
        }else {
            System.out.println("Errou");
        }

    }
    private static void separarNome() {
        String nome = "Ricardo Molinari dos Prazeres";
        String[] nomeSeparado = nome.split(" ");
        System.out.println(nomeSeparado[nomeSeparado.length-1]);
    }

    private static void formataDataSplit() {
        String dataAmericana = "2024/09/05";
        String[] datas = dataAmericana.split("/");
        System.out.println(datas[2]+"/"+datas[1]+"/"+datas[0]);
    }

    private static void formataDataSubString() {
        String dataAmericana = "2024/10/04";
        String dia = dataAmericana.substring(8);
        String ano = dataAmericana.substring(0,4);
        String mes = dataAmericana.substring(5,7);
        System.out.println(dia+"/"+mes+"/"+ano);
    }

    private static void escrita() throws IOException {
        bw.write("Linha 1");
        bw.newLine();
        bw.write("Linha 2");
        bw.flush(); //commit
    }

    private static void leitura() throws IOException {
        String linha = br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }

}