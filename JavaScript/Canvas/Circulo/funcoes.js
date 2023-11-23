var ctx;
const LARGURA=400 , ALTURA=400;

function criarCanvas(){

    var pai=document.getElementsByTagName("div")[0];
    var canvas=document.createElement("canvas");
    canvas.setAttribute("width", LARGURA);
    canvas.setAttribute("height", ALTURA);
    pai.appendChild(canvas);
    ctx = canvas.getContext("2d");

}

 function limpar(){
    ctx.clearRect(0,0,LARGURA,ALTURA);
 }

 function circulo(){
    limpar();
    ctx.beginPath();
    ctx.arc(200,200,150,0,2*Math.PI); //3 numero é o raio, os primeiros é x e y
    ctx.stroke();//so a circuferencia, nada no meio, linha externa, o 4 é op grau onde começa e o ultimo o grau oonde termina
 }

 function arco(){
    limpar();
    ctx.beginPath();
    ctx.arc(200, 200, 150, 0, Math.PI);
    ctx.stroke();
 }

 function arcoAntihorario(){
    limpar();
    ctx.beginPath();
    ctx.arc(200, 200, 150, 0, Math.PI,true);
    ctx.stroke();

 }

function circuloColorido(){
    limpar();
    ctx.beginPath();
    ctx.fillStyle = 'blue';
    ctx.arc(200, 200, 150, 0, 2*Math.PI);
    ctx.fill();
}
