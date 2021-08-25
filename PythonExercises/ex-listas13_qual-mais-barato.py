def main():
    '''
    Faça um programa que pergunte o preço de três produtos e informe qual
    produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
    '''
    print('Informe o preço de três produtos para que eu lhe diga qual comprar.')
    prodA = float(input('Informe o preço do primeiro produto: R$ '))
    prodB = float(input('Informe o preço do segundo produto: R$ '))
    prodC = float(input('Informe o preço do terceiro produto: R$ '))

    produtos = [prodA, prodB, prodC]
    prodNome = ['primeiro produto', 'segundo produto', 'terceiro produto']

    barato = produtos[0]
    indice = 0

    for x in produtos:
        if x < barato:
            barato = x
            indice += 1

    print(f'O produto mais barato é o {prodNome[indice]}.')


if __name__ == '__main__':
    main()