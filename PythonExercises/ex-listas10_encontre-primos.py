def main():
    '''    
    Encontrar números primos é uma tarefa difícil. Faça um programa
    que gera uma lista dos números primos existentes entre 1 e
    um número inteiro informado pelo usuário.
    '''
    num = int(input('Informe um número inteiro para verificarmos os números primos entre um e ele: '))
    listaPrimos = []

    for x in range(2, num + 1):
        divCount = 0
        for y in range(1, x+1):
            if x % y == 0:
                divCount = divCount + 1
        if divCount < 3:
            listaPrimos.append(x)

    print(listaPrimos)


if __name__ == '__main__':
    main()