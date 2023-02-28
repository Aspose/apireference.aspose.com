---
title: Class RecognitionResult
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.RecognitionResult classe. I risultati del riconoscimento dellimmagine. Contiene elementi con informazioni di riconoscimento e metodi per lesportazione dei risultati.
type: docs
weight: 220
url: /it/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

I risultati del riconoscimento dell'immagine. Contiene elementi con informazioni di riconoscimento e metodi per l'esportazione dei risultati.

```csharp
public class RecognitionResult
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Ottiene o imposta l'immagine per la creazione di pdf. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Ottiene le coordinate dei rettangoli. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Ottiene i risultati del riconoscimento dell'elenco di un elenco di aree (rettangoli). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Un insieme di caratteri trovati dall'algoritmo di riconoscimento e disposti in ordine decrescente di probabilità. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Ottiene un elenco di risultati di riconoscimento con un elenco di righe (rettangoli). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Ottiene il risultato del riconoscimento in una stringa. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Ottiene l'angolo di inclinazione. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Ottiene l'elenco dei messaggi di avviso che descrivono i guasti non critici comparsi durante la generazione. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Forma la stringa JSON con i risultati del riconoscimento. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Corregge il testo (sostituisce le parole errate). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Trova le parole errate con l'ortografia suggerita per un determinato testo di input. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Modulo stringa XML con risultati di riconoscimento. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Salva il documento come testo normale, PDF o documento Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Salva il documento come testo normale, PDF o documento Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Per completare il risultato completo dai frammenti riconosciuti (righe). |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Testo riconosciuto dalla riga con coordinate di riga. |

### Guarda anche

* spazio dei nomi [Aspose.OCR](../../aspose.ocr/)
* assemblea [Aspose.OCR](../../)


