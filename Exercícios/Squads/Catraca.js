/*
CATRACA:

A catraca do onibus quebrou e a empresa precisa dos dados da viagem.
Os dados necessários para a empresa são quando a pessoa entra no onibus são as seguintes:
Quantas pessoas ja entraram no onibus até o momento; 
Se a pessoa é pagante ou entra com gratuidade;
O total dos ganho até o momento (Considerando a passagem a R$ 4,40).
*/

var ler = require("prompt-sync")()
var gratis = 0
var pago = 0
var total = 0
const VALOR = 4.40

for (i=0;i<5;i++){
    var pass = ler("Maior de 65 anos? (Sim ou Nao)")
    if(pass=="Sim"){
        gratis++
        console.log('Gratuidade adicionada')
    }else{
        pago++
        total = total + VALOR
        console.log('Pagante adicionado')
    }
}
console.log(`Até o momento há um total de ${gratis} gratuidades e ${pago} pagantes somando um total de R$${total.toFixed(2)} pago`)