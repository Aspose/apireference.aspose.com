---
title: Cells.GetDependentsInCalculation
second_title: Aspose.Cells for .NET API Reference
description: Cells method. Gets all cells whose calculated result depends on specific cell
type: docs
url: /net/aspose.cells/cells/getdependentsincalculation/
---
## Cells.GetDependentsInCalculation method

Gets all cells whose calculated result depends on specific cell.

```csharp
public IEnumerator GetDependentsInCalculation(int row, int column, bool recursive)
```

| Parameter | Type | Description |
| --- | --- | --- |
| row | Int32 | Row index of the specific cell |
| column | Int32 | Column index of the specific cell. |
| recursive | Boolean | Whether returns those dependents which do not reference to the specific cell directly but reference to other leafs of that cell. |

### Return Value

Enumerator to enumerate all dependents(Cell objects)

### Remarks

To use this method, please make sure the workbook has been set with true value for [`EnableCalculationChain`](../../formulasettings/enablecalculationchain/) and has been fully calculated with this setting. If there is no formula reference to this cell, null will be returned. For more details and example, please see [`GetDependentsInCalculation`](../../cell/getdependentsincalculation/)

### See Also

* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


