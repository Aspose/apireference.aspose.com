---
title: Row.Cells
linktitle: Cells
articleTitle: Cells
second_title: Aspose.Words for .NET
description: Access Row Cells effortlessly with typed controls for seamless management of child nodes, enhancing your data manipulation experience.
type: docs
weight: 20
url: /net/aspose.words.tables/row/cells/
---
## Row.Cells property

Provides typed access to the [`Cell`](../../cell/) child nodes of the row.

```csharp
public CellCollection Cells { get; }
```

## Examples

Shows how to iterate through all tables in the document and print the contents of each cell.

```csharp
Document doc = new Document(MyDir + "Tables.docx");
TableCollection tables = doc.FirstSection.Body.Tables;

Assert.AreEqual(2, tables.ToArray().Length);

for (int i = 0; i < tables.Count; i++)
{
    Console.WriteLine($"Start of Table {i}");

    RowCollection rows = tables[i].Rows;

    // We can use the "ToArray" method on a row collection to clone it into an array.
    Assert.AreEqual(rows, rows.ToArray());
    Assert.AreNotSame(rows, rows.ToArray());

    for (int j = 0; j < rows.Count; j++)
    {
        Console.WriteLine($"\tStart of Row {j}");

        CellCollection cells = rows[j].Cells;

        // We can use the "ToArray" method on a cell collection to clone it into an array.
        Assert.AreEqual(cells, cells.ToArray());
        Assert.AreNotSame(cells, cells.ToArray());

        for (int k = 0; k < cells.Count; k++)
        {
            string cellText = cells[k].ToString(SaveFormat.Text).Trim();
            Console.WriteLine($"\t\tContents of Cell:{k} = \"{cellText}\"");
        }

        Console.WriteLine($"\tEnd of Row {j}");
    }

    Console.WriteLine($"End of Table {i}\n");
}
```

### See Also

* class [CellCollection](../../cellcollection/)
* class [Row](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
