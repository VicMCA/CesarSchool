def main():
    '''
    Crie um programa que tenha uma função que receba uma lista de 
    números inteiros e exiba todos os valores multiplicados por 
    um valor inserido pelo usuário.
    '''
    listaNum =  [4, 2, 12, 98, 8096, 2, 124, -123, -481, 23]

    def multLista(lista, mult):
        listaRes = []
        for x in lista:
            listaRes.append(x * mult)
        return listaRes


    mult = int(input('Informe um valor: '))

    print(multLista(listaNum, mult))


if __name__ == '__main__':
    main()