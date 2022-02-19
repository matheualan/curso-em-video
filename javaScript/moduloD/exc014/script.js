function carregar() {
    var msg = document.querySelector('div#msg');
    var img = document.querySelector('div#img');
    var data = new Date();
    var hora = 15//data.getHours();
    msg.innerHTML = `Agora são ${hora} horas`;
    if (hora > 0 && hora < 12) {
        //bom dia
        img.src = 'fotomanha.jpg'
        document.body.style.background = 'yellowgreen';
    } else if (hora >= 12 && hora <= 18) {
        //boa tarde
        document.body.style.background = 'orange';
        img.src = 'fototarde.jpg'
    } else {
        //boa noite
        img.src = 'fotonoite.jpg'
        document.body.style.background = 'gray';
    }
}