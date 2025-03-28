---
title: FontInfoCollection.EmbedTrueTypeFonts
linktitle: EmbedTrueTypeFonts
articleTitle: EmbedTrueTypeFonts
second_title: Aspose.Words for .NET
description: Learn how the EmbedTrueTypeFonts property in FontInfoCollection enhances document quality by allowing TrueType font embedding. Default is false.
type: docs
weight: 30
url: /net/aspose.words.fonts/fontinfocollection/embedtruetypefonts/
---
## FontInfoCollection.EmbedTrueTypeFonts property

Specifies whether or not to embed TrueType fonts in a document when it is saved. Default value for this property is `false`.

```csharp
public bool EmbedTrueTypeFonts { get; set; }
```

## Remarks

Embedding TrueType fonts allows others to view the document with the same fonts that were used to create it, but may substantially increase the document size.

This option works for DOC, DOCX and RTF formats only.

## Examples

Shows how to save a document with embedded TrueType fonts.

```csharp
Document doc = new Document(MyDir + "Document.docx");

FontInfoCollection fontInfos = doc.FontInfos;
fontInfos.EmbedTrueTypeFonts = embedAllFonts;
fontInfos.EmbedSystemFonts = embedAllFonts;
fontInfos.SaveSubsetFonts = embedAllFonts;

doc.Save(ArtifactsDir + "Font.FontInfoCollection.docx");
```

### See Also

* class [FontInfoCollection](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
