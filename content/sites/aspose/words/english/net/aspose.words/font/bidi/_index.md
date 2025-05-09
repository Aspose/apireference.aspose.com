---
title: Font.Bidi
linktitle: Bidi
articleTitle: Bidi
second_title: Aspose.Words for .NET
description: Discover the Font Bidi property, control right-to-left text characteristics for enhanced readability and user experience in your web designs.
type: docs
weight: 30
url: /net/aspose.words/font/bidi/
---
## Font.Bidi property

Specifies whether the contents of this run shall have right-to-left characteristics.

```csharp
public bool Bidi { get; set; }
```

## Remarks

This property, when on, shall not be used with strongly left-to-right text. Any behavior under that condition is unspecified. This property, when off, shall not be used with strong right-to-left text. Any behavior under that condition is unspecified.

When the contents of this run are displayed, all characters shall be treated as complex script characters for formatting purposes. This means that [`BoldBi`](../boldbi/), [`ItalicBi`](../italicbi/), [`SizeBi`](../sizebi/) and a corresponding font name will be used when rendering this run.

Also, when the contents of this run are displayed, this property acts as a right-to-left override for characters which are classified as "weak types" and "neutral types".

## Examples

Shows how to define separate sets of font settings for right-to-left, and right-to-left text.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Define a set of font settings for left-to-right text.
builder.Font.Name = "Courier New";
builder.Font.Size = 16;
builder.Font.Italic = false;
builder.Font.Bold = false;
builder.Font.LocaleId = new CultureInfo("en-US", false).LCID;

// Define another set of font settings for right-to-left text.
builder.Font.NameBi = "Andalus";
builder.Font.SizeBi = 24;
builder.Font.ItalicBi = true;
builder.Font.BoldBi = true;
builder.Font.LocaleIdBi = new CultureInfo("ar-AR", false).LCID;

// We can use the Bidi flag to indicate whether the text we are about to add
// with the document builder is right-to-left. When we add text with this flag set to true,
// it will be formatted using the right-to-left set of font settings.
builder.Font.Bidi = true;
builder.Write("مرحبًا");

// Set the flag to false, and then add left-to-right text.
// The document builder will format these using the left-to-right set of font settings.
builder.Font.Bidi = false;
builder.Write(" Hello world!");

doc.Save(ArtifactsDir + "Font.Bidi.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
