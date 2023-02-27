---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Riconosci il testo dal pdf scansionato estrarre le immagini.  Riconosce il file pdf con la possibilità di specificareDocumentRecognitionSettings . Supporta solo PDF scansionati. Non supporta PDF ricercabile.
type: docs
weight: 220
url: /it/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Riconosci il testo dal pdf scansionato (estrarre le immagini).  Riconosce il file pdf con la possibilità di specificare[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Supporta solo PDF scansionati. Non supporta PDF ricercabile.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso completo dell'immagine. |
| settings | DocumentRecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Riconosci il testo dal pdf scansionato (estrarre le immagini).  Riconosce il file pdf con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta solo PDF scansionati. Non supporta PDF ricercabile.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Flusso di memoria con il file pdf. |
| settings | DocumentRecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


