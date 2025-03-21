---
title: TextColumnCollection.SetCount
linktitle: SetCount
articleTitle: SetCount
second_title: Aspose.Words for .NET
description: Optimize your layout with the TextColumnCollection SetCount method, effortlessly arranging text into your desired number of columns for enhanced readability.
type: docs
weight: 70
url: /net/aspose.words/textcolumncollection/setcount/
---
## TextColumnCollection.SetCount method

Arranges text into the specified number of text columns.

```csharp
public void SetCount(int newCount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| newCount | Int32 | The number of columns the text is to be arranged into. |

## Remarks

When [`EvenlySpaced`](../evenlyspaced/) is `false` and you increase the number of columns, new [`TextColumn`](../../textcolumn/) objects are created with zero width and spacing. You need to set width and spacing for the new columns.

## Examples

Shows how to create multiple evenly spaced columns in a section.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

TextColumnCollection columns = builder.PageSetup.TextColumns;
columns.Spacing = 100;
columns.SetCount(2);

builder.Writeln("Column 1.");
builder.InsertBreak(BreakType.ColumnBreak);
builder.Writeln("Column 2.");

doc.Save(ArtifactsDir + "PageSetup.ColumnsSameWidth.docx");
```

### See Also

* class [TextColumnCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
