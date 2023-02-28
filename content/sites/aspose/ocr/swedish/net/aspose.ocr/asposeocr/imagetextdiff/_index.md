---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Jämför texterna på de två bilderna och returnera ett tal som visar hur lika de är 0 till 1.
type: docs
weight: 90
url: /sv/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Jämför texterna på de två bilderna och returnera ett tal som visar hur lika de är (0 till 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath1 | String | Vägen till den första bilden. |
| fullPath2 | String | Vägen till den andra bilden. |
| settings | RecognitionSettings | Igenkänningsinställningar. |
| ignoreCase | Boolean | Sant – betyder en sökning som inte är skiftlägeskänslig. |

### Returvärde

0 betyder att texterna är helt olika; 1 betyder att texterna är identiska.

### Se även

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


