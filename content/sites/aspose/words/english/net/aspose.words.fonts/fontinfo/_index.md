---
title: FontInfo Class
linktitle: FontInfo
articleTitle: FontInfo
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fonts.FontInfo class, your key to detailed font insights for documents, enhancing text quality and visual appeal.
type: docs
weight: 3350
url: /net/aspose.words.fonts/fontinfo/
---
## FontInfo class

Specifies information about a font used in the document.

To learn more, visit the [Working with Fonts](https://docs.aspose.com/words/net/working-with-fonts/) documentation article.

```csharp
public class FontInfo
```

## Properties

| Name | Description |
| --- | --- |
| [AltName](../../aspose.words.fonts/fontinfo/altname/) { get; set; } | Gets or sets the alternate name for the font. |
| [Charset](../../aspose.words.fonts/fontinfo/charset/) { get; set; } | Gets or sets the character set for the font. |
| [EmbeddingLicensingRights](../../aspose.words.fonts/fontinfo/embeddinglicensingrights/) { get; } | Gets the embedded font licensing rights. |
| [Family](../../aspose.words.fonts/fontinfo/family/) { get; set; } | Gets or sets the font family this font belongs to. |
| [IsTrueType](../../aspose.words.fonts/fontinfo/istruetype/) { get; set; } | Indicates that this font is a TrueType or OpenType font as opposed to a raster or vector font. Default is `true`. |
| [Name](../../aspose.words.fonts/fontinfo/name/) { get; } | Gets the name of the font. |
| [Panose](../../aspose.words.fonts/fontinfo/panose/) { get; set; } | Gets or sets the PANOSE typeface classification number. |
| [Pitch](../../aspose.words.fonts/fontinfo/pitch/) { get; set; } | The pitch indicates if the font is fixed pitch, proportionally spaced, or relies on a default setting. |

## Methods

| Name | Description |
| --- | --- |
| [GetEmbeddedFont](../../aspose.words.fonts/fontinfo/getembeddedfont/)(*[EmbeddedFontFormat](../embeddedfontformat/), [EmbeddedFontStyle](../embeddedfontstyle/)*) | Gets a specific embedded font file. |
| [GetEmbeddedFontAsOpenType](../../aspose.words.fonts/fontinfo/getembeddedfontasopentype/)(*[EmbeddedFontStyle](../embeddedfontstyle/)*) | Gets an embedded font file in OpenType format. Fonts in Embedded OpenType format are converted to OpenType. |

## Remarks

You do not create instances of this class directly. Use the [`FontInfos`](../../aspose.words/documentbase/fontinfos/) property to access the collection of fonts defined in a document.

## Examples

Shows how to print the details of what fonts are present in a document.

```csharp
Document doc = new Document(MyDir + "Embedded font.docx");

FontInfoCollection allFonts = doc.FontInfos;
// Print all the used and unused fonts in the document.
for (int i = 0; i < allFonts.Count; i++)
{
    Console.WriteLine($"Font index #{i}");
    Console.WriteLine($"\tName: {allFonts[i].Name}");
    Console.WriteLine($"\tIs {(allFonts[i].IsTrueType ? "" : "not ")}a trueType font");
}
```

### See Also

* namespace [Aspose.Words.Fonts](../../aspose.words.fonts/)
* assembly [Aspose.Words](../../)
