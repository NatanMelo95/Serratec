/*
Teatro_do_Monstro
O teatro do monstro permite a entrada de até 5 pessoas;
A peça só começa após atingir a lotação máxima;
Nesta peça é proibida a entrada de menores de 16 anos;
O gerente quer saber quantos são homens e quantos são mulheres antes da peça começar.
*/
var ler = require("prompt-sync")()
var vaga
var homem = 0
var mulher = 0
for (vaga=0; vaga<5; ){
    var idade = ler("Você tem mais de 16 anos? (Sim ou Não)")
    if(idade=="Sim"){
        var sexo = ler("Você é Homem ou Mulher?")
        vaga++
        switch (sexo){
            case "Homem" :
                homem++
                break;
            case "Mulher" :
                mulher++
                break;
        }
    }
}
console.log(`Nessa seção teremos ${homem} homens e ${mulher} mulheres presentes`)