---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR per Riferimento API .NET
description: RecognitionSettings costruttore. Inizializza una nuova istanza diRecognitionSettingsclasse con set completo di proprietà.
type: docs
weight: 10
url: /it/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Inizializza una nuova istanza di[`RecognitionSettings`](../)classe con set completo di proprietà.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| language | Language | Lingua utilizzata per l'OCR. |
| recognitionAreas | List`1 | Impostare manualmente le aree per il riconoscimento. Nullo per impostazione predefinita: significa che l'intera immagine viene elaborata. |
| detectAreas | Boolean | Abilita il rilevamento automatico delle aree di testo. |
| autoSkew | Boolean | Abilita la correzione automatica dell'inclinazione dell'immagine. |
| skewAngle | Single | Imposta l'angolo per la rotazione dell'immagine. |
| recognizeSingleLine | Boolean | Per immagini a riga singola |
| threshold | Int32 | Soglia di binarizzazione dell'immagine personalizzata |

### Guarda anche

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* spazio dei nomi [Aspose.OCR](../../recognitionsettings/)
* assemblea [Aspose.OCR](../../../)


