---
title: Font.Name
linktitle: Name
articleTitle: Name
second_title: Aspose.Words for .NET
description: Discover the Font Name property to easily customize and set your font styles, enhancing your design's appeal and readability.
type: docs
weight: 230
url: /net/aspose.words/font/name/
---
## Font.Name property

Gets or sets the name of the font.

```csharp
public string Name { get; set; }
```

## Remarks

When getting, returns [`NameAscii`](../nameascii/).

When setting, sets [`NameAscii`](../nameascii/), [`NameBi`](../namebi/), [`NameFarEast`](../namefareast/) and [`NameOther`](../nameother/) to the specified value.

## Examples

Shows how to format a run of text using its font property.

```csharp
Document doc = new Document();
Run run = new Run(doc, "Hello world!");

Aspose.Words.Font font = run.Font;
font.Name = "Courier New";
font.Size = 36;
font.HighlightColor = Color.Yellow;

doc.FirstSection.Body.FirstParagraph.AppendChild(run);
doc.Save(ArtifactsDir + "Font.CreateFormattedRun.docx");
```

Shows how to insert formatted text using DocumentBuilder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Specify font formatting, then add text.
Aspose.Words.Font font = builder.Font;
font.Size = 16;
font.Bold = true;
font.Color = Color.Blue;
font.Name = "Courier New";
font.Underline = Underline.Dash;

builder.Write("Hello world!");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
