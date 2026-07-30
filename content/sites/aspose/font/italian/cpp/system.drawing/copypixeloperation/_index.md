---
title: "Enum System::Drawing::CopyPixelOperation"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Font per C++"
description: "Enum System::Drawing::CopyPixelOperation. Specifica come il colore sorgente in un'operazione di copia dei pixel viene combinato con il colore di destinazione per ottenere un colore finale in C++."
type: docs
weight: 3000
url: /it/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Specifica come il colore sorgente in un'operazione di copia di pixel viene combinato con il colore di destinazione per ottenere un colore finale.

```cpp
enum class CopyPixelOperation
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Il bitmap non è specchiato. |
| Blackness | 66 | La regione di destinazione è riempita usando il colore con indice 0 nella palette fisica. |
| NotSourceErase | 1114278 | I colori sorgente e destinazione sono combinati con OR e il colore risultante viene poi invertito. |
| NotSourceCopy | 3342344 | La regione sorgente è invertita e poi copiata nella destinazione. |
| SourceErase | 4457256 | I colori invertiti della regione di destinazione sono ANDati con i colori della regione di origine. |
| DestinationInvert | 5570569 | La regione di destinazione è invertita. |
| PatInvert | 5898313 | I colori del pennello attualmente selezionato nel contesto dispositivo di destinazione sono XORati con i colori della destinazione. |
| SourceInvert | 6684742 | I colori delle regioni di origine e destinazione sono XORati. |
| SourceAnd | 8913094 | I colori delle regioni di origine e destinazione sono ANDati. |
| MergePaint | 12255782 | I colori della regione di origine invertita sono ORati con i colori della regione di destinazione. |
| MergeCopy | 12583114 | I colori della regione di origine sono ANDati con i colori del pennello selezionato nel contesto dispositivo di destinazione. |
| SourceCopy | 13369376 | La regione di origine viene copiata direttamente nella regione di destinazione. |
| SourcePaint | 15597702 | I colori delle regioni di origine e destinazione sono ORati. |
| PatCopy | 15728673 | Il pennello attualmente selezionato nel contesto del dispositivo di destinazione viene copiato nella bitmap di destinazione. |
| PatPaint | 16452105 | I colori del pennello attualmente selezionato nel contesto del dispositivo di destinazione sono ORati con i colori della regione sorgente invertita. Il risultato di questa operazione è ORato con i colori della regione di destinazione. |
| Whiteness | 16711778 | La regione di destinazione viene riempita utilizzando il colore con indice 1 nella palette fisica. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) che sono stratificate sopra la finestra dell'applicazione sono incluse nell'immagine risultante. |

## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
