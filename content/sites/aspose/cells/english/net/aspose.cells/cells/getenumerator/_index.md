---
title: Cells.GetEnumerator
second_title: Aspose.Cells for .NET API Reference
description: Cells method. Gets the cells enumerator
type: docs
url: /net/aspose.cells/cells/getenumerator/
---
## Cells.GetEnumerator method

Gets the cells enumerator.

```csharp
public IEnumerator GetEnumerator()
```

### Return Value

The cells enumerator

### Remarks

When traversing elements by the returned Enumerator, the cells collection should not be modified(such as operations that will cause new Cell/Row be instantiated or existing Cell/Row be deleted). Otherwise the enumerator may not be able to traverse all cells correctly(some elements may be traversed repeatedly or skipped).

### Examples

```csharp
[C#]
Workbook workbook = new Workbook("template.xlsx");
Cells cells = workbook.Worksheets[0].Cells;

IEnumerator en = cells.GetEnumerator();
while (en.MoveNext())
{
    Cell cell = (Cell)en.Current;
    Console.WriteLine(cell.Name + ": " + cell.Value);
}
```

### See Also

* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


