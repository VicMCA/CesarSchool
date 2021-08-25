def main():
    '''
    Leia um vetor contendo letras de uma frase inclusive os espaços em branco.
    Retirar os espaços em branco do vetor e depois escrever o vetor resultante.
    '''
    frase = input('Por favor, informe uma frase qualquer, que removerei seus espaços: ')
    fraseJuntaVetor = []
        
    fraseVetor = [x for x in frase]
    print(f'Frase informada em forma de vetor = {fraseVetor}')
    
    for x in fraseVetor:
        if x != ' ': fraseJuntaVetor.append(x)

    fraseJunta = ''.join(x for x in fraseJuntaVetor)
    
    print(f'Frase sem espaços = {fraseJunta}')
    print(f'Vetor da frase sem espaços = {fraseJuntaVetor}')
    

if __name__ == '__main__':
    main()