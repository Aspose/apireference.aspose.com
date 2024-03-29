---
title: Row.GetEnumerator
second_title: Aspose.Cells for .NET API Reference
description: Row method. Gets the cells enumerator
type: docs
url: /net/aspose.cells/row/getenumerator/
---
## GetEnumerator() {#getenumerator}

Gets the cells enumerator

```csharp
public IEnumerator GetEnumerator()
```

### Return Value

The cells enumerator

### Examples

```csharp
[C#]
Workbook workbook = new Workbook("template.xlsx");
Cells cells = workbook.Worksheets[0].Cells;

IEnumerator en = cells.Rows[1].GetEnumerator();
while (en.MoveNext())
{
    Cell cell = (Cell)en.Current;
    Console.WriteLine(cell.Name + ": " + cell.Value);
}
```

### See Also

* class [Row](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## GetEnumerator(bool, bool) {#getenumerator_1}

Gets an enumerator that iterates cells through this row.

```csharp
public IEnumerator GetEnumerator(bool reversed, bool sync)
```

| Parameter | Type | Description |
| --- | --- | --- |
| reversed | Boolean | whether enumerate cells in reversed order |
| sync | Boolean | whether the returned enumerator should check the modification of cells in this row and keep synchronized with it. |

### Return Value

The cell enumerator

### Remarks

If the row will be modified(by operations that may cause new Cell be instantiated or existing Cell be removed) during the traversal with the enumerator, synchronized enumerator should be used instead of normal enumerator so that the traversal can continue from the position just after the one has been traversed by the last MoveNext(). However, together with the advantage that no element be skipped or traversed repeatedly, the disadvantage for synchronized enumerator is that the performance will be degraded a bit when comparing with normal enumerator.

### See Also

* class [Row](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


