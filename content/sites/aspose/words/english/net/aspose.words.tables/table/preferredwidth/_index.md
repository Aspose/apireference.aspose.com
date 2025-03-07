---
title: Table.PreferredWidth
linktitle: PreferredWidth
articleTitle: PreferredWidth
second_title: Aspose.Words for .NET
description: Discover how to use the Table PreferredWidth property to easily set and optimize your table's layout for enhanced design and user experience.
type: docs
weight: 220
url: /net/aspose.words.tables/table/preferredwidth/
---
## Table.PreferredWidth property

Gets or sets the table preferred width.

```csharp
public PreferredWidth PreferredWidth { get; set; }
```

## Remarks

The default value is [`Auto`](../../preferredwidth/auto/).

## Examples

Shows how to set a table to auto fit to 50% of the width of the page.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Cell #1");
builder.InsertCell();
builder.Write("Cell #2");
builder.InsertCell();
builder.Write("Cell #3");

table.PreferredWidth = PreferredWidth.FromPercent(50);

doc.Save(ArtifactsDir + "DocumentBuilder.InsertTableWithPreferredWidth.docx");
```

### See Also

* class [PreferredWidth](../../preferredwidth/)
* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
