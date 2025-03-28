---
title: Border.Color
linktitle: Color
articleTitle: Color
second_title: Aspose.Words for .NET
description: Customize your designs effortlessly with the Border Color property, allowing you to set and modify border colors for a stunning visual impact.
type: docs
weight: 10
url: /net/aspose.words/border/color/
---
## Border.Color property

Gets or sets the border color.

```csharp
public Color Color { get; set; }
```

## Examples

Shows how to insert a string surrounded by a border into a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Border.Color = Color.Green;
builder.Font.Border.LineWidth = 2.5d;
builder.Font.Border.LineStyle = LineStyle.DashDotStroker;

builder.Write("Text surrounded by green border.");

doc.Save(ArtifactsDir + "Border.FontBorder.docx");
```

### See Also

* class [Border](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
