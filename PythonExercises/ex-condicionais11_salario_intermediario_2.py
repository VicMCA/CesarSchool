def main():
    '''
    Faça um programa para o cálculo de uma folha de pagamento, sabendo que os 
    descontos são do Imposto de Renda, que depende do salário bruto (conforme
    tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
    Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
    Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá
    pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

    Desconto do IR:
        1. Salário Bruto até 900 (inclusive) - isento
        2. Salário Bruto até 1500 (inclusive) - desconto de 5%
        3. Salário Bruto até 2500 (inclusive) - desconto de 10%
        4. Salário Bruto acima de 2500 - desconto de 20%
    
    Imprima na tela as informações, dispostas conforme o exemplo abaixo.
    No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        A. Salário Bruto: (5 * 220)        : R$ 1100,00
        B. (-) IR (5%)                     : R$   55,00  
        C. (-) INSS ( 10%)                 : R$  110,00
        D. FGTS (11%)                      : R$  121,00
        E. Total de descontos              : R$  165,00
        F. Salário Liquido                 : R$  935,00

    '''
    print('Bem vindo(a).  Para o cálculo de sua folha de pagamento para este mês, por favor informe:')
    trabHoras = int(input('Quantidade de horas trabalhadas >> '))
    trabCusto = int(input('Valor da sua hora de trabalho >> R$ '))

    salBruto = trabHoras * trabCusto
    descINSS = salBruto * 0.10
    descSind = salBruto * 0.03
    bonusFGTS = salBruto * 0.11
    
    if salBruto <= 900: descIR = 0
    if salBruto <= 900: percIR = 'ISENTO'
    if 900 < salBruto <= 1500: descIR = salBruto * 0.05
    if 900 < salBruto <= 1500: percIR = ' 5% = '
    if 1500 < salBruto <= 2500: descIR = salBruto * 0.1
    if 1500 < salBruto <= 2500: percIR = '10% = '
    if 2500 < salBruto: descIR = salBruto * 0.2
    if 2500 < salBruto: percIR = '20% = '
    
    totalDesc = descINSS + descIR
    salLiqui = salBruto - totalDesc

    resultado = (f'''Salário Bruto = R$ {salBruto}
    Desconto do IR: {percIR}{descIR}
    Desconto do INSS: 10% = {descINSS}
    Taxa do Sindicato: 3% = {descSind}
    Bônus do FGTS: 11% = {bonusFGTS}
    Total de descontos = R$ {totalDesc}
    Salário Líquido = R$ {salLiqui}''')

    print(resultado.replace('    ', ''))


if __name__ == '__main__':
    main()