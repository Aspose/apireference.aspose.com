---
title: Table.FirstRow
linktitle: FirstRow
articleTitle: FirstRow
second_title: Aspose.Words for .NET
description: Discover the FirstRow property of tables, effortlessly access the first row node for streamlined data management and enhanced table functionality.
type: docs
weight: 160
url: /net/aspose.words.tables/table/firstrow/
---
## Table.FirstRow property

Returns the first [`Row`](../../row/) node in the table.

```csharp
public Row FirstRow { get; }
```

## Examples

Shows how to remove the first and last rows of all tables in a document.

```csharp
Document doc = new Document(MyDir + "Tables.docx");

TableCollection tables = doc.FirstSection.Body.Tables;

Assert.That(tables[0].Rows.Count, Is.EqualTo(5));
Assert.That(tables[1].Rows.Count, Is.EqualTo(4));

foreach (Table table in tables.OfType<Table>())
{
    table.FirstRow?.Remove();
    table.LastRow?.Remove();
}

Assert.That(tables[0].Rows.Count, Is.EqualTo(3));
Assert.That(tables[1].Rows.Count, Is.EqualTo(2));
```

Shows how to combine the rows from two tables into one.

```csharp
Document doc = new Document(MyDir + "Tables.docx");

// Below are two ways of getting a table from a document.
// 1 -  From the "Tables" collection of a Body node:
Table firstTable = doc.FirstSection.Body.Tables[0];

// 2 -  Using the "GetChild" method:
Table secondTable = (Table)doc.GetChild(NodeType.Table, 1, true);

// Append all rows from the current table to the next.
while (secondTable.HasChildNodes)
    firstTable.Rows.Add(secondTable.FirstRow);

// Remove the empty table container.
secondTable.Remove();

doc.Save(ArtifactsDir + "Table.CombineTables.docx");
```

### See Also

* class [Row](../../row/)
* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
