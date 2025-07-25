---
title: Class Font
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.Font class. Represents font object
type: docs
weight: 10690
url: /net/aspose.pdf.text/font/
---
## Font class

Represents font object.

```csharp
public sealed class Font
```

## Properties

| Name | Description |
| --- | --- |
| [BaseFont](../../aspose.pdf.text/font/basefont/) { get; } | Gets BaseFont value of PDF font object. Also known as PostScript name of the font. |
| [DecodedFontName](../../aspose.pdf.text/font/decodedfontname/) { get; } | Sometimes PDF fonts(usually Chinese/Japanese/Korean fonts) could have specificical font name. This name is value of PDF font property "BaseFont" and sometimes this property could be represented in hexademical form. If read this name directly it could be represented in non-readable form. To get readable form it's necessary to decode font's name by rules specifical for this font. This property returns decoded font name, so use it for cases when you meet with a non-readable [`FontName`](./fontname/). If property [`FontName`](./fontname/) has readable form this property will be the same as [`FontName`](./fontname/), so you can use this property for any cases when you need to get font name in a readable form. |
| [FontName](../../aspose.pdf.text/font/fontname/) { get; } | Gets font name of the `Font` object. |
| [FontOptions](../../aspose.pdf.text/font/fontoptions/) { get; } | Useful properties to tune Font behaviour |
| [IsAccessible](../../aspose.pdf.text/font/isaccessible/) { get; } | Gets indicating whether the font is present (installed) in the system. |
| [IsEmbedded](../../aspose.pdf.text/font/isembedded/) { get; set; } | Gets or sets a value that indicates whether the font is embedded. Font based on IFont will automatically be subset and embedded |
| [IsSubset](../../aspose.pdf.text/font/issubset/) { get; set; } | Gets or sets a value that indicates whether the font is a subset. Font based on IFont will automatically be subset and embedded |

## Methods

| Name | Description |
| --- | --- |
| [GetLastFontEmbeddingError](../../aspose.pdf.text/font/getlastfontembeddingerror/)() | An objective of this method - to return description of error if an attempt to embed font was failed. If there are no error cases it returns empty string. |
| [MeasureString](../../aspose.pdf.text/font/measurestring/)(string, float) | Measures the string. |
| [Save](../../aspose.pdf.text/font/save/)(Stream) | Saves the font into the stream. Note that the font is saved to intermediate TTF format intended to be used in a converted copy of the original document only. The font file is not intended to be used outside the original document context. |

## Examples

The example demonstrates how to search text on first page and change font of a first search occurrence.

```csharp
// Open document
Document doc = new Document(@"D:\Tests\input.pdf");

// Create TextFragmentAbsorber object to find all "hello world" text occurrences
TextFragmentAbsorber absorber = new TextFragmentAbsorber("hello world");

// Accept the absorber for first page
doc.Pages[1].Accept(absorber);

// Create font and mark it to be embedded
Font font = FontRepository.FindFont("Arial");
font.IsEmbedded = true;

// Change font of the first text occurrence
absorber.TextFragments[1].TextState.Font = font;


// Save document
doc.Save(@"D:\Tests\output.pdf"); 
```

### See Also

* class [TextFragmentAbsorber](../textfragmentabsorber/)
* class [FontRepository](../fontrepository/)
* class [Document](../../aspose.pdf/document/)
* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


