/*var i ;
for(i=0;i<10;i++){
    document.write("("+i+")");
}

document.write("<hr>");

do{
   document.write("("+i+")");
   i++;
}while(i<20)

document.write("<hr>")

while(i<30){
     document.write("{"+(++i)+"}")
}
  */
// atividade
/*document.write("<hr>")

var num =Math.round(Math.random()*100) ;
document.write("<br> numero SORTEADO : "+ num+"<br>")

var i = 0;
var t= '';
var res=parseInt(prompt("informe um numero:"));
i++;
t += "("+res+")";
do{
     document.write("<br>Numero informado foi:"+res);
     if(res > 100 || res <0){ 
        res = parseInt(prompt("o numero informado deve ser entre 0 e 100")) ;
       

     }
     else if(res < num){
        res = parseInt(prompt("o numeros informados "+t+" \n é menor que o numero sorteado, tente novamente(tentativas["+i+"])")) ;
        t += "("+res+")";
        i++;
     }
     else if(res > num){
        res = parseInt(prompt("o numeros informados "+t+" \n é maior que o numero sorteado, tente novamente(tentativas["+i+"])"));
        t += "("+res+")";
        i++;
     };


}while(res != num);
 i++;
document.write("<br>  numero correto, parabens <h1>"+res+"<h1>");
document.write("numero de tentativas <h1>"+i+"<h1>");
*/


//professor
/*var i=Math.round(Math.random()*100);
var n= parseInt(prompt("adivinhe o número")) ;
var cont=0;
var txt='';
do {
    if (n <= 100 && n > 0) {
        cont++;
        txt += "[" + n + "]";
        if (n > i)
            var n = parseInt(prompt("Errou: número é menor\n" +
                "Números informados:" + txt));
        else
            var n = parseInt(prompt("Errou: número é maior\n" +
                "Números informados:" + txt));
    }
    else
        var n= parseInt(prompt("O número deve estar entre 1 e 100")) ;
     }
    while (i != n) ;

document.write('parabéns você acertou em '+cont+
               ' tentativas<br><h1>'+n+'</h1>');
*/


//atividade formulario

function parimpar(){
var numero=parseInt(document.frAula.n1.value);
//cria um novo documento e escreve o numero nele v
//document.write("Núḿero digitado:"+numero);
//converter elemento html pelo id v
var rotulo=document.getElementById("resultado")
//inner html posso inseri um codigo html/tags, o inner text é um texto sem tags html
if(numero%2==0)
     var txt = "par"
    else
    txt="impar"
rotulo.innerHTML='<h1>o número digitado :'+numero+' é '+txt+'</h1>';

}
