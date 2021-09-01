public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,World!");
        System.out.print("Hello, World!");
        System.out.println("Hello, World... Deja vú?");
        
        int total = 100;
        
        Integer full = 100;

        System.out.println(total / 3);
        System.out.println(total * 5);
        System.out.println(total % 3);
        System.out.println(total - 30);

        System.out.println(full.toString());

        String meuNome = "Victor Cavalcanti";

        System.out.println(meuNome.toUpperCase());

        String primeiroNome = "Victor";
        String ultimoNome = "Cavalcanti";
        Integer idade = 31;

        String mensagem = "O cliente " + primeiroNome + " " + ultimoNome +
        " tem " + idade + " anos.";
        // Java só aceita aspas duplas para strings

        System.out.println(mensagem);

        int maiorIdade = 18;
        boolean maiorDeIdade = (idade > maiorIdade);

        System.out.println("É maior de idade? " + maiorDeIdade);

        String one = "A";
        String two = "A";

        System.out.println("one é o mesmo que two? " + one == two);
        System.out.println("one é o mesmo que two? " + one.equals(two));

        boolean idadePessoaUm = true;
        boolean idadePessoaDois = false;
        boolean podemEntrar = idadePessoaUm && idadePessoaDois;
        boolean podemEntrarMasSeLigue = idadePessoaUm || idadePessoaDois;

        System.out.println("Ambos são maiores de idade? " + podemEntrar);
        System.out.println("Um dos dois é maior de idade? " + podemEntrarMasSeLigue);

        /* 
        Os operadores são os mesmos que pra Python: +, -, *, /, % para operações simples
        >, <, ==, >=, <=, != para comparações
        =, +=, -=, *=, /= para atribuições
        */

        // Conversão implícita
        int a = 1234;
        long b = a;

        //Conversão explícita
        int c = (int) b;
        short d = (short) a;

        System.out.println(a + b + c + d);
    }
}