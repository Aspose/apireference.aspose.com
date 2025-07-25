---
title: Enum TextExtractionOptions.TextFormattingMode
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.TextExtractionOptionsTextFormattingMode enum. Defines different modes which can be used while converting pdf document into text. See TextDevice class
type: docs
weight: 11080
url: /net/aspose.pdf.text/textextractionoptions.textformattingmode/
---
## TextExtractionOptions.TextFormattingMode enumeration

Defines different modes which can be used while converting pdf document into text. See !:TextDevice class.

```csharp
public enum TextFormattingMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Pure | `0` | Represent pdf content with a bit of formatting routines. |
| Raw | `1` | Represent pdf content as is, i.e. without formatting. |
| Flatten | `2` | Represent pdf content with positioning text fragments by their coordinates. It is basically similar to "Raw" mode. But while "Raw" focuses on preserving the structure of text fragments (operators) in a document, "Flatten" focuses on keeping text in the order it is read. |
| MemorySaving | `3` | Extraction with memory saving. It is almost same to 'Raw' mode but works slightly faster and uses less memory. |

### See Also

* class [TextExtractionOptions](../textextractionoptions/)
* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


