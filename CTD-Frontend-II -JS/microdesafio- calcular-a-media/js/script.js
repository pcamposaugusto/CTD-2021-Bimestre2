let arrNotas = [4.5, 7.5, 9.2, 8.5]; // Criação do array com as notas dos 4 bimestres 

function calcMedia(arr) {
    let somaNotas = arr.reduce((soma, nota) => {
        console.log(soma + nota);
        return soma + nota;
    }); 
    // Uso do método .reduce() para imprimir as somas sequenciais do array
    
    let media = somaNotas/arr.length; 
    console.log(media); 
    // Obtida a última soma com o método .reduce() (igual a 29.7), o valor da média das 4 notas é guardado na variável "let media" e impresso no console


    // Nessa etapa, tornamos os resultados mais amigáveis para o usuário ao imprimir mensagens utilizando a estrutura de repetição "for" e a estrutura de decisão "if".

    for (let i=0; i < arr.length; i++) {
    console.log("Parabéns pela conclusão do bimestre " + (i+1) + ". Sua nota foi: " + arrNotas[i]);
    };

    // Essa estrutura de decisão foi criada para definir se o aluno foi aprovado ou não, tendo como média de referência a nota 7.0

    if (media>=7) {
        console.log("Sua média nos 4 bimestres foi: " + media + ". Parabéns! Você foi aprovado(a) =D");
    } else {
        console.log("Sua média nos 4 bimestres foi: " + media + ". Que pena! Infelizmente, você não foi aprovado(a) =(");
    }; 
};

calcMedia(arrNotas);
