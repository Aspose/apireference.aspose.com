---
title: Enum DetectAreasMode
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.DetectAreasMode enum. Determina il tipo di rete neurale utilizzata per il rilevamento delle aree.
type: docs
weight: 60
url: /it/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Determina il tipo di rete neurale utilizzata per il rilevamento delle aree.

```csharp
public enum DetectAreasMode
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| NONE | `0` | Non rileva i paragrafi. Ideale per un semplice documento di una colonna senza immagini. |
| DOCUMENT | `1` | Rileva i paragrafi utilizza il modello NN per i documenti. Ideale per documenti a più colonne, documenti con immagini o con altri oggetti non di testo. |
| PHOTO | `2` | Rileva i paragrafi utilizza il modello NN per le foto. Ideale per immagini con molte immagini e altri oggetti non di testo. |
| COMBINE | `3` | Rileva i paragrafi con testo e quindi utilizza un altro modello NN per rilevare le aree all'interno dei paragrafi. Ideale per immagini con struttura complessa. |
| TABLE | `4` | Rileva celle con testo. Modalità preferibile per immagini con struttura tabellare. |
| CURVED_TEXT | `5` | Rileva linee e riconosce il testo su immagini curve. Modalità preferita per foto di pagine di libri e riviste. |

### Osservazioni

Usato in[`RecognitionSettings`](../recognitionsettings/) per specificare quale tipo di immagine desideri riconoscere.

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


