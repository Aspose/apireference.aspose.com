---
title: Class TemplateProcessor
second_title: Aspose.OMR für .NET-API-Referenz
description: Aspose.OMR.Api.TemplateProcessor klas. Klasse zur Verarbeitung von Vorlagen und Bildern.  Jede Instanz dieser Klasse arbeitet mit einer einzigen OMRVorlage. Sie kann Bilder der im Konstruktor angegebenen Vorlage erkennen.
type: docs
weight: 30
url: /de/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Klasse zur Verarbeitung von Vorlagen und Bildern.  Jede Instanz dieser Klasse arbeitet mit einer einzigen OMR-Vorlage. Sie kann Bilder der im Konstruktor angegebenen Vorlage erkennen.

```csharp
public class TemplateProcessor
```

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Aktualisiert das Erkennungsergebnis mit fein abgestimmten Parametern. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | erkennt Bilder aus Ordner |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Bilderkennung aus Speicherstream |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | erkennt Bild |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | erkennt mehrseitige Vorlage |

### Beispiele

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Siehe auch

* namensraum [Aspose.OMR.Api](../../aspose.omr.api/)
* Montage [Aspose.OMR](../../)


