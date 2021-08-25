def main():
    '''
    Crie um programa que receba do usuário 5 números inteiros e os 
    exiba na tela na ordem contrária a que foi inserido. A leitura 
    dos números deve ser feita em uma função e a exibição dos 
    valores em ordem contrária deve ocorrer em outra função.
    '''
    numList = []
    numList = leitura(numList)
    inverte(numList)


def leitura(lista):
    for x in range(0, 5):
        lista.append(int(input('Informe um número inteiro, por favor: ')))
    return lista


def inverte(lista):
    inverso = []
    for x in lista:
        inverso.insert(0, x)
    print(inverso)


if __name__ == '__main__':
    main()