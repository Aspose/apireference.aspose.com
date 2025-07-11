---
title: TableStyle.BottomPadding
linktitle: BottomPadding
articleTitle: BottomPadding
second_title: Aspose.Words for .NET
description: Discover the TableStyle BottomPadding property, customize your table cell spacing for enhanced layout and readability. Optimize your design effortlessly!
type: docs
weight: 40
url: /net/aspose.words/tablestyle/bottompadding/
---
## TableStyle.BottomPadding property

Gets or sets the amount of space (in points) to add below the contents of table cells.

```csharp
public double BottomPadding { get; set; }
```

## Examples

Shows how to create custom style settings for the table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Name");
builder.InsertCell();
builder.Write("مرحبًا");
builder.EndRow();
builder.InsertCell();
builder.InsertCell();
builder.EndTable();

TableStyle tableStyle = (TableStyle)doc.Styles.Add(StyleType.Table, "MyTableStyle1");
tableStyle.AllowBreakAcrossPages = true;
tableStyle.Bidi = true;
tableStyle.CellSpacing = 5;
tableStyle.BottomPadding = 20;
tableStyle.LeftPadding = 5;
tableStyle.RightPadding = 10;
tableStyle.TopPadding = 20;
tableStyle.Shading.BackgroundPatternColor = Color.AntiqueWhite;
tableStyle.Borders.Color = Color.Blue;
tableStyle.Borders.LineStyle = LineStyle.DotDash;
tableStyle.VerticalAlignment = CellVerticalAlignment.Center;

table.Style = tableStyle;

// Setting the style properties of a table may affect the properties of the table itself.
Assert.That(table.Bidi, Is.True);
Assert.That(table.CellSpacing, Is.EqualTo(5.0d));
Assert.That(table.StyleName, Is.EqualTo("MyTableStyle1"));

doc.Save(ArtifactsDir + "Table.TableStyleCreation.docx");
```

### See Also

* class [TableStyle](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
