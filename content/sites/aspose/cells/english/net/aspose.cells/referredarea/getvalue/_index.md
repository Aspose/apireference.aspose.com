---
title: ReferredArea.GetValue
second_title: Aspose.Cells for .NET API Reference
description: ReferredArea method. Gets cell value with given offset from the topleft of this area
type: docs
url: /net/aspose.cells/referredarea/getvalue/
---
## GetValue(int, int) {#getvalue}

Gets cell value with given offset from the top-left of this area.

```csharp
public object GetValue(int rowOffset, int colOffset)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rowOffset | Int32 | row offset from the start row of this area |
| colOffset | Int32 | column offset from the start row of this area |

### Return Value

"#REF!" if this area is invalid; "#N/A" if given offset out of this area; Otherwise return the cell value at given position.

### See Also

* class [ReferredArea](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## GetValue(int, int, bool) {#getvalue_1}

Gets cell value with given offset from the top-left of this area.

```csharp
public object GetValue(int rowOffset, int colOffset, bool calculateFormulas)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rowOffset | Int32 | row offset from the start row of this area |
| colOffset | Int32 | column offset from the start row of this area |
| calculateFormulas | Boolean | Whether calculate it recursively if the specified reference is formula |

### Return Value

"#REF!" if this area is invalid; "#N/A" if given offset out of this area; Otherwise return the cell value at given position.

### See Also

* class [ReferredArea](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


