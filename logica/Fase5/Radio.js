const ler = require("prompt-sync")()
const LIMITE = 5
var total = 0
var nome = []
do{
    nome[total] = ler("Qual o seu nome?")
    total ++
    console.log("Você é o ouvinte: ", total)
}while(total<LIMITE)
console.log(`Os ganhadores são os clientes ${nome}, todos são ganhadores dos bonés e camisetas`)