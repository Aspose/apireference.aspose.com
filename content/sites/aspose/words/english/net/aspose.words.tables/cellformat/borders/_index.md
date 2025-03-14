---
title: CellFormat.Borders
linktitle: Borders
articleTitle: Borders
second_title: Aspose.Words for .NET
description: Discover the CellFormat Borders property to access and customize cell border collections for enhanced spreadsheet design and functionality.
type: docs
weight: 10
url: /net/aspose.words.tables/cellformat/borders/
---
## CellFormat.Borders property

Gets collection of borders of the cell.

```csharp
public BorderCollection Borders { get; }
```

## Examples

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

* class [BorderCollection](../../../aspose.words/bordercollection/)
* class [CellFormat](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
