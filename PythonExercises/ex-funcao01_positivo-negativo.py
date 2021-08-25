def main():
    '''
    Crie um programa que receba um valor inteiro e avalie se ele é 
    positivo ou negativo. Essa avaliação deve ocorrer dentro de uma 
    função que retorna um valor booleano.
    '''
    def posneg(x):
        if x >= 0:
            return True
        else:
            return False
    
    num = int(input('Informe um número por favor > '))
    
    if posneg(num) == True:
        print('É um número positivo.')
    else:
        print('É um número negativo')


if __name__ == '__main__':
    main()