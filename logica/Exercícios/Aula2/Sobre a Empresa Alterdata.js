const promp = require("prompt-sync")()
const fundacao = promp("Qual o ano de fundação da Alterdata: ")
var anos = new Date().getFullYear() - fundacao
console.log(`A Alterdata tem ${anos} anos`)