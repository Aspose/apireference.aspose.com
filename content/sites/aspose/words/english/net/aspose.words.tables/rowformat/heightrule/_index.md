---
title: RowFormat.HeightRule
linktitle: HeightRule
articleTitle: HeightRule
second_title: Aspose.Words for .NET
description: Discover the RowFormat HeightRule property to easily customize table row heights for optimal layout and design in your applications.
type: docs
weight: 50
url: /net/aspose.words.tables/rowformat/heightrule/
---
## RowFormat.HeightRule property

Gets or sets the rule for determining the height of the table row.

```csharp
public HeightRule HeightRule { get; set; }
```

## Examples

Shows how to format rows with a document builder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Row 1, cell 1.");

// Start a second row, and then configure its height. The builder will apply these settings to
// its current row, as well as any new rows it creates afterwards.
builder.EndRow();

RowFormat rowFormat = builder.RowFormat;
rowFormat.Height = 100;
rowFormat.HeightRule = HeightRule.Exactly;

builder.InsertCell();
builder.Write("Row 2, cell 1.");
builder.EndTable();

// The first row was unaffected by the padding reconfiguration and still holds the default values.
Assert.That(table.Rows[0].RowFormat.Height, Is.EqualTo(0.0d));
Assert.That(table.Rows[0].RowFormat.HeightRule, Is.EqualTo(HeightRule.Auto));

Assert.That(table.Rows[1].RowFormat.Height, Is.EqualTo(100.0d));
Assert.That(table.Rows[1].RowFormat.HeightRule, Is.EqualTo(HeightRule.Exactly));

doc.Save(ArtifactsDir + "DocumentBuilder.SetRowFormatting.docx");
```

Shows how to create a formatted table using DocumentBuilder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
table.LeftIndent = 20;

// Set some formatting options for text and table appearance.
builder.RowFormat.Height = 40;
builder.RowFormat.HeightRule = HeightRule.AtLeast;
builder.CellFormat.Shading.BackgroundPatternColor = Color.FromArgb(198, 217, 241);

builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;
builder.Font.Size = 16;
builder.Font.Name = "Arial";
builder.Font.Bold = true;

// Configuring the formatting options in a document builder will apply them
// to the current cell/row its cursor is in,
// as well as any new cells and rows created using that builder.
builder.Write("Header Row,\n Cell 1");
builder.InsertCell();
builder.Write("Header Row,\n Cell 2");
builder.InsertCell();
builder.Write("Header Row,\n Cell 3");
builder.EndRow();

// Reconfigure the builder's formatting objects for new rows and cells that we are about to make.
// The builder will not apply these to the first row already created so that it will stand out as a header row.
builder.CellFormat.Shading.BackgroundPatternColor = Color.White;
builder.CellFormat.VerticalAlignment = CellVerticalAlignment.Center;
builder.RowFormat.Height = 30;
builder.RowFormat.HeightRule = HeightRule.Auto;
builder.InsertCell();
builder.Font.Size = 12;
builder.Font.Bold = false;

builder.Write("Row 1, Cell 1.");
builder.InsertCell();
builder.Write("Row 1, Cell 2.");
builder.InsertCell();
builder.Write("Row 1, Cell 3.");
builder.EndRow();
builder.InsertCell();
builder.Write("Row 2, Cell 1.");
builder.InsertCell();
builder.Write("Row 2, Cell 2.");
builder.InsertCell();
builder.Write("Row 2, Cell 3.");
builder.EndRow();
builder.EndTable();

doc.Save(ArtifactsDir + "DocumentBuilder.CreateFormattedTable.docx");
```

### See Also

* enum [HeightRule](../../../aspose.words/heightrule/)
* class [RowFormat](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
