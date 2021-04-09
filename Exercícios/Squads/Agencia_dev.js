/*
1- mostre 3 destinos para o cliente
2- deixe o cliente escolher um dos lugares
3- apresente o (ou os) pacotes para a escolha do cliente
4- depois que ele escolher // boa viagem (se quiser incremente mais como dito acima)
*/

var ler = require('prompt-sync')()
const desc1_1 = "Hotel La Lanterne (3 dias e 3 noites) Visita programada em Torre Eiffel e Louvre"
const desc1_2 = "Hotel La Lanterne (5 dias e 6 noites) Visita programada em Torre Eiffel, Louvre e Ópera Garnier"
const desc2_1 = "Hotel Berlin Marriott Hotel (3 dias e 3 noites), Visita programada em Portão de Brandemburgo e Filarmonica de Berlim"
const desc2_2 = "Hotel Berlin Marriott Hotel (5 dias e 6 noites), Visita programada em Portão de Brandemburgo, Filarmonica de Berlim e Prédio do Reichstag"
const desc3_1 = "Hotel Amba Hotel Groscenor (3 dias e 3 noites), Visita programada em Museu Britânico e National Gallery"
const desc3_2 = "Hotel Amba Hotel Groscenor (5 dias e 6 noites), Visita programada em Museu Britânico, National Gallery e Museu Imperial da Guerra"
var pac

console.log("Você gostaria de ir para qual destino?")
console.log("Paris - 1")
console.log("Berlim - 2")
console.log("Londres - 3")
var dest=ler("")
switch(dest){
    case '1' :
        console.log(`Para o destino escolhido temos as opções`)
        console.log(`1 - ${desc1_1} Custo USD $1.871,24`)
        console.log(`2 - ${desc1_2} USD $2.813,10`)
        pac = ler('')
        if(pac==1){
            console.log(`O pacóte escolhido foi ${desc1_1}, Boa Viagem!`)
        }else{
            console.log(`O pacóte escolhido foi ${desc1_2}, Boa Viagem!`)
        }
    break;
    case '2':
        console.log(`Para o destino escolhido temos as opções`)
        console.log(`1 - ${desc2_1} Custo USD $1.784,75`)
        console.log(`2 - ${desc2_2} USD $2.536,85`)
        pac = ler('')
        if(pac==1){
            console.log(`O pacóte escolhido foi ${desc2_1}, Boa Viagem!`)
        }else{
            console.log(`O pacóte escolhido foi ${desc2_2}, Boa Viagem!`)
        }
    break;
    case '3' :
        console.log(`Para o destino escolhido temos as opções`)
        console.log(`1 - ${desc3_1} Custo USD $1.340,64`)
        console.log(`2 - ${desc3_2} USD $2.061,69`)
        pac = ler('')
        if(pac==1){
            console.log(`O pacóte escolhido foi ${desc3_1}, Boa Viagem!`)
        }else{
            console.log(`O pacóte escolhido foi ${desc3_2}, Boa Viagem!`)
        }
    break;
}