def fileToData(file, array):
    """
    Transforma cada linha do arquivo em um item de uma lista, retirando o \n
    """
    file.readline()
    
    for x in file:
        array.append(x.rstrip())
    # del(array[0])
    return array


def dataSort(firstArray, secondArray, originArray):
    """
    Separa as datas dos valores de lucro/perda
    """
    for x in originArray:
        data, valor = x.split(',')
        firstArray.append(data)
        secondArray.append(int(valor))
    return firstArray, secondArray


def variMinMax(valores):
    """
    Atribui a variancia de cada mês à itens de uma lista
    """
    variance = []
    for x in range(1, len(valores)):
        variance.append(valores[x] - valores[x - 1])
    return variance


def formato(datas):
    """
    Modifica o texto das datas para formato mais adequado ao relatório
    """
    mesLong = ['Janeiro de ', 'Fevereiro de ', 'Março de ', 'Abril de ', 'Maio de ', 'Junho de ',
    'Julho de ', 'Agosto de ', 'Setembro de ', 'Outubro de ', 'Novembro de ', 'Dezembro de ']
    mesShort = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    mes = ano = ''
    datasLong = []

    for x in datas:
        mes, ano = x.split('-')
        for y in range(0, len(mesShort)):
            if mes == mesShort[y]:
                mes = mesLong[y]
        dataCompleta = mes + ano
        datasLong.append(dataCompleta)
        pass

    return datasLong


def report(datas, valores, variancia):
    """
    Gera texto do relatório
    """
    totalMeses = (len(datas))
    valorLiquido = sum(int(x) for x in valores)
    varianciaMedia = (sum(variancia)/(totalMeses-1))
    posMaiorLucro = variancia.index(max(variancia))
    posMaiorPerda = variancia.index(min(variancia))

    textoRelatorio = ('Análise Financeira\n'
    +'-----------------------------------------------------------\n'
    +f'Total de meses:\t\t\t{totalMeses} meses\n'
    +f'Total arrecadado:\t\t$ {valorLiquido}\n'
    +f'Variação da média:\t\t$ {round(varianciaMedia, 2)}\n'
    +f'Maior aumento nos lucros:\t{datas[posMaiorLucro+1]} ($ {max(variancia)})\n'
    +f'Maior redução nos lucros:\t{datas[posMaiorPerda+1]} ($ {min(variancia)})\n')

    return textoRelatorio


def main():
    """
    Função principal que chamará as outras
    """
    matriz = []
    datas = []
    valores = []

    with open('CesarSchool/CESARNextDesafioPython/PyFinanceiro/Recursos/dados_financeiro.txt', 'r') as dados:
        matriz = fileToData(dados, matriz)
    
    datas, valores = (dataSort(datas, valores, matriz))
    variancia = variMinMax(valores)
    datas = formato(datas)
    textoRelatorio = report(datas, valores, variancia)

    with open('relatório.txt', 'w') as relatorio:
        relatorio.write(textoRelatorio)

    print(textoRelatorio)


if __name__ == '__main__':
    main()