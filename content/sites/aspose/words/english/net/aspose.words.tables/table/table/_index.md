---
title: Table
linktitle: Table
articleTitle: Table
second_title: Aspose.Words for .NET
description: Create custom tables effortlessly with our intuitive Table Constructor. Build, customize, and optimize your data display in minutes!
type: docs
weight: 10
url: /net/aspose.words.tables/table/table/
---
## Table constructor

Initializes a new instance of the [`Table`](../) class.

```csharp
public Table(DocumentBase doc)
```

| Parameter | Type | Description |
| --- | --- | --- |
| doc | DocumentBase | The owner document. |

## Remarks

When [`Table`](../) is created, it belongs to the specified document, but is not yet part of the document and [`ParentNode`](../../../aspose.words/node/parentnode/) is `null`.

To append [`Table`](../) to the document use [`InsertAfter`](../../../aspose.words/compositenode/insertafter/) or [`InsertBefore`](../../../aspose.words/compositenode/insertbefore/) on the story where you want the table inserted.

## Examples

Shows how to create a table.

```csharp
Document doc = new Document();
Table table = new Table(doc);
doc.FirstSection.Body.AppendChild(table);

// Tables contain rows, which contain cells, which may have paragraphs
// with typical elements such as runs, shapes, and even other tables.
// Calling the "EnsureMinimum" method on a table will ensure that
// the table has at least one row, cell, and paragraph.
Row firstRow = new Row(doc);
table.AppendChild(firstRow);

Cell firstCell = new Cell(doc);
firstRow.AppendChild(firstCell);

Paragraph paragraph = new Paragraph(doc);
firstCell.AppendChild(paragraph);

// Add text to the first cell in the first row of the table.
Run run = new Run(doc, "Hello world!");
paragraph.AppendChild(run);

doc.Save(ArtifactsDir + "Table.CreateTable.docx");
```

Shows how to build a nested table without using a document builder.

```csharp
public void CreateNestedTable()
{
    Document doc = new Document();

    // Create the outer table with three rows and four columns, and then add it to the document.
    Table outerTable = CreateTable(doc, 3, 4, "Outer Table");
    doc.FirstSection.Body.AppendChild(outerTable);

    // Create another table with two rows and two columns and then insert it into the first table's first cell.
    Table innerTable = CreateTable(doc, 2, 2, "Inner Table");
    outerTable.FirstRow.FirstCell.AppendChild(innerTable);

    doc.Save(ArtifactsDir + "Table.CreateNestedTable.docx");
}

/// <summary>
/// Creates a new table in the document with the given dimensions and text in each cell.
/// </summary>
private static Table CreateTable(Document doc, int rowCount, int cellCount, string cellText)
{
    Table table = new Table(doc);

    for (int rowId = 1; rowId <= rowCount; rowId++)
    {
        Row row = new Row(doc);
        table.AppendChild(row);

        for (int cellId = 1; cellId <= cellCount; cellId++)
        {
            Cell cell = new Cell(doc);
            cell.AppendChild(new Paragraph(doc));
            cell.FirstParagraph.AppendChild(new Run(doc, cellText));

            row.AppendChild(cell);
        }
    }

    // You can use the "Title" and "Description" properties to add a title and description respectively to your table.
    // The table must have at least one row before we can use these properties.
    // These properties are meaningful for ISO / IEC 29500 compliant .docx documents (see the OoxmlCompliance class).
    // If we save the document to pre-ISO/IEC 29500 formats, Microsoft Word ignores these properties.
    table.Title = "Aspose table title";
    table.Description = "Aspose table description";

    return table;
}
```

### See Also

* class [DocumentBase](../../../aspose.words/documentbase/)
* class [Table](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)
