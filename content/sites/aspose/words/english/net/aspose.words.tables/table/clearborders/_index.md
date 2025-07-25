---
title: Table.ClearBorders
linktitle: ClearBorders
articleTitle: ClearBorders
second_title: Aspose.Words for .NET
description: Discover the Table ClearBorders method to effortlessly eliminate all table and cell borders, enhancing your design's clarity and appeal.
type: docs
weight: 390
url: /net/aspose.words.tables/table/clearborders/
---
## Table.ClearBorders method

Removes all table and cell borders on this table.

```csharp
public void ClearBorders()
```

## Examples

Shows how to apply an outline border to a table.

```csharp
Document doc = new Document(MyDir + "Tables.docx");
Table table = doc.FirstSection.Body.Tables[0];

// Align the table to the center of the page.
table.Alignment = TableAlignment.Center;

// Clear any existing borders and shading from the table.
table.ClearBorders();
table.ClearShading();

// Add green borders to the outline of the table.
table.SetBorder(BorderType.Left, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Right, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Top, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Bottom, LineStyle.Single, 1.5, Color.Green, true);

// Fill the cells with a light green solid color.
table.SetShading(TextureIndex.TextureSolid, Color.LightGreen, Color.Empty);

doc.Save(ArtifactsDir + "Table.SetOutlineBorders.docx");
```

Shows how to remove all borders from a table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Hello world!");
builder.EndTable();

// Modify the color and thickness of the top border.
Border topBorder = table.FirstRow.RowFormat.Borders[BorderType.Top];
table.SetBorder(BorderType.Top, LineStyle.Double, 1.5, Color.Red, true);

Assert.That(topBorder.LineWidth, Is.EqualTo(1.5d));
Assert.That(topBorder.Color.ToArgb(), Is.EqualTo(Color.Red.ToArgb()));
Assert.That(topBorder.LineStyle, Is.EqualTo(LineStyle.Double));

// Clear the borders of all cells in the table, and then save the document.
table.ClearBorders();
doc.Save(ArtifactsDir + "Table.ClearBorders.docx");

// Verify the values of the table's properties after re-opening the document.
doc = new Document(ArtifactsDir + "Table.ClearBorders.docx");
table = doc.FirstSection.Body.Tables[0];
topBorder = table.FirstRow.RowFormat.Borders[BorderType.Top];

Assert.That(topBorder.LineWidth, Is.EqualTo(0.0d));
Assert.That(topBorder.Color.ToArgb(), Is.EqualTo(Color.Empty.ToArgb()));
Assert.That(topBorder.LineStyle, Is.EqualTo(LineStyle.None));
```

### See Also

* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
