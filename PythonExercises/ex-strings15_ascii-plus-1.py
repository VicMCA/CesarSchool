def main():
    '''
    Faça um programa que leia uma palavra e some 1 no valor ASCII
    de cada caractere da palavra. Imprima a string resultante.
    '''
    word = input('Por favor, informe uma palavra qualquer: ')
    wordP1 = []

    for x in word:
        temp = chr(ord(x)+1)
        wordP1.append(temp)
    
    wordP1 = ('').join(wordP1)
    print(wordP1)
    

if __name__ == '__main__':
    main()