/*
CINEMA:

1. Um cinema faz reservas de 5 ingressos para uma sala, sendo 2 para meia entrada, para a reserva, basta informar o nome e se é meia ou não, é permitido apenas uma reserva por nome.
2. Após os 5 reservados, o cliente pode retirar se ingresso informando o seu nome, o ingresso irá informar seu número, nome de quem reservou e se é meia ou não.
*/

var ler = require('prompt-sync')()
var meia = 2
var tipo
var nome1
var nome2
var nome3
var nome4
var nome5
var t1 = ""
var t2 = ""
var t3 = ""
var t4 = ""
var t5 = ""

for (i=0;i<5;){
    if(t1==""){
        i++
        nome1 = ler("Qual o seu nome")
        t1 = "1, " + nome1
        tipo = ler("O ingresso é meia? (S/N)")
        if (tipo=="S"){
            if(meia>0){
                meia--
                t1 = t1 + ", Meia"
                console.log('Ingresso meia registrado')
            }else{
                console.log('Reserva de meia esgotado, seu ingresso será regitrado como inteiro')
                t1 = t1 + ", Inteira"
            }
        }else{
            t1 = t1 + ", Inteira"
            console.log('Ingresso Inteiro registrado')
        }
    }else if(t2==""){
        i++
        nome2 = ler("Qual o seu nome")
        t2 = "2, " + nome2
        tipo = ler("O ingresso é meia? (S/N)")
        if (tipo=="S"){
            if(meia>0){
                meia--
                t2 = t2 + ", Meia"
                console.log('Ingresso meia registrado')
            }else{
                console.log('Reserva de meia esgotado, seu ingresso será regitrado como inteiro')
                t2 = t2 + ", Inteira"
            }
        }else{
            t2 = t2 + ", Inteira"
            console.log('Ingresso Inteiro registrado')
        }
    }else if(t3==""){
        i++
        nome3 = ler("Qual o seu nome")
        t3 = "3, " + nome3
        tipo = ler("O ingresso é meia? (S/N)") 
        if (tipo=="S"){
            if(meia>0){
                meia--
                t3 = t3 + ", Meia"
                console.log('Ingresso meia registrado')
            }else{
                console.log('Reserva de meia esgotado, seu ingresso será regitrado como inteiro')
                t3 = t3 + ", Inteira"
            }
        }else{
            t3 = t3 + ", Inteira"
            console.log('Ingresso Inteiro registrado')
        }
    }else if(t4==""){
        i++
        nome4 = ler("Qual o seu nome")
        t4 = "4, " + nome4
        tipo = ler("O ingresso é meia? (S/N)")
        if (tipo=="S"){
            if(meia>0){
                meia--
                t4 = t4 + ", Meia"
                console.log('Ingresso meia registrado')
            }else{
                console.log('Reserva de meia esgotado, seu ingresso será regitrado como inteiro')
                t4 = t4 + ", Inteira"
            }
        }else{
            t4 = t4 + ", Inteira"
            console.log('Ingresso Inteiro registrado')
        }
    }else{
        i++
        nome5 = ler("Qual o seu nome")
        t5 = "5, " + nome5
        tipo = ler("O ingresso é meia? (S/N)")
        if (tipo=="S"){
            if(meia>0){
                meia--
                t5 = t5 + ", Meia"
                console.log('Ingresso meia registrado')
            }else{
                console.log('Reserva de meia esgotado, seu ingresso será regitrado como inteiro')
                t5 = t5 + ", Inteira"
            }
        }else{
            t5 = t5 + ", Inteira"
            console.log('Ingresso Inteiro registrado')
        }
    }
}
for(i=0;i<5;i++){
    var retira = ler("Qual o seu nome para retirar o ingresso? ")
    switch(retira){
        case nome1 :
            console.log(t1)
        break;
        case nome2 :
            console.log(t2)
        break;
        case nome3 :
            console.log(t3)
        break;
        case nome4 :
            console.log(t4)
        break;
        case nome5 :
            console.log(t5)
        break;
    }
}