---
title: CellFormat.Shading
linktitle: Shading
articleTitle: Shading
second_title: Aspose.Words for .NET
description: Discover the CellFormat Shading property to enhance your spreadsheet's visual appeal with customizable shading options for cells.
type: docs
weight: 100
url: /net/aspose.words.tables/cellformat/shading/
---
## CellFormat.Shading property

Returns a [`Shading`](../../../aspose.words/shading/) object that refers to the shading formatting for the cell.

```csharp
public Shading Shading { get; }
```

## Examples

Shows how to modify the format of rows and cells in a table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("City");
builder.InsertCell();
builder.Write("Country");
builder.EndRow();
builder.InsertCell();
builder.Write("London");
builder.InsertCell();
builder.Write("U.K.");
builder.EndTable();

// Use the first row's "RowFormat" property to modify the formatting
// of the contents of all cells in this row.
RowFormat rowFormat = table.FirstRow.RowFormat;
rowFormat.Height = 25;
rowFormat.Borders[BorderType.Bottom].Color = Color.Red;

// Use the "CellFormat" property of the first cell in the last row to modify the formatting of that cell's contents.
CellFormat cellFormat = table.LastRow.FirstCell.CellFormat;
cellFormat.Width = 100;
cellFormat.Shading.BackgroundPatternColor = Color.Orange;

doc.Save(ArtifactsDir + "Table.RowCellFormat.docx");
```

Shows how to build a table with custom borders.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.StartTable();

// Setting table formatting options for a document builder
// will apply them to every row and cell that we add with it.
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;

builder.CellFormat.ClearFormatting();
builder.CellFormat.Width = 150;
builder.CellFormat.VerticalAlignment = CellVerticalAlignment.Center;
builder.CellFormat.Shading.BackgroundPatternColor = Color.GreenYellow;
builder.CellFormat.WrapText = false;
builder.CellFormat.FitText = true;

builder.RowFormat.ClearFormatting();
builder.RowFormat.HeightRule = HeightRule.Exactly;
builder.RowFormat.Height = 50;
builder.RowFormat.Borders.LineStyle = LineStyle.Engrave3D;
builder.RowFormat.Borders.Color = Color.Orange;

builder.InsertCell();
builder.Write("Row 1, Col 1");

builder.InsertCell();
builder.Write("Row 1, Col 2");
builder.EndRow();

// Changing the formatting will apply it to the current cell,
// and any new cells that we create with the builder afterward.
// This will not affect the cells that we have added previously.
builder.CellFormat.Shading.ClearFormatting();

builder.InsertCell();
builder.Write("Row 2, Col 1");

builder.InsertCell();
builder.Write("Row 2, Col 2");

builder.EndRow();

// Increase row height to fit the vertical text.
builder.InsertCell();
builder.RowFormat.Height = 150;
builder.CellFormat.Orientation = TextOrientation.Upward;
builder.Write("Row 3, Col 1");

builder.InsertCell();
builder.CellFormat.Orientation = TextOrientation.Downward;
builder.Write("Row 3, Col 2");

builder.EndRow();
builder.EndTable();

doc.Save(ArtifactsDir + "DocumentBuilder.InsertTable.docx");
```

### See Also

* class [Shading](../../../aspose.words/shading/)
* class [CellFormat](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
