def main():
    '''    
    Faça uma função que receba um valor inteiro e
    positivo e calcule o seu fatorial.
    '''
    num = int(input('Por favor, informe um número inteiro e positivo: '))

    while num < 1: num = int(input('Número inválido. Informe novamente por favor: '))

    fatorial(num)


def fatorial(valor):
    fatorLista = []
    for x in range (1, valor): fatorLista.append(x)
    
    res = 1
    for x in fatorLista: res = res + (res * x)

    print(f'O fatorial de {valor} é {res}')


if __name__ == '__main__':
    main()