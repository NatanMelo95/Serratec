const ler = require('prompt-sync')();

var heroi = ler("Qual o seu nome de herói? R: ");

console.log("\nDestemido herói ", heroi, "! Sua aventura está començando e o seu inimigo nesse momento é aquele que não deve ser nomeado.");
console.log("Criança: O Progradragão?");
console.log("Progradragão: GRAAAAAAAAAAAAAAAAAAARRR! EU MESMO! O PRODRAGÃO E VIM DESTRUIR TODO OS SEUS CÓDIGOS!");
console.log("Pessoas: ALGUÉM PARA NOS SALVAR???\n");

var arma;
var resultado;
var destino;

console.log("\uD83D\uDC09")
console.log("Rápido! Escolha a sua arma:");
arma = ler("1)Sapato 2)Espada 3)Faca ");


if (arma == 2){
    resultado = "UMA ESPADA??? Infelizmente...";
    destino = "Você falhou, jovem herói programador.";
}
else if(arma == 3){
    resultado = "ESTÁ BRINCANDO? Essa é a pior arma do jogo...";
    destino = "O Progradragão te devorou e ainda acabou com os códigos."
}
else if (arma == 1){
    resultado = "UM SAPATO COM CHULÉ? VOCÊ ESTÁ MALUCO!! ESTOU SENTINDO O CHEIRO DAQUI.";
    destino = "Você venceu, herói! O cheiro foi muito forte para ele! Parabéns!"
}

console.log(resultado);
console.log(destino);