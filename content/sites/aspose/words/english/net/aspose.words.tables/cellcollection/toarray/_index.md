---
title: CellCollection.ToArray
linktitle: ToArray
articleTitle: ToArray
second_title: Aspose.Words for .NET
description: Effortlessly convert your CellCollection to a new array with the ToArray method, streamlining data management and enhancing performance.
type: docs
weight: 20
url: /net/aspose.words.tables/cellcollection/toarray/
---
## CellCollection.ToArray method

Copies all cells from the collection to a new array of cells.

```csharp
public Cell[] ToArray()
```

### Return Value

An array of cells.

## Examples

Shows how to iterate through all tables in the document and print the contents of each cell.

```csharp
Document doc = new Document(MyDir + "Tables.docx");
TableCollection tables = doc.FirstSection.Body.Tables;

Assert.That(tables.ToArray().Length, Is.EqualTo(2));

for (int i = 0; i < tables.Count; i++)
{
    Console.WriteLine($"Start of Table {i}");

    RowCollection rows = tables[i].Rows;

    // We can use the "ToArray" method on a row collection to clone it into an array.
    Assert.That(rows.ToArray(), Is.EqualTo(rows));
    Assert.That(rows.ToArray(), Is.Not.SameAs(rows));

    for (int j = 0; j < rows.Count; j++)
    {
        Console.WriteLine($"\tStart of Row {j}");

        CellCollection cells = rows[j].Cells;

        // We can use the "ToArray" method on a cell collection to clone it into an array.
        Assert.That(cells.ToArray(), Is.EqualTo(cells));
        Assert.That(cells.ToArray(), Is.Not.SameAs(cells));

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

* class [Cell](../../cell/)
* class [CellCollection](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
