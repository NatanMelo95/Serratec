const ler = require("prompt-sync")()
const LIMITE = 3
var total = 0

while(total<LIMITE){
    total ++, ler("Qual o final do seu cpf?")
    console.log("Clientes na loja: ", total)
}console.log("Lotado")