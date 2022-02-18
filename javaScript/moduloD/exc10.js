/*
var idade = 71
console.log(`Você tem ${idade} anos`)
if (idade < 16) {
    console.log('Não vota')
} else if (idade < 18 || idade > 65) {
    console.log('Voto opcional')
} else {
    console.log('Voto obrigatório')
}

//console.log('///////////////////////////////////////////////////////')

var getDateTime = new Date()
var hour = getDateTime.getHours()
if (hour < 12) {
    console.log('Bom Dia!')
} else if (hour <= 18) {
    console.log('Boa Tarde')
} else {
    console.log('Boa Noite')
}
*/

//console.log('///////////////////////////////////////////////////////')

var date = new Date();
var diaSemana = date.getDay();
switch (diaSemana) {
    case 0:
        console.log('Domingão');
        break;
    case 1:
        console.log('Segunda-Feira');
        break;
    case 2:
        console.log('Terça-Feira');
        break;
    case 3:
        console.log('Quarta-Feira');
        break;
    case 4:
        console.log('Quinta-Feira');
        break;
    case 5:
        console.log('Sexta-Feira');
        break;
    case 6:
        console.log('Sábadão');
        break;
    default:
        console.log('[ERRO] Dia inválido!')
        break;
}