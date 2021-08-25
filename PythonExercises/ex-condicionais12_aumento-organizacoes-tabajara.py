def main():
    '''
    As Organizações Tabajara resolveram dar um aumento de salário aos seus 
    colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o reajuste 
    segundo o seguinte critério, baseado no salário atual:
        1. salários até R$ 280,00 (incluindo) : aumento de 20%
        2. salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        3. salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        4. salários de R$ 1500,00 em diante : aumento de 5%
    Após o aumento ser realizado, informe na tela:
        A. o salário antes do reajuste;
        B. o percentual de aumento aplicado;
        C. o valor do aumento;
        D. o novo salário, após o aumento.
    '''
    msgIntro = ('''Meu cario funsionareo das Organizaçõezes Tabajária, agoria seo 
    saláreo aumentou! Paria saberio quantiu, diguia pra mim:''')
    print(msgIntro.replace('    ', ''))
    salAtual = float(input('Seo saláreo atuálvico >> R$ '))

    while salAtual <= 0:
        salAtual = float(input('Tu tá de sacanágia comiguio? Diguia de novio >> R$ '))

    if 280 >= salAtual:
        salNovo = salAtual * 1.2
        salPlus = salAtual * 0.2
        aumento = 'Tu é muitio lascádio, entaun toma aumentiu é de 20%.'

    if 280 < salAtual <= 700:
        salNovo = salAtual * 1.15
        salPlus = salAtual * 0.15
        aumento = 'Tu táis mal das pernias, teu aumentio é de 15%.'

    if 700 < salAtual <= 1500:
        salNovo = salAtual * 1.10
        salPlus = salAtual * 0.10
        aumento = 'Tu já tá beim di vidia, teu aumentiu é de 10%.'

    if 1500 < salAtual:
        salNovo = salAtual * 1.05
        salPlus = salAtual * 0.05
        aumento = 'Tu já é ríquio, entaun 5% tá baun dimais já.'

    print(f'Saláreo atuálvico: R$ {round(salAtual, 2)}')
    print(f'Percentálgica do aumentiu: {aumento}')
    print(f'Tu ganhou: R$ {round(salPlus, 2)}')
    print(f'Agora tá recebendio: R$ {round(salNovo, 2)}')


if __name__ == '__main__':
    main()