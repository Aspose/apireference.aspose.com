---
title: Class FontRepository
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.FontRepository class. Performs font search. Searches in system installed fonts and standard Pdf fonts. Also provides functionality to open custom fonts
type: docs
weight: 10720
url: /net/aspose.pdf.text/fontrepository/
---
## FontRepository class

Performs font search. Searches in system installed fonts and standard Pdf fonts. Also provides functionality to open custom fonts.

```csharp
public sealed class FontRepository
```

## Constructors

| Name | Description |
| --- | --- |
| [FontRepository](fontrepository/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| static [Sources](../../aspose.pdf.text/fontrepository/sources/) { get; } | Gets font sources collection. |
| static [Substitutions](../../aspose.pdf.text/fontrepository/substitutions/) { get; } | Gets font substitution strategies collection. |

## Methods

| Name | Description |
| --- | --- |
| static [FindFont](../../aspose.pdf.text/fontrepository/findfont/#findfont)(string) | Searches and returns font with specified font name. |
| static [FindFont](../../aspose.pdf.text/fontrepository/findfont/#findfont_3)(string, bool) | Searches and returns font with specified font name ignoring or honoring case sensitivity. |
| static [FindFont](../../aspose.pdf.text/fontrepository/findfont/#findfont_1)(string, FontStyles) | Searches and returns font with specified font name and font style. |
| static [FindFont](../../aspose.pdf.text/fontrepository/findfont/#findfont_2)(string, FontStyles, bool) | Searches and returns font with specified font name and font style ignoring or honoring case sensitivity. |
| static [LoadFonts](../../aspose.pdf.text/fontrepository/loadfonts/)() | Loads system installed fonts and standard Pdf fonts. This method was designed to speed up font loading process. By default fonts are loaded on first request for any font. Use of this method loads system and standard Pdf fonts immediately before any Pdf document was open. |
| static [OpenFont](../../aspose.pdf.text/fontrepository/openfont/#openfont_1)(string) | Opens font with specified font file path. |
| static [OpenFont](../../aspose.pdf.text/fontrepository/openfont/#openfont)(Stream, FontTypes) | Opens font with specified font stream. |
| static [OpenFont](../../aspose.pdf.text/fontrepository/openfont/#openfont_2)(string, string) | Opens font with specified font file path and metrics file path. |
| static [ReloadFonts](../../aspose.pdf.text/fontrepository/reloadfonts/)() | Reloads all fonts specified by property [`Sources`](./sources/) |

## Examples

The example demonstrates how to find font and replace the font of text of first page.

```csharp
// Find font
Font font = FontRepository.FindFont("Arial");

// Open document
Document doc = new Document(@"D:\Tests\input.pdf");

// Create TextFragmentAbsorber object to find all "hello world" text occurrences
TextFragmentAbsorber absorber = new TextFragmentAbsorber("hello world");

// Accept the absorber for first page
doc.Pages[1].Accept(absorber);

// Change font of the first text occurrence
absorber.TextFragments[1].TextState.Font = font;

// Save document
doc.Save(@"D:\Tests\output.pdf"); 
```

### See Also

* class [TextFragmentAbsorber](../textfragmentabsorber/)
* class [Document](../../aspose.pdf/document/)
* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


