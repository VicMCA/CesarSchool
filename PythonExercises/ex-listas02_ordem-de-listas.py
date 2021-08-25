def main():
    '''    
    Crie uma lista de locais que você gostaria de conhecer no mundo,
    na ordem do local que você dá mais prioridade pra o local que você dá
    menos prioridade. Exiba a lista nas seguintes configurações:
    a) ordem original
    b) ordem alfabética
    c) ordem de prioridades inversa
    d) quantidade de itens
    '''
    locaisVisita = []
    locaisTotal = int(input('Quantos locais você deseja visitar na sua vida? >> '))
    print('Abaixo digite os locais a visitar na ordem do que mais deseja para o que menos deseja: ')
    for x in range(0, locaisTotal):
        local = input('Nome do local >> ')
        locaisVisita.append(local)
    
    locaisAlfab = sorted(locaisVisita)
    locaisRever = locaisVisita[:]
    locaisRever.reverse()
    
    print(f'Os locais que você deseja visitar: {locaisVisita}')
    print(f'Os locais que você deseja visitar em ordem alfabética: {locaisAlfab}')
    print(f'Os locais que você deseja visitar em ordem invertida: {locaisRever}')
    print(f'Quantidade de locais que deseja visitar: {len(locaisVisita)}')


if __name__ == '__main__':
    main()