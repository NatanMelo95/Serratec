const ler = require("prompt-sync")()
const LIMITE = 3
var nome = []
for(i=0;i<LIMITE; ){
    var tenta = 0
    do{
        var alo = ler("Qual a Radio mais da premios?")
        var senha = alo == "93Show"
        tenta ++
    }while(!senha && tenta<2)
    if(senha){
        nome[i] = ler("Qual o seu nome?")
        console.log("Você é o ouvinte: ", i+1)
        i++
    }else{
        console.log('infelizmente você não ganhou')
    }
}
console.log(`Os ganhadores são os clientes ${nome}`)