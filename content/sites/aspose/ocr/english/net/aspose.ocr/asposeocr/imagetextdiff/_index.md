---
title: ImageTextDiff
second_title: Aspose.OCR for .NET API Reference
description: Compare the texts on the two images and return a number representing how similar they are 0 to 1.
type: docs
weight: 110
url: /net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Compare the texts on the two images and return a number representing how similar they are (0 to 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true, bool autoSkew = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | String | Path to the first image. |
| fullPath2 | String | Path to the second image. |
| settings | RecognitionSettings | Recognition settings. |
| ignoreCase | Boolean | True - means a case-insensitive search. |
| autoSkew | Boolean | Enables the automatic image skew correction. |

### Return Value

0 means that the texts are completely different; 1 means the texts are identical.

### See Also

* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
