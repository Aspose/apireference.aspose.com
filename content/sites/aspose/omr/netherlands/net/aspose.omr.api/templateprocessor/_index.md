---
title: Class TemplateProcessor
second_title: Aspose.OMR voor .NET API-referentie
description: Aspose.OMR.Api.TemplateProcessor klas. Klasse voor het verwerken van sjablonen en afbeeldingen.  Elke instantie van deze klasse werkt met een enkele OMRsjabloon. Het kan afbeeldingen herkennen van de sjabloon die is opgegeven in de constructor.
type: docs
weight: 30
url: /nl/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Klasse voor het verwerken van sjablonen en afbeeldingen.  Elke instantie van deze klasse werkt met een enkele OMR-sjabloon. Het kan afbeeldingen herkennen van de sjabloon die is opgegeven in de constructor.

```csharp
public class TemplateProcessor
```

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Werkt het herkenningsresultaat bij met nauwkeurig afgestemde parameters. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Herkent afbeeldingen uit folder |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Beeld herkennen uit geheugenstroom |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Herkent afbeelding |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Herkent sjabloon met meerdere pagina's |

### Voorbeelden

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Zie ook

* naamruimte [Aspose.OMR.Api](../../aspose.omr.api/)
* montage [Aspose.OMR](../../)


