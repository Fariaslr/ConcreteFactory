function calcular() {
  const peso = parseFloat(document.getElementById('peso').value);
  const unidade = document.querySelector('input[name="unidade"]:checked').value;

  if (isNaN(peso) || peso <= 0) {
    alert("Informe um peso válido.");
    return;
  }

  let cimento = peso * 210;
  let areia = peso * 210;
  let brita = peso * 420;
  let agua = peso * 50;
  let cola = peso * 13;

  const densidades = {
    cimento: 1.4,
    areia: 1.6,
    brita: 1.5,
    agua: 1.0,
    cola: 1.05
  };

  switch (unidade) {
    case 'L':
      cimento /= 1000;
      areia /= 1000;
      brita /= 1000;
      agua /= 1000;
      cola /= 1000;
      break;

    case 'kg':
      cimento = (cimento / 1000) * densidades.cimento;
      areia = (areia / 1000) * densidades.areia;
      brita = (brita / 1000) * densidades.brita;
      agua = (agua / 1000) * densidades.agua;
      cola = (cola / 1000) * densidades.cola;
      break;

    case 'ml':
      break;
  }

  const sufixo = unidade === 'kg' ? ' kg' : unidade === 'ml' ? ' mL' : ' L';

  document.getElementById('resultado').innerHTML = `
    <strong>Materiais necessários:</strong><br>
    Cimento: ${cimento.toFixed(2)}${sufixo}<br>
    Areia: ${areia.toFixed(2)}${sufixo}<br>
    Brita: ${brita.toFixed(2)}${sufixo}<br>
    Água: ${agua.toFixed(2)}${sufixo}<br>
    Cola: ${cola.toFixed(2)}${sufixo}
  `;
}
