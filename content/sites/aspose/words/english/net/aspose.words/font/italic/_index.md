---
title: Font.Italic
linktitle: Italic
articleTitle: Italic
second_title: Aspose.Words for .NET
description: Font Italic property. True if the font is formatted as italic in C#.
type: docs
weight: 160
url: /net/aspose.words/font/italic/
---
## Font.Italic property

True if the font is formatted as italic.

```csharp
public bool Italic { get; set; }
```

## Examples

Shows how to write italicized text using a document builder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Size = 36;
builder.Font.Italic = true;
builder.Writeln("Hello world!");

doc.Save(ArtifactsDir + "Font.Italic.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
