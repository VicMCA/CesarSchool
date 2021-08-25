def main():
    '''
    Faça um programa que conte o numero de 1's e 0's que aparecem em um string. Exemplo:
    0011001 -> 4 "0's", 3 "1's"
    '''
    frase = input('Por favor, informe uma frase qualquer, ela será convertida em binário: ')
    print(f'Frase informada  = {frase}')
    
    fbin = ''.join(format(ord(x), '08b') for x in frase)
    print(f'Frase em binário = {fbin}')
    
    countZero = 0
    countOne = 0

    for x in fbin:
        if x == '0': countZero += 1
        if x == '1': countOne += 1

    print(f'Total de "0"s na frase= {countZero}')
    print(f'Total de "1"s na frase= {countOne}')
    

if __name__ == '__main__':
    main()