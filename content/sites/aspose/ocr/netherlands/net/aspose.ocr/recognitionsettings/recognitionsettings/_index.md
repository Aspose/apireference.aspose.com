---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR voor .NET API-referentie
description: RecognitionSettings constructeur. Initialiseert een nieuw exemplaar van hetRecognitionSettingsklasse met volledige set eigenschappen.
type: docs
weight: 10
url: /nl/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Initialiseert een nieuw exemplaar van het[`RecognitionSettings`](../)klasse met volledige set eigenschappen.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| language | Language | Taal gebruikt voor OCR. |
| recognitionAreas | List`1 | Stel handmatig gebieden in voor herkenning. Null standaard - betekent dat de hele afbeelding wordt verwerkt. |
| detectAreas | Boolean | Schakel automatische detectie van tekstgebieden in. |
| autoSkew | Boolean | Automatische correctie van scheve afbeeldingen inschakelen. |
| skewAngle | Single | Stel de hoek in voor beeldrotatie. |
| recognizeSingleLine | Boolean | Voor afbeeldingen met één regel |
| threshold | Int32 | Drempel voor binarisatie van aangepaste afbeeldingen |

### Zie ook

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* naamruimte [Aspose.OCR](../../recognitionsettings/)
* montage [Aspose.OCR](../../../)


