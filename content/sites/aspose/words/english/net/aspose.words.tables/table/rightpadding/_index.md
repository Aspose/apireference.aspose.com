---
title: Table.RightPadding
linktitle: RightPadding
articleTitle: RightPadding
second_title: Aspose.Words for .NET
description: Discover the Table RightPadding property to customize cell spacing. Easily adjust the right margin for enhanced layout and readability in your designs.
type: docs
weight: 250
url: /net/aspose.words.tables/table/rightpadding/
---
## Table.RightPadding property

Gets or sets the amount of space (in points) to add to the right of the contents of cells.

```csharp
public double RightPadding { get; set; }
```

## Examples

Shows how to configure content padding in a table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Row 1, cell 1.");
builder.InsertCell();
builder.Write("Row 1, cell 2.");
builder.EndTable();

// For every cell in the table, set the distance between its contents and each of its borders. 
// This table will maintain the minimum padding distance by wrapping text.
table.LeftPadding = 30;
table.RightPadding = 60;
table.TopPadding = 10;
table.BottomPadding = 90;
table.PreferredWidth = PreferredWidth.FromPoints(250);

doc.Save(ArtifactsDir + "DocumentBuilder.SetRowFormatting.docx");
```

### See Also

* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
