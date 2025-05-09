function calcular() {
    const peso = parseFloat(document.getElementById('peso').value);
    if (isNaN(peso) || peso <= 0) {
      alert("Informe um peso válido.");
      return;
    }
  
    let cimento = peso * 210;
    let areia = peso * 210;
    let brita = peso * 420;
    let agua = peso * 50;
    let cola = peso * 13;
  
    // Convertendo para litros (dividindo por 1000)
    cimento /= 1000;
    areia /= 1000;
    brita /= 1000;
    agua /= 1000;
    cola /= 1000;
  
    document.getElementById('resultado').innerHTML = `
      <strong>Materiais necessários:</strong><br>
      Cimento: ${cimento.toFixed(2)} L<br>
      Areia: ${areia.toFixed(2)} L<br>
      Brita: ${brita.toFixed(2)} L<br>
      Água: ${agua.toFixed(2)} L<br>
      Cola: ${cola.toFixed(2)} L
    `;
  }
  