def main():
    '''    
    Faça um programa que calcule o mostre a média aritmética de N notas.
    '''
    quantNotas = int(input('Quantas notas deseja informar ao sistema? >> '))
    somaNotas = 0
    
    for x in range(0, quantNotas):
        nota = float(input('Diga a nota do aluno: '))
        somaNotas += nota
    
    media = somaNotas / quantNotas
    
    print(f'A média aritmética das notas informadas é de {media}')


if __name__ == '__main__':
    main()