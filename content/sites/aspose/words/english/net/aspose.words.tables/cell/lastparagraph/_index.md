---
title: Cell.LastParagraph
linktitle: LastParagraph
articleTitle: LastParagraph
second_title: Aspose.Words for .NET
description: Discover the Cell LastParagraph property. Easily access the final paragraph from immediate child elements for efficient content management.
type: docs
weight: 60
url: /net/aspose.words.tables/cell/lastparagraph/
---
## Cell.LastParagraph property

Gets the last paragraph among the immediate children.

```csharp
public Paragraph LastParagraph { get; }
```

## Examples

Shows how to apply settings to vertical borders to a table row's format.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a table with red and blue inner borders.
Table table = builder.StartTable();

for (int i = 0; i < 3; i++)
{
    builder.InsertCell();
    builder.Write($"Row {i + 1}, Column 1");
    builder.InsertCell();
    builder.Write($"Row {i + 1}, Column 2");

    Row row = builder.EndRow();
    BorderCollection borders = row.RowFormat.Borders;

    // Adjust the appearance of borders that will appear between rows.
    borders.Horizontal.Color = Color.Red;
    borders.Horizontal.LineStyle = LineStyle.Dot;
    borders.Horizontal.LineWidth = 2.0d;

    // Adjust the appearance of borders that will appear between cells.
    borders.Vertical.Color = Color.Blue;
    borders.Vertical.LineStyle = LineStyle.Dot;
    borders.Vertical.LineWidth = 2.0d;
}

// A row format, and a cell's inner paragraph use different border settings.
Border border = table.FirstRow.FirstCell.LastParagraph.ParagraphFormat.Borders.Vertical;

Assert.That(border.Color.ToArgb(), Is.EqualTo(Color.Empty.ToArgb()));
Assert.That(border.LineWidth, Is.EqualTo(0.0d));
Assert.That(border.LineStyle, Is.EqualTo(LineStyle.None));

doc.Save(ArtifactsDir + "Border.VerticalBorders.docx");
```

### See Also

* class [Paragraph](../../../aspose.words/paragraph/)
* class [Cell](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
