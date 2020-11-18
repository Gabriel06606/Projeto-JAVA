var array_produtos = [
    ['Camiseta 1', 'fiji.jpg', 'Produto'],
    ['Camiseta 2', 'maiorca.jpg', 'Produto'],
    ['Camiseta 3', 'maldivas.jpg', 'Produto'],
    ['Camiseta 4', 'noronha.jpg', 'Produto'],
    ['Camiseta 5', 'santorini.jpg', 'Produto'],
    ['Camiseta 6', 'santorini.jpg', 'Produto'],
    ['Camiseta 7', 'santorini.jpg', 'Produto'],
    ['Camiseta 8', 'santorini.jpg', 'Produto'],
    ['Camiseta 9', 'santorini.jpg', 'Produto'],
    ['Camiseta 10', 'santorini.jpg', 'Produto'],
    ['Camiseta 11', 'santorini.jpg', 'Produto'],
    ['Camiseta 12', 'santorini.jpg', 'Produto'],
    ['Camiseta 13', 'santorini.jpg', 'Produto'],
    ['Camiseta 15', 'santorini.jpg', 'Produto']
];

$(document).ready(function() {


    fLocalizarProdutos();
});


function fLocalizarProdutos() {

    $(".div-produto").html("");

    for (var i = 0; i < array_produtos.length; i++) {

        var conteudo = '';

        conteudo += '<div class= "div-card">';
        conteudo += '<div class="divImg">';
        conteudo += '<img src="./img/' + array_produtos[i][1] + '">';
        conteudo += '</div>';
        conteudo += '<div> ';
        conteudo += '<h2>' + array_produtos[i][0] + '</h2>';
        conteudo += '<p>' + array_produtos[i][2] + '</p>';
        conteudo += '<button class="btn ">Adicionar ao Carrinho</button>';
        conteudo += '</div>';
        conteudo += '</div>';
        conteudo += '</div>';

        $(".div-produto").append(conteudo);








    }
}






/*dados = ["Gabriel", "Sager", "gabriel@pucpr.br"];

var conteudo = "";

for(var i = 0; i < dados.length; i++) {
	conteudo += "<tr>";
	conteudo += "<td>" + dados[0] + "</td>";
	conteudo += "<td>" + dados[1] + "</td>";
	conteudo += "<td>" + dados[2] + "</td>";
	conteudo += "</tr>";

	$("#tabela").append(conteudo);
}*/



/*var global_musicas = [];

$(document).ready(function() {

	fLocalEventosClick();

});

function fLocalEventosClick() {

	$("#bAdicionar").click(function() {
		var descMusica = $("#tAddMusica").val();
		global_musicas.push(descMusica);
		mostraLista();
	});

	$("#bRemover").click(function() {
		var posicao = parseInt($("#tRemoverPosicao").val());
		var qtde = parseInt($("#tRemoverQtde").val());

		global_musicas.splice(posicao, qtde);
		mostraLista();

	});
}

function mostraLista(){
	$("#divMusicas").html("");
	for(var i = 0; i < global_musicas.length; i++) {
		$("#divMusicas").append(i + " - " + global_musicas[i] + "<br>");

	}
}*/


/*$(document).ready(function(){

	fLocalEventosClick();
});

function fLocalEventosClick(){

	$("#bSalvar").click(function(){

		fLocalValidaCampos("tNome");
		fLocalValidaCampos("tSobrenome");
		fLocalValidaCampos("tEmail");
		fLocalValidaCampos("tMatricula");
		fLocalValidaCampos("tUsuario");
		fLocalValidaCampos("tSenha");
		fLocalValidaCampos("tConfirmarSenha");

		fLocalValidaSenha();
	});
}

function fLocalValidaCampos(idCampo) {
		var valor = $("#"+idCampo).val();

		if(valor == "") {
			$("#"+idCampo).addClass("campo-erro");
		}
		else{
			$("#"+idCampo).removeClass("campo-erro");
		}
	}

function fLocalValidaSenha(){
		var senha = $("#tSenha").val();
		var confirmarSenha = $("#tConfirmarSenha").val();

		if(senha != "")
		{
			if(senha != confirmarSenha){
				$("#tConfirmarSenha").addClass("campo-erro");
		}
		else{
			$("#tConfirmarSenha").removeClass("campo-erro");
		}
	}
}*/


//Em JQuery
/*$(document).ready(function(){

	$("#somar").click(function() {
		var valor1 = parseInt($("#somar1").val());
		var valor2 = parseInt($("#somar2").val());
		var resultado = valor1 + valor2;
		alert(resultado);
	});
});*/

/*$(document).ready(function() {

	$("#subtrair").click(function() {
		var valor1 = parseInt($("#subtrair1").val());
		var valor2 = parseInt($("#subtrair2").val());
		var resultado = valor1 - valor2;
		alert(resultado);
	});
});*/