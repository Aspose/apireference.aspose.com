---
title: Class TemplateProcessor
second_title: Aspose.OMR per Riferimento API .NET
description: Aspose.OMR.Api.TemplateProcessor classe. Classe per lelaborazione di modelli e immagini.  Ogni istanza di questa classe funziona con un singolo modello OMR. È in grado di riconoscere le immagini del modello specificato nel costruttore.
type: docs
weight: 30
url: /it/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Classe per l'elaborazione di modelli e immagini.  Ogni istanza di questa classe funziona con un singolo modello OMR. È in grado di riconoscere le immagini del modello specificato nel costruttore.

```csharp
public class TemplateProcessor
```

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Aggiorna il risultato del riconoscimento utilizzando parametri ottimizzati. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Riconosce le immagini dalla cartella |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Riconoscimento dell'immagine dal flusso di memoria |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Riconosce l'immagine |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Riconosce il modello multipagina |

### Esempi

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Guarda anche

* spazio dei nomi [Aspose.OMR.Api](../../aspose.omr.api/)
* assemblea [Aspose.OMR](../../)


