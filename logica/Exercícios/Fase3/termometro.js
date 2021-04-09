const promp = require("prompt-sync")()
var temp = promp("Informe a temperatua em Graus Calsius: ")
temp = temp * 1.8 + 32
console.log(`A temperatura equivale a ${temp} Graus Fahrenheit`)