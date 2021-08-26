def file_to_data(file, array):
    """
    Transforma cada linha do arquivo em um item de uma lista, retirando o \n
    """
    file.readline()
    
    for x in file:
        array.append(x.rstrip())
    # del(array[0])
    return array


def data_sort(firstArray, secondArray, originArray):
    """
    Separa as datas dos valores de lucro/perda
    """
    for x in originArray:
        data, valor = x.split(',')
        firstArray.append(data)
        secondArray.append(int(valor))
    return firstArray, secondArray


def variance_min_max(valores):
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
    mes_longo = ['Janeiro de ', 'Fevereiro de ', 'Março de ', 'Abril de ', 'Maio de ', 'Junho de ',
    'Julho de ', 'Agosto de ', 'Setembro de ', 'Outubro de ', 'Novembro de ', 'Dezembro de ']
    mes_curto = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    mes = ano = ''
    datas_longo = []

    for x in datas:
        mes, ano = x.split('-')
        for y in range(0, len(mes_curto)):
            if mes == mes_curto[y]:
                mes = mes_longo[y]
        data_completa = mes + ano
        datas_longo.append(data_completa)
        pass

    return datas_longo


def report(datas, valores, variancia):
    """
    Gera texto do relatório
    """
    total_meses = (len(datas))
    valor_liquido = sum(int(x) for x in valores)
    variancia_media = (sum(variancia)/(total_meses-1))
    indice_maior_lucro = variancia.index(max(variancia))
    indice_maior_perda = variancia.index(min(variancia))

    texto_relatorio = ('Análise Financeira\n'
    +'-----------------------------------------------------------\n'
    +f'Total de meses:\t\t\t{total_meses} meses\n'
    +f'Total arrecadado:\t\t$ {valor_liquido}\n'
    +f'Variação da média:\t\t$ {round(variancia_media, 2)}\n'
    +f'Maior aumento nos lucros:\t{datas[indice_maior_lucro+1]} ($ {max(variancia)})\n'
    +f'Maior redução nos lucros:\t{datas[indice_maior_perda+1]} ($ {min(variancia)})\n')

    return texto_relatorio


def main():
    """
    Função principal que chamará as outras
    """
    matriz = []
    datas = []
    valores = []

    with open('CesarSchool/CESARNextDesafioPython/PyFinanceiro/Recursos/dados_financeiro.txt', 'r') as dados:
        matriz = file_to_data(dados, matriz)
    
    datas, valores = (data_sort(datas, valores, matriz))
    variancia = variance_min_max(valores)
    datas = formato(datas)
    texto_relatorio = report(datas, valores, variancia)

    with open('relatório.txt', 'w') as relatorio:
        relatorio.write(texto_relatorio)

    print(texto_relatorio)


if __name__ == '__main__':
    main()