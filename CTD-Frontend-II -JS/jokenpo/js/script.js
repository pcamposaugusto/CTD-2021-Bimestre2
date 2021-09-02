// AULA 2 - Desafio - Pedra, papel e tesoura

// ----- Parte feita com o Professor

// let maoUsuario1 = prompt("Digite um número entre (1) pedra, (2) papel e (3) tesoura");

// let maoMaquina1 = parseInt(Math.random() * 3+1);
// console.log("A máquina jogou: " + maoMaquina1)

// if (maoUsuario == 1) {
//     if (maoMaquina == 1) {
//         console.log("empatou");
//     } else if (maoMaquina == 2) {
//         console.log ("perdeu")
//     } else if (maoMaquina == 3) {
//         console.log("ganhou")
//     }
// }

// if (maoUsuario == 2) {
//     if (maoMaquina == 1) {
//         console.log("ganhou");
//     } else if (maoMaquina == 2) {
//         console.log ("empatou")
//     } else if (maoMaquina == 3) {
//         console.log("perdeu")
//     }
// }

// if (maoUsuario == 3) {
//     if (maoMaquina == 1) {
//         console.log("perdeu");
//     } else if (maoMaquina == 2) {
//         console.log ("ganhou")
//     } else if (maoMaquina == 3) {
//         console.log("empatou")
//     }
// }

// ---------

let pontosUsuario = 0;
let pontosComputador = 0;


for (let i=1; i <= 3; i++) {
    let usuario = prompt("Digite 1 para Pedra, 2 para Papel ou 3 para Tesoura");

    let computador = parseInt(Math.random() * 3+1);
    console.log("O computador jogou: " + computador);

    switch (true) {
        case usuario == computador:
            console.log("Você e o computador empataram.");
            break
        case usuario == 2 && computador == 1:
        case usuario == 3 && computador == 2:
        case usuario == 1 && computador == 3:
            pontosUsuario += 1
            pontosComputador -= 1
            console.log("E o Homem ganha da máquina!!!");
            break
        case usuario == 1 && computador == 2:
        case usuario == 2 && computador == 3:
        case usuario == 3 && computador == 1:
            pontosUsuario -= 1
            pontosComputador += 1
            console.log("E o Homem perde para a máquina...");
            break
        default:
            i=3
            console.log("Ops, essa opção não é válida no jogo! Vamos começar novamente. Para isso, recarregue a página.");
    };
};

if (pontosUsuario > pontosComputador) {
    console.log("Parabéns! Você ganhou a partida");
} else if (pontosUsuario == pontosComputador) {
    console.log("Você empatou com o computador.")
} else {
    console.log("Que pena! Você perdeu =~")
}
