def main():
    '''    
    Crie uma lista com os preços dos jogos que você mais gosta.
    a) Imprima o preço mais caro;
    b) Imprima o preço mais barato.
    '''
    listaPreco = [0.99, 4.99, 19.90, 25.00, 99.90]
    print(f'O jogo mais caro custa: {max(listaPreco)}')
    print(f'O jogo mais barato custa: {min(listaPreco)}')
    

if __name__ == '__main__':
    main()