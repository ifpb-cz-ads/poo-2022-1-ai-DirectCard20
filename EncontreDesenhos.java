import java.util.Scanner;
public class EncontreDesenhos{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        String nomeDesenho1 = "Cyberchase: A Corrida do Espaço";
        int dataInicio1 = 2002;
        int quantidadeTemporadas1 = 13;
        String genero1[] = {"educação", "mistério", "ficção científica"};
        String resenha1 = "O desenho mostra com uma leve dose de humor vários cybermistérios com personagens bastante atraentes. Quando o\nvilão Hacker inventa uma missão para conquistar o universo virtual, a Placa Mãe chama três crianças da Terra\npara ajudar. Elas são Jackie, Mateus e Inês, os heróis de culturas diferentes de Cyberchase, que contam com a ajuda\ndo inteligente cyberpássaro Dígito e mergulham no universo do Cyberespaço para acabar com os planos de Hacker.";

        String nomeDesenho2 = "Shaun, o Carneiro";
        int dataInicio2 = 2007;
        int quantidadeTemporadas2 = 5;
        String genero2[] = {"comédia", "aventura", "claymation"};
        String resenha2 = "Shaun é um carneiro extremamente inteligente e bastante criativo que vive em uma pequena fazenda. Ele é o\nlíder do rebanho e conta com a ajuda de Bitzer, o cão pastor, para resolver os problemas que surgem, eles sempre\nse envolvem em muitas confusões junto com seus amigos buscando não serem descobertos pelo fazendeiro.";
        
        String nomeDesenho3 = "Os Sete Monstrinhos";
        int dataInicio3 = 2000;
        int quantidadeTemporadas3 = 2;
        String genero3[] = {"comédia", "aventura", "fantasia"};
        String resenha3 = "Acompanhe o cotidiano de uma divertida família cujos sete irmãos estão sob os cuidados da mãe o tempo todo.\nCada um deles tem diferentes feições monstruosas e divertidas personalidades. Eles enfrentam os desafios da infância\ne se divertem ajudando uns aos outros.";
        
        String nomeDesenho4 = "Arthur";
        int dataInicio4 = 1996;
        int quantidadeTemporadas4 = 25;
        String genero4[] = {"Comédia"};
        String resenha4 = "O desenho mostra as aventuras e desventuras de um porquinho-da-terra de oito anos, cujo maior charme é ser\napenas uma criança normal. Acompanhado da irmã e dos amigos, ele consegue resolver os problemas que aparecem, sempre\ncom imaginação, bondade e muito humor.";

        System.out.println("Deseja pesquisar o desenho por qual dos seguintes atributos?\n 1 para NOME\n 2 para ANO\n 3 para GÊNERO");
        int procurarDesenho = ler.nextInt();
        if(procurarDesenho==1){
            System.out.println("Informe o nome do desenho para procura");
        }
        else if(procurarDesenho==2){
            System.out.println("Informe o ano do desenho para procura");
            System.out.println("Os anos disponíveis são:\n " + dataInicio1 + " " + dataInicio2 + " " + dataInicio3 + " " + dataInicio4);
            int procurarDesenhoAno = ler.nextInt();
            switch(procurarDesenhoAno){
                case 2002:  System.out.println("\nO nome do desenho é: " + nomeDesenho1);
                            System.out.println("O ano de produção é: " + dataInicio1);
                            System.out.println("A quantidade de temporadas é: " + quantidadeTemporadas1);
                            System.out.println("Resenha: " + resenha1 + "\n");    
                break;
                case 2007:  System.out.println("\nO nome do desenho é: " + nomeDesenho2);
                            System.out.println("O ano de produção é: " + dataInicio2);
                            System.out.println("A quantidade de temporadas é: " + quantidadeTemporadas2);
                            System.out.println("Resenha: " + resenha2 + "\n");
                break;
                case 2000:  System.out.println("\nO nome do desenho é: " + nomeDesenho3);
                            System.out.println("O ano de produção é: " + dataInicio3);
                            System.out.println("A quantidade de temporadas é: " + quantidadeTemporadas3);
                            System.out.println("Resenha: " + resenha3 + "\n");
                break;
                case 1996:  System.out.println("\nO nome do desenho é: " + nomeDesenho4);
                            System.out.println("O ano de produção é: " + dataInicio4);
                            System.out.println("A quantidade de temporadas é: " + quantidadeTemporadas4);
                            System.out.println("Resenha: " + resenha4 + "\n");
            }
        }
        else if(procurarDesenho==3){
            System.out.println("Informe o gênero do desenho para procura");
            System.out.println("Os gêneros disponíveis são:\n " + "mistério" + " " + "aventura" + " " + "comédia" + " " + "fantasia");
        };
    }
}