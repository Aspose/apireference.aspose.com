---
title: Font.NameOther
linktitle: NameOther
articleTitle: NameOther
second_title: Aspose.Words for .NET
description: Discover Font NameOther. Easily customize fonts for character codes 128-255, enhancing your text's style and readability. Elevate your design today!
type: docs
weight: 270
url: /net/aspose.words/font/nameother/
---
## Font.NameOther property

Returns or sets the font used for characters with character codes from 128 through 255.

```csharp
public string NameOther { get; set; }
```

## Examples

Shows how Microsoft Word can combine two different fonts in one run.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Suppose a run that we use the builder to insert while using this font configuration
// contains characters within the ASCII characters' range. In that case,
// it will display those characters using this font.
builder.Font.NameAscii = "Calibri";

// With no other font specified, the builder will also apply this font to all characters that it inserts.
Assert.That(builder.Font.Name, Is.EqualTo("Calibri"));

// Specify a font to use for all characters outside of the ASCII range.
// Ideally, this font should have a glyph for each required non-ASCII character code.
builder.Font.NameOther = "Courier New";

// Insert a run with one word consisting of ASCII characters, and one word with all characters outside that range.
// Each character will be displayed using either of the fonts, depending on.
builder.Writeln("Hello, Привет");

doc.Save(ArtifactsDir + "Font.NameAscii.docx");
```

### See Also

* property [Name](../name/)
* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
