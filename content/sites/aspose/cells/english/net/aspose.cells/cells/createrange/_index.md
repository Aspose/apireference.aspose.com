---
title: Cells.CreateRange
second_title: Aspose.Cells for .NET API Reference
description: Cells method. Creates a Range object from a range of cells
type: docs
url: /net/aspose.cells/cells/createrange/
---
## CreateRange(string, string) {#createrange_3}

Creates a [`Range`](../../range/) object from a range of cells.

```csharp
public Range CreateRange(string upperLeftCell, string lowerRightCell)
```

| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftCell | String | Upper left cell name. |
| lowerRightCell | String | Lower right cell name. |

### Return Value

A [`Range`](../../range/) object

### See Also

* class [Range](../../range/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## CreateRange(int, int, int, int) {#createrange_1}

Creates a [`Range`](../../range/) object from a range of cells.

```csharp
public Range CreateRange(int firstRow, int firstColumn, int totalRows, int totalColumns)
```

| Parameter | Type | Description |
| --- | --- | --- |
| firstRow | Int32 | First row of this range |
| firstColumn | Int32 | First column of this range |
| totalRows | Int32 | Number of rows |
| totalColumns | Int32 | Number of columns |

### Return Value

A [`Range`](../../range/) object

### See Also

* class [Range](../../range/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## CreateRange(string) {#createrange_2}

Creates a [`Range`](../../range/) object from an address of the range.

```csharp
public Range CreateRange(string address)
```

| Parameter | Type | Description |
| --- | --- | --- |
| address | String | The address of the range. |

### Return Value

A [`Range`](../../range/) object

### See Also

* class [Range](../../range/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## CreateRange(int, int, bool) {#createrange}

Creates a [`Range`](../../range/) object from rows of cells or columns of cells.

```csharp
public Range CreateRange(int firstIndex, int number, bool isVertical)
```

| Parameter | Type | Description |
| --- | --- | --- |
| firstIndex | Int32 | First row index or first column index, zero based. |
| number | Int32 | Total number of rows or columns, one based. |
| isVertical | Boolean | True - Range created from columns of cells. False - Range created from rows of cells. |

### Return Value

A [`Range`](../../range/) object.

### See Also

* class [Range](../../range/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


