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

 function trianguloColorido(){
    limpar();
    ctx.beginPath();
    ctx.fillStyle="red";//qualquer linha que eu fizer nesse contexto sera vermelho
    ctx.moveTo(25, 25);//move para as coordenadas
    ctx.lineTo(105, 25);//desenha de uma coordenada até a outra
    ctx.lineTo(25, 105);
    ctx.fill();// colore o meio/ preenche a figura
 }

 function triangulo(){
    limpar();
    ctx.beginPath();//como se desse uma caneta, prepara para receber ou fazer um desenho
    ctx.moveTo(125, 125);
    ctx.lineTo(125, 45)
    ctx.lineTo(45, 125);
    ctx.closePath();//ele fecha o desenho
    ctx.stroke();//linhas externas
}
