let calculadora = prompt("Qual operação deseja realizar? \n 1- Somar \n 2- Subtrair \n 3-Multiplicar \n 4- Subtrair")

let n1 = parseFloat(prompt("Qual o primeiro número?"));
let n2 = parseFloat(prompt("Qual o segundo número?"));


    let somar = () => {
        console.log(n1 + n2);
        return n1+n2
    }

    let subtrair = () => {
        alert(n1 - n2);
        return n1-n2;
    }

    let multiplicar = () => {
        let resultado = 0;
        if((n1 == 0) || (n2 == 0)){
            alert(resultado);
            return resultado; 
        } else {
            alert (n1 * n2);
            return n1*n2
        }
    }

    let dividir = () => {
        if (n2==0) {
            alert("Não se pode dividir por zero");
            return("Não se pode dividir por zero");
        } else {
            alert(n1/n2);
            return n1 / n2;
        }
    }