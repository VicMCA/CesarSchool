def main():
    """
    Função principal
    """
    ballot = []
    candidates = {
        "Khan": 0,
        "Correy": 0,
        "Li": 0,
        "OTooley": 0
        }

    with open('CesarSchool/CESARNextDesafioPython/PyVotacao/Recursos/dados_elecao.txt', 'r') as urna:
        for x in urna:
            # ballot.append(x.rstrip())
            trash, trash2, voto = x.split(',')
            ballot.append(voto.rstrip())
        del(ballot[0])
    
    for x in ballot:
        if x == "Khan": candidates["Khan"] += 1
        if x == "Correy": candidates["Correy"] += 1
        if x == "Li": candidates["Li"] += 1
        if x == "O'Tooley": candidates["OTooley"] += 1

    OTooley = "O'Tooley"
    Vencedor = max(candidates, key=candidates.get)
    # print(candidates)

    textoResultado = ('Resultados Eleitorais\n'
    +'------------------------\n'
    +f'Total de votos: {len(ballot)}\n'
    +'------------------------\n'
    +f'Khan: {round((100/len(ballot)) * candidates["Khan"], 4)}% ({candidates["Khan"]})\n'
    +f'Correy: {round((100/len(ballot)) * candidates["Correy"], 4)}% ({candidates["Correy"]})\n'
    +f'Li: {round((100/len(ballot)) * candidates["Li"], 4)}% ({candidates["Li"]})\n'
    +f'{OTooley}: {round((100/len(ballot)) * candidates["OTooley"], 4)}% ({candidates["OTooley"]})\n'
    +'------------------------\n'
    +f'Vencedor: {Vencedor}\n'
    +'------------------------')

    with open('Resultado.txt', 'w') as resultado:
        resultado.write(textoResultado)

    print(textoResultado)


if __name__ == '__main__':
    main()