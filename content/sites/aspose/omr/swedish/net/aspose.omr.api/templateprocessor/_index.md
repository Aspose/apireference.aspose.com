---
title: Class TemplateProcessor
second_title: Aspose.OMR för .NET API-referens
description: Aspose.OMR.Api.TemplateProcessor klass. Klass för bearbetning av mallar och bilder.  Varje instans av den här klassen fungerar med en enda OMRmall. Den kan känna igen bilder av mallen som anges i konstruktorn.
type: docs
weight: 30
url: /sv/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Klass för bearbetning av mallar och bilder.  Varje instans av den här klassen fungerar med en enda OMR-mall. Den kan känna igen bilder av mallen som anges i konstruktorn.

```csharp
public class TemplateProcessor
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Uppdaterar igenkänningsresultat med hjälp av finjusterade parametrar. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Känner igen bilder från folder |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Känner igen bild från minnet stream |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Känner igen bilden |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Känner igen mall på flera sidor |

### Exempel

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Se även

* namnutrymme [Aspose.OMR.Api](../../aspose.omr.api/)
* hopsättning [Aspose.OMR](../../)


