---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR för .NET API-referens
description: RecognitionSettings byggare. Initierar en ny instans avRecognitionSettingsklass med fullständig uppsättning egenskaper.
type: docs
weight: 10
url: /sv/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Initierar en ny instans av[`RecognitionSettings`](../)klass med fullständig uppsättning egenskaper.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| language | Language | Språk som används för OCR. |
| recognitionAreas | List`1 | Ställ in områden för igenkänning manuellt. Null som standard - betyder att hela bilden bearbetas. |
| detectAreas | Boolean | Aktivera automatisk identifiering av textområden. |
| autoSkew | Boolean | Aktivera automatisk snedställningskorrigering. |
| skewAngle | Single | Ställ in vinkel för bildrotation. |
| recognizeSingleLine | Boolean | För enradiga bilder |
| threshold | Int32 | Anpassad bildbinariseringströskel |

### Se även

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* namnutrymme [Aspose.OCR](../../recognitionsettings/)
* hopsättning [Aspose.OCR](../../../)


