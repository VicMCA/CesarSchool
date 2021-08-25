def main():
    '''
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas
    trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
    sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS
    e 5% para o sindicato, faça um programa que nos dê:
    1. salário bruto.
    2. quanto pagou ao INSS.
    3. quanto pagou ao sindicato.
    4. o salário líquido.
    5. calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
    * Obs.: Salário Bruto - Descontos = Salário Líquido.
    '''
    print('Bem-vindo(a). Para lhe auxiliar no cálculo de seu rendimento líquido, por favor informe:')
    precoHora = float(input('O valor/hora de seu trabalho > R$ '))
    totalHora = float(input('O total de horas trabalhadas neste mês > '))
    rendBruto = precoHora * totalHora
    descIR = rendBruto * 0.11
    descINSS = rendBruto * 0.08
    descSind = rendBruto * 0.05
    rendLiq = rendBruto - descINSS - descIR - descSind

    result = (f'''Rendimento bruto: R$ {rendBruto}
    Imposto de renda: R$ {descIR}
    Taxa do INSS: R$ {descINSS}
    Taxa do sindicato: R$ {descSind}
    Rendimento líquido: R$ {rendLiq}''')

    result = result.replace('    ', '')
    print(result)


if __name__ == '__main__':
    main()