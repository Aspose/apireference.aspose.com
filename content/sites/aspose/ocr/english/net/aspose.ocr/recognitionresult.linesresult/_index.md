---
title: RecognitionResult.LinesResult
second_title: Aspose.OCR for .NET API Reference
description: Recognized text from row with row coordinates.
type: docs
weight: 160
url: /net/aspose.ocr/recognitionresult.linesresult/
---
## RecognitionResult.LinesResult class

Recognized text from row with row coordinates.

```csharp
public class LinesResult
```

## Constructors

| Name | Description |
| --- | --- |
| [LinesResult](linesresult)() | Constructor for LinesResult object. |

## Properties

| Name | Description |
| --- | --- |
| [Confidence](../../aspose.ocr/linesresult/confidence) { get; set; } | The confidence score assigned to the recognized text line, represented as a floating-point value between 0.0 and 1.0. A score of 1.0 indicates the highest level of recognition certainty. This value is always set to 0 when using a temporary license. Confidence is only calculated for the following languages: Chinese language group, Arabic, Hindi, European, Korean, Japanese, Telugu, Tamil, and Kannada. Confidence is not calculated for ExtLatin or languages that contain diacritical marks. |
| [Line](../../aspose.ocr/linesresult/line) { get; set; } | Row coordinates. |
| [TextInLine](../../aspose.ocr/linesresult/textinline) { get; set; } | Recognized text from row. |

### See Also

* class [RecognitionResult](../recognitionresult)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
