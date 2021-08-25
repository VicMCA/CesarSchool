def main():
    '''    
    Faça um programa com uma função chamada somaImposto. A função 
    possui dois parâmetros formais: taxaImposto, que é a quantia de 
    imposto sobre vendas expressa em porcentagem e custo, que é o 
    custo de um item antes do imposto. A função “altera” o valor 
    de custo para incluir o imposto sobre vendas.
    '''
    preco = float(input('Informe o preço do produto: '))
    imposto = float(input('Informe a taxa de imposto sobre as vendas (omita o %): '))

    print(f'O preço final do produto será de {somaImposto(imposto, preco)}')


def somaImposto(taxaImposto, custo):
    return round(custo * (1 + (taxaImposto * 0.01)), 2)


if __name__ == '__main__':
    main()