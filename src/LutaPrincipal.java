import java.text.Format;
import java.util.Scanner;

public class LutaPrincipal {

    public static void main(String[] args) throws Exception {

        

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        
        personagem1.nome = "alfredo";
        personagem1.energia = 50;

        personagem2.nome = "adonis";    
        personagem2.energia = 50;

        System.out.format("voce é %s\n", personagem1.nome);
        System.out.format("%s está atravessando a rua quando sem quere esbarrar em %s,"
        +"os dois discutem e %s desafia %s para uma luta\n", personagem1.nome, personagem2.nome,
                                                             personagem2.nome, personagem1.nome);
        System.out.println("Voce aceita a luta: sim ou não?");
        Scanner leitor1 = new Scanner(System.in);
        String decisao1 = leitor1.nextLine();

        if(decisao1.equalsIgnoreCase("sim"))
        {
            System.out.println("ambos vao ao clube de boxe e se prepara para a luta");
            System.out.format("%s tem %d de energia\n%s tem %d de energia\n",
             personagem1.nome, personagem1.energia, personagem2.nome, personagem2.energia);
            System.out.println("comeca a luta, voce ataca ou defende?");
            Scanner leitor2 = new Scanner(System.in);
            String decisao2 = leitor2.nextLine();
            
            if(decisao2.equalsIgnoreCase("ataca"))
            {
                System.out.format("%s golpeia e causa 30 de dano, %s contragolpeia causando 15 de dano\n", personagem1.nome, personagem2.nome);
                personagem2.energia = personagem2.energia - 30;
                personagem1.energia = personagem1.energia - 15;
                System.out.format("%s tem %d de energia\n%s tem %d de energia\n",
                personagem1.nome, personagem1.energia, personagem2.nome, personagem2.energia);
                System.out.println("agora voce ataca ou defende?");
                Scanner leitor3 = new Scanner(System.in);
                String decisao3 = leitor3.nextLine();
                if(decisao3.equalsIgnoreCase("ataca"))
                {
                System.out.format("%s ataca novamente causando 20 de dano e levando seu oponente a lona\n",
                personagem1.nome);
                personagem2.energia = personagem2.energia - 20;
                }
                else if(decisao3.equalsIgnoreCase("defende"))
                {
                    System.out.format("%s defende mas nao é o suficiente para contar o intenso gol de %s que causa 40 de dano\n",
                    personagem1.nome, personagem2.nome);
                    personagem1.energia = personagem1.energia - 40;
                }
                else
                {
                    System.out.println("resposta nao compativel, retornando ao comeco do livro");
                    main(args);
                }

            }
            else if(decisao2.equalsIgnoreCase("defende"))
            {
                System.out.format("%s se defende mas ainda assim sofre 30 de dano, mas aumenta sua furia contra %s\n", personagem1.nome, personagem2.nome);
                personagem1.energia = personagem1.energia - 30;
            
                System.out.format("%s tem %d de energia\n%s tem %d de energia\n",
                personagem1.nome, personagem1.energia, personagem2.nome, personagem2.energia);
                System.out.println("agora voce ataca ou defende");
                Scanner leitor3 = new Scanner(System.in);
                String decisao3 = leitor3.nextLine();
                if(decisao3.equalsIgnoreCase("ataca"))
                {
                    System.out.format("%s ataca com toda sua furia causando 50 de dano", personagem1.nome);
                    personagem2.energia = personagem2.energia - 50;
                }
                else if(decisao3.equalsIgnoreCase("defende"))
                {
                    System.out.format("%s defende mas sua defesa nao e suficiente e recebe 20 de dano\n", personagem1.nome);
                    personagem1.energia = personagem1.energia - 20;
                }
                else{
                    System.out.println("resposta nao compativel, retornando ao comeco do livro");
                    main(args);
                }
            }
            else{
                System.out.println("resposta nao compativel, retornando ao comeco do livro");
                main(args);
            }

        }
        else if(decisao1.equalsIgnoreCase("nao"))
        {
            System.out.format("%s o chama de covarde e lhe dar um soco, causando a queda de %s\n", personagem2.nome, personagem1.nome);
            personagem1.energia = personagem1.energia - 50;
        }
        else{
            System.out.println("resposta nao compativel, retornando ao comeco do livro");
            main(args);
        }
      if(personagem1.energia <= 0)
      {
        System.out.format("%s venceu\n", personagem2.nome);
      }  
      if(personagem2.energia <= 0)
      {
        System.out.format("%s venceu\n", personagem1.nome);
      }
        
    }
    
}
