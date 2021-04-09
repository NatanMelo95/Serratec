const ler = require("prompt-sync")()
const LIMITE = 5
var nome = []
for(i=0;i<5;i++){
    do{
        var alo = ler("Qual a Radio mais da premios?")
        var senha = alo == "93Show"
    }while(!senha)
    nome[i] = ler("Qual o seu nome?")
    console.log("Você é o ouvinte: ", i+1)
}
console.log(`Os ganhadores são os clientes ${nome}, todos são ganhadores dos bonés e camisetas`)