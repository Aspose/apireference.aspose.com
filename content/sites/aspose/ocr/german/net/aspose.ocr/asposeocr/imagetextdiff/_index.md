---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Vergleichen Sie die Texte auf den beiden Bildern und geben Sie eine Zahl zurück die angibt wie ähnlich sie sind 0 bis 1.
type: docs
weight: 90
url: /de/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Vergleichen Sie die Texte auf den beiden Bildern und geben Sie eine Zahl zurück, die angibt, wie ähnlich sie sind (0 bis 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath1 | String | Pfad zum ersten Bild. |
| fullPath2 | String | Pfad zum zweiten Bild. |
| settings | RecognitionSettings | Erkennungseinstellungen. |
| ignoreCase | Boolean | True - bedeutet eine Suche ohne Berücksichtigung der Groß-/Kleinschreibung. |

### Rückgabewert

0 bedeutet, dass die Texte völlig unterschiedlich sind; 1 bedeutet, dass die Texte identisch sind.

### Siehe auch

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


