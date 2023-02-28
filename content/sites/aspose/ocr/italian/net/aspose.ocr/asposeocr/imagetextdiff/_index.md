---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Confronta i testi sulle due immagini e restituisci un numero che rappresenta quanto sono simili da 0 a 1.
type: docs
weight: 90
url: /it/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Confronta i testi sulle due immagini e restituisci un numero che rappresenta quanto sono simili (da 0 a 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath1 | String | Percorso alla prima immagine. |
| fullPath2 | String | Percorso alla seconda immagine. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |
| ignoreCase | Boolean | Vero: indica una ricerca senza distinzione tra maiuscole e minuscole. |

### Valore di ritorno

0 significa che i testi sono completamente diversi; 1 significa che i testi sono identici.

### Guarda anche

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


