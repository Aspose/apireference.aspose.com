---
title: Font.Outline
linktitle: Outline
articleTitle: Outline
second_title: Aspose.Words for .NET
description: Discover the Font Outline property. Easily format fonts as outlines for a unique design touch. Enhance your typography with this simple feature!
type: docs
weight: 300
url: /net/aspose.words/font/outline/
---
## Font.Outline property

True if the font is formatted as outline.

```csharp
public bool Outline { get; set; }
```

## Examples

Shows how to create a run of text formatted as outline.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Set the Outline flag to change the text's fill color to white and
// leave a thin outline around each character in the original color of the text.
builder.Font.Outline = true;
builder.Font.Color = Color.Blue;
builder.Font.Size = 36;

builder.Writeln("This text has an outline.");

doc.Save(ArtifactsDir + "Font.Outline.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
