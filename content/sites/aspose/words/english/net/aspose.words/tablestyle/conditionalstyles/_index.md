---
title: TableStyle.ConditionalStyles
linktitle: ConditionalStyles
articleTitle: ConditionalStyles
second_title: Aspose.Words for .NET
description: Discover the TableStyle ConditionalStyles property—customize your table with unique conditional styles for enhanced visual appeal and functionality.
type: docs
weight: 70
url: /net/aspose.words/tablestyle/conditionalstyles/
---
## TableStyle.ConditionalStyles property

Collection of conditional styles that may be defined for this table style.

```csharp
public ConditionalStyleCollection ConditionalStyles { get; }
```

## Examples

Shows how to work with certain area styles of a table.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Cell 1");
builder.InsertCell();
builder.Write("Cell 2");
builder.EndRow();
builder.InsertCell();
builder.Write("Cell 3");
builder.InsertCell();
builder.Write("Cell 4");
builder.EndTable();

// Create a custom table style.
TableStyle tableStyle = (TableStyle)doc.Styles.Add(StyleType.Table, "MyTableStyle1");

// Conditional styles are formatting changes that affect only some of the table's cells
// based on a predicate, such as the cells being in the last row.
// Below are three ways of accessing a table style's conditional styles from the "ConditionalStyles" collection.
// 1 -  By style type:
tableStyle.ConditionalStyles[ConditionalStyleType.FirstRow].Shading.BackgroundPatternColor = Color.AliceBlue;

// 2 -  By index:
tableStyle.ConditionalStyles[0].Borders.Color = Color.Black;
tableStyle.ConditionalStyles[0].Borders.LineStyle = LineStyle.DotDash;
Assert.That(tableStyle.ConditionalStyles[0].Type, Is.EqualTo(ConditionalStyleType.FirstRow));

// 3 -  As a property:
tableStyle.ConditionalStyles.FirstRow.ParagraphFormat.Alignment = ParagraphAlignment.Center;

// Apply padding and text formatting to conditional styles.
tableStyle.ConditionalStyles.LastRow.BottomPadding = 10;
tableStyle.ConditionalStyles.LastRow.LeftPadding = 10;
tableStyle.ConditionalStyles.LastRow.RightPadding = 10;
tableStyle.ConditionalStyles.LastRow.TopPadding = 10;
tableStyle.ConditionalStyles.LastColumn.Font.Bold = true;

// List all possible style conditions.
using (IEnumerator<ConditionalStyle> enumerator = tableStyle.ConditionalStyles.GetEnumerator())
{
    while (enumerator.MoveNext())
    {
        ConditionalStyle currentStyle = enumerator.Current;
        if (currentStyle != null) Console.WriteLine(currentStyle.Type);
    }
}

// Apply the custom style, which contains all conditional styles, to the table.
table.Style = tableStyle;

// Our style applies some conditional styles by default.
Assert.That(table.StyleOptions, Is.EqualTo(TableStyleOptions.FirstRow | TableStyleOptions.FirstColumn | TableStyleOptions.RowBands));

// We will need to enable all other styles ourselves via the "StyleOptions" property.
table.StyleOptions = table.StyleOptions | TableStyleOptions.LastRow | TableStyleOptions.LastColumn;

doc.Save(ArtifactsDir + "Table.ConditionalStyles.docx");
```

### See Also

* class [ConditionalStyleCollection](../../conditionalstylecollection/)
* class [TableStyle](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
