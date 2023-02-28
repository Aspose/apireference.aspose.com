---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Controlla se limmagine contiene il frammento di testo fornito.
type: docs
weight: 80
url: /it/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Controlla se l'immagine contiene il frammento di testo fornito.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso per l'immagine. |
| text | String | Frammento di testo per la ricerca sull'immagine. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |
| ignoreCase | Boolean | Vero: indica una ricerca senza distinzione tra maiuscole e minuscole. |

### Valore di ritorno

Vero se l'immagine contiene un frammento di testo. Falso: l'immagine non contiene frammenti di testo.

### Osservazioni

Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Guarda anche

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Controlla se il testo dell'immagine corrisponde all'espressione regolare fornita.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso per l'immagine. |
| regex | Regex | Oggetto System.Text.RegularExpressions con il modello e le opzioni forniti. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

True se il testo dell'immagine corrisponde all'espressione regolare fornita.

### Osservazioni

Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Guarda anche

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


