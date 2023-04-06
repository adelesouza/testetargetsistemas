var fatSP = 67836.43
var fatRJ = 36678.66
var fatMG = 29229.88
var fatES = 27165.48
var fatOutros = 19849.53

const total = fatSP + fatRJ + fatMG + fatES + fatOutros

const perSP = calculo(fatSP, 'SP')
const perRJ = calculo(fatRJ, 'RJ')
const perMG = calculo(fatMG, 'MG')
const perES = calculo(fatES, 'ES')
const perOutros = calculo(fatOutros, 'Outros')

function calculo(fat, nome) {
  const per = (fat * 100) / total
  console.log('Percentual ' + nome + ' = ' + per.toFixed(2) + '%')

  return
}
