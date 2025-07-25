---
title: HTMLTableElement.InsertRow
second_title: Aspose.HTML for .NET API Reference
description: HTMLTableElement InsertRow method. Insert a new empty row in the table. The new row is inserted immediately before and in the same section as the current indexth row in the table. If index is -1 or equal to the number of rows the new row is appended. In addition when the table is empty the row is inserted into a TBODY which is created and inserted into the table.A table row cannot be empty according to HTML 4.01
type: docs
weight: 220
url: /net/aspose.html/htmltableelement/insertrow/
---
## HTMLTableElement.InsertRow method

Insert a new empty row in the table. The new row is inserted immediately before and in the same section as the current `index`th row in the table. If `index` is -1 or equal to the number of rows, the new row is appended. In addition, when the table is empty the row is inserted into a `TBODY` which is created and inserted into the table.A table row cannot be empty according to [[HTML 4.01](http://www.w3.org/TR/1999/REC-html401-19991224)].

```csharp
public Node InsertRow(int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The row number where to insert a new row. This index starts from 0 and is relative to the logical order (not document order) of all the rows contained inside the table. |

### Return Value

The newly created row.

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | INDEX_SIZE_ERR: Raised if the specified index is greater than the number of rows or if the index is a negative number other than -1. @version DOM Level 2 |

### See Also

* class [Node](../../../aspose.html.dom/node/)
* class [HTMLTableElement](../)
* namespace [Aspose.Html](../../../aspose.html/)
* assembly [Aspose.HTML](../../../)
