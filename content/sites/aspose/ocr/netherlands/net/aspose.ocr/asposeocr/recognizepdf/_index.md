---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Tekst herkennen uit gescande pdf afbeeldingen extraheren.  Herkent pdfbestand met de mogelijkheid om te specificerenDocumentRecognitionSettings . Ondersteunt alleen gescande PDF. Ondersteunt geen doorzoekbare PDF.
type: docs
weight: 220
url: /nl/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Tekst herkennen uit gescande pdf (afbeeldingen extraheren).  Herkent pdf-bestand met de mogelijkheid om te specificeren[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Ondersteunt alleen gescande PDF. Ondersteunt geen doorzoekbare PDF.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Volledig pad naar de afbeelding. |
| settings | DocumentRecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Tekst herkennen uit gescande pdf (afbeeldingen extraheren).  Herkent pdf-bestand met de mogelijkheid om te specificeren[`RecognitionSettings`](../../recognitionsettings/) . Ondersteunt alleen gescande PDF. Ondersteunt geen doorzoekbare PDF.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | Memory stream met het pdf-bestand. |
| settings | DocumentRecognitionSettings | Herkenning instellingen. |

### Winstwaarde

De[`RecognitionResult`](../../recognitionresult/) object met resultaten voor beeldherkenning.

### Zie ook

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


