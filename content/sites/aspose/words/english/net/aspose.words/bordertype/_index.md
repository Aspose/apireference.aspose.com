---
title: BorderType Enum
linktitle: BorderType
articleTitle: BorderType
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.BorderType enum for customizable border options. Enhance your documents with precise border control and style!
type: docs
weight: 280
url: /net/aspose.words/bordertype/
---
## BorderType enumeration

Specifies sides of a border.

To learn more, visit the [Programming with Documents](https://docs.aspose.com/words/net/programming-with-documents/) documentation article.

```csharp
public enum BorderType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `-1` | Default value. |
| Bottom | `0` | Specifies the bottom border of a paragraph or a table cell. |
| Left | `1` | Specifies the left border of a paragraph or a table cell. |
| Right | `2` | Specifies the right border of a paragraph or a table cell. |
| Top | `3` | Specifies the top border of a paragraph or a table cell. |
| Horizontal | `4` | Specifies the horizontal border between cells in a table or between conforming paragraphs. |
| Vertical | `5` | Specifies the vertical border between cells in a table. |
| DiagonalDown | `6` | Specifies the diagonal border in a table cell. |
| DiagonalUp | `7` | Specifies the diagonal border in a table cell. |

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

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
