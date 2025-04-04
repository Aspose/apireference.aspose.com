---
title: Border.TintAndShade
linktitle: TintAndShade
articleTitle: TintAndShade
second_title: Aspose.Words for .NET
description: Discover Border TintAndShade, effortlessly adjust color brightness with a simple double value for stunning design enhancements. Perfect for your creative projects!
type: docs
weight: 80
url: /net/aspose.words/border/tintandshade/
---
## Border.TintAndShade property

Gets or sets a double value that lightens or darkens a color.

```csharp
public double TintAndShade { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Throws if you attempt to set this property to a value less than -1 or more than 1. |
| InvalidOperationException | Throws if setting this property for Border object with non-theme colors. |

## Remarks

The allowed values are in the range from -1 (the darkest) to 1 (the lightest) for this property. Zero (0) is neutral.

## Examples

Shows how to insert a paragraph with a top border.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Border topBorder = builder.ParagraphFormat.Borders.Top;
topBorder.LineWidth = 4.0d;
topBorder.LineStyle = LineStyle.DashSmallGap;
// Set ThemeColor only when LineWidth or LineStyle setted.
topBorder.ThemeColor = ThemeColor.Accent1;
topBorder.TintAndShade = 0.25d;

builder.Writeln("Text with a top border.");

doc.Save(ArtifactsDir + "Border.ParagraphTopBorder.docx");
```

### See Also

* class [Border](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
