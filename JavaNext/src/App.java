public class App {
    public static void main(String[] args) throws Exception {
        /*
        No momento estou usando este arquivo para realizar anotações
        das aulas e testes rápidos. No futuro provavelmente será limpo
        e utilizado para algum exercício ou projeto do curso.
        */

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

        /* Escopo de blocos é importante, representado por chaves.
        A identação não é obrigatória, mas ajuda com legibilidade
        e é fortemente recomendada. */
        
        {
            int aa = 01;
            {
                int ab = 02;
                System.out.println(aa + ab);
            }
            int ac = 03;
            System.out.println(aa + ac);
        }

        /* No exemplo acima, int aa e ac estão fora do escopo de ab.
        É possível acessar aa dentro do escopo de ab, mas não é possível
        acessar ab fora do escopo dele */

        int x = 1;
        if (x > 2) {
            System.out.println("1 é maior que 2");
        } else if (x == 2) {
            System.out.println("1 é igual a 2");
        } else {
            System.out.println("A matemática é real");
        }
        /* Estrutura básica de if/else/else-if acima. Trabalha com
        valores verdadeiros e falsos */

        while (x < 10) {
            x++;
        }
        /* Estrutura básica de loop while. Do/While também existe
        Use while (true) para um loop infinito, e use break  para
        sair do código */

        x = 0;
        do {
            x++;
        } while (x < 10);
        /* No Do/While o teste é feito no final*/

        for (int count = 0; count < 10; count++) {
            System.out.println("contagem: " + count);
        }
        /* Exemplo de loop for */

        x = 2;
        switch (x) {
            case 1:
                System.out.println("x = 1");
                break;
            case 2:
                System.out.println("x = 2");
                break;
            case 3:
                System.out.println("x = 3");
                break;
            default:
                System.out.println("x = indefinido");
                break;
        }
        // Exemplo de switch/case, outro exemplo abaixo

        final int CREDITO = 1; // Usamos "final" pra declarar constantes
        final int DEBITO = 2;
        int formaPagamento = 1;

        switch (formaPagamento) {
            case CREDITO:
                System.out.println("Pagamento em crédito");
                break;
            case DEBITO:
                System.out.println("Pagamento em débito");
                break;
            default:
                System.out.println("Pagamento não realizado");
                break;
        }

        boolean ofAge = false;
        int age = 18;
        ofAge = age >= 18 ? true : false;

        String result = ofAge == true ? "maior de idade" : "menor de idade";
        System.out.println("A pessoa é " + result);
        // Exemplo de operador ternário acima

        // int arrayUm[];
        // int[] arrayDois;
        // int[] arrayTres = new int[10];
        // int arrayQuatro[] = {1, 2, 3, 4, 5};
        // boolean arrayCinco[] = {true, false};
        String arraySeis[] = {"segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        // String arraySete[][] = {{"Um", "Dois"}, {"Três", "Quatro"}};
        int arrayOito[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        // Exemplos de arrays acima

        System.out.println(arrayOito[0]);
        System.out.println(arrayOito[1][1]);
        System.out.println(arrayOito[2][0]);
        // Exemplos de prints de array. O primeiro não funciona. Para isso use for como abaixo

        for (int xx = 0; xx < arraySeis.length; xx++) {
            System.out.println(arraySeis[xx]);
        }
        // Loop de for para varrer o array
    }
}