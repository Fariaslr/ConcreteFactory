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

  // Conversão
  switch (unidade) {
    case 'L':
      cimento /= 1000;
      areia /= 1000;
      brita /= 1000;
      agua /= 1000;
      cola /= 1000;
      break;
    case 'ml':
      // permanece em ml, ou seja, gramas
      break;
    case 'kg':
      cimento /= 1000;
      areia /= 1000;
      brita /= 1000;
      agua /= 1000;
      cola /= 1000;
      break;
  }

  const sufixo = unidade === 'kg' ? ' kg' : unidade === 'ml' ? ' ml' : ' L';

  document.getElementById('resultado').innerHTML = `
    <strong>Materiais necessários:</strong><br>
    Cimento: ${cimento.toFixed(2)}${sufixo}<br>
    Areia: ${areia.toFixed(2)}${sufixo}<br>
    Brita: ${brita.toFixed(2)}${sufixo}<br>
    Água: ${agua.toFixed(2)}${sufixo}<br>
    Cola: ${cola.toFixed(2)}${sufixo}
  `;
}
