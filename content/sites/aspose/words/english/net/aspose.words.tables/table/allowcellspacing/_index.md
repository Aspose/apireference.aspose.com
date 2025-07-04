---
title: Table.AllowCellSpacing
linktitle: AllowCellSpacing
articleTitle: AllowCellSpacing
second_title: Aspose.Words for .NET
description: Discover the Table AllowCellSpacing property to easily manage cell spacing in your layouts. Enhance your design with customizable options!
type: docs
weight: 60
url: /net/aspose.words.tables/table/allowcellspacing/
---
## Table.AllowCellSpacing property

Gets or sets the "Allow spacing between cells" option.

```csharp
public bool AllowCellSpacing { get; set; }
```

## Examples

Shows how to enable spacing between individual cells in a table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Animal");
builder.InsertCell();
builder.Write("Class");
builder.EndRow();
builder.InsertCell();
builder.Write("Dog");
builder.InsertCell();
builder.Write("Mammal");
builder.EndTable();

table.CellSpacing = 3;

// Set the "AllowCellSpacing" property to "true" to enable spacing between cells
// with a magnitude equal to the value of the "CellSpacing" property, in points.
// Set the "AllowCellSpacing" property to "false" to disable cell spacing
// and ignore the value of the "CellSpacing" property.
table.AllowCellSpacing = allowCellSpacing;

doc.Save(ArtifactsDir + "Table.AllowCellSpacing.html");

// Adjusting the "CellSpacing" property will automatically enable cell spacing.
table.CellSpacing = 5;

Assert.That(table.AllowCellSpacing, Is.True);
```

### See Also

* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
