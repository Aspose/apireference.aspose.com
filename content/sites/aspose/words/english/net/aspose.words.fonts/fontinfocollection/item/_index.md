---
title: FontInfoCollection.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: Discover the FontInfoCollection Item property to easily retrieve fonts by name, enhancing your design projects with precision and style.
type: docs
weight: 40
url: /net/aspose.words.fonts/fontinfocollection/item/
---
## FontInfoCollection indexer (1 of 2)

Gets a font with the specified name.

```csharp
public FontInfo this[string name] { get; }
```

| Parameter | Description |
| --- | --- |
| name | Case-insensitive name of the font to locate. |

## Examples

Shows how to extract an embedded font from a document, and save it to the local file system.

```csharp
Document doc = new Document(MyDir + "Embedded font.docx");

FontInfo embeddedFont = doc.FontInfos["Alte DIN 1451 Mittelschrift"];
byte[] embeddedFontBytes = embeddedFont.GetEmbeddedFont(EmbeddedFontFormat.OpenType, EmbeddedFontStyle.Regular);
File.WriteAllBytes(ArtifactsDir + "Alte DIN 1451 Mittelschrift.ttf", embeddedFontBytes);

// Embedded font formats may be different in other formats such as .doc.
// We need to know the correct format before we can extract the font.
doc = new Document(MyDir + "Embedded font.doc");

Assert.That(doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFont(EmbeddedFontFormat.OpenType, EmbeddedFontStyle.Regular), Is.Null);
Assert.That(doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFont(EmbeddedFontFormat.EmbeddedOpenType, EmbeddedFontStyle.Regular), Is.Not.Null);

// Also, we can convert embedded OpenType format, which comes from .doc documents, to OpenType.
embeddedFontBytes = doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFontAsOpenType(EmbeddedFontStyle.Regular);

File.WriteAllBytes(ArtifactsDir + "Alte DIN 1451 Mittelschrift.otf", embeddedFontBytes);
```

### See Also

* class [FontInfo](../../fontinfo/)
* class [FontInfoCollection](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)

---

## FontInfoCollection indexer (2 of 2)

Gets a font at the specified index.

```csharp
public FontInfo this[int index] { get; }
```

| Parameter | Description |
| --- | --- |
| index | Zero-based index of the font. |

## Examples

Shows how to extract an embedded font from a document, and save it to the local file system.

```csharp
Document doc = new Document(MyDir + "Embedded font.docx");

FontInfo embeddedFont = doc.FontInfos["Alte DIN 1451 Mittelschrift"];
byte[] embeddedFontBytes = embeddedFont.GetEmbeddedFont(EmbeddedFontFormat.OpenType, EmbeddedFontStyle.Regular);
File.WriteAllBytes(ArtifactsDir + "Alte DIN 1451 Mittelschrift.ttf", embeddedFontBytes);

// Embedded font formats may be different in other formats such as .doc.
// We need to know the correct format before we can extract the font.
doc = new Document(MyDir + "Embedded font.doc");

Assert.That(doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFont(EmbeddedFontFormat.OpenType, EmbeddedFontStyle.Regular), Is.Null);
Assert.That(doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFont(EmbeddedFontFormat.EmbeddedOpenType, EmbeddedFontStyle.Regular), Is.Not.Null);

// Also, we can convert embedded OpenType format, which comes from .doc documents, to OpenType.
embeddedFontBytes = doc.FontInfos["Alte DIN 1451 Mittelschrift"].GetEmbeddedFontAsOpenType(EmbeddedFontStyle.Regular);

File.WriteAllBytes(ArtifactsDir + "Alte DIN 1451 Mittelschrift.otf", embeddedFontBytes);
```

### See Also

* class [FontInfo](../../fontinfo/)
* class [FontInfoCollection](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
