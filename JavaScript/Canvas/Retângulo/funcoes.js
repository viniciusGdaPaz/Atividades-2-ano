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

 function retangulo(){
    limpar();
    ctx.strokeRect(50, 50, 150, 50);//nada dentro, só as linhas, 2 primeiros é o ponto inicial x e y, e os dois ultimos são a largura e a alturA
 }

 function retanguloColorido(){
    limpar();
    ctx.beginPath;
    ctx.fillStyle='blue'; //cor de ddentro
    ctx.strokeStyle="red"; //cor das linhas
    ctx.fillRect(25,24,200,100);//quando for colocar cor dentro se usa fill ao inves de stroke
 }
