---
title: PivotTable.ShowColumnGrandTotals
second_title: Aspose.Cells for .NET API Reference
description: PivotTable property. Indicates whether to show grand totals for columns of this pivot table
type: docs
url: /net/aspose.cells.pivot/pivottable/showcolumngrandtotals/
---
## PivotTable.ShowColumnGrandTotals property

Indicates whether to show grand totals for columns of this pivot table.

```csharp
public bool ShowColumnGrandTotals { get; set; }
```

### Examples

```csharp
// Called: Assert.IsFalse(workbook.Worksheets[0].PivotTables[0].ShowColumnGrandTotals);
[Test]
        public void Property_ShowColumnGrandTotals()
        {
            Workbook workbook = new Workbook(Constants.sourcePath + "CELLSNET58036.xls");
            Assert.IsTrue(workbook.Worksheets[0].PivotTables[0].ShowRowGrandTotals);
            Assert.IsFalse(workbook.Worksheets[0].PivotTables[0].ShowColumnGrandTotals);
            workbook.Save(Constants.destPath + "CELLSNET58036.xlsx");
            workbook = new Workbook(Constants.destPath + "CELLSNET58036.xlsx");
            Assert.IsTrue(workbook.Worksheets[0].PivotTables[0].ShowRowGrandTotals);
            Assert.IsFalse(workbook.Worksheets[0].PivotTables[0].ShowColumnGrandTotals);
            workbook.Save(Constants.destPath + "CELLSNET58036.xlsb");
            workbook = new Workbook(Constants.destPath + "CELLSNET58036.xlsb");
            Assert.IsTrue(workbook.Worksheets[0].PivotTables[0].ShowRowGrandTotals);
            Assert.IsFalse(workbook.Worksheets[0].PivotTables[0].ShowColumnGrandTotals);
            workbook.Save(Constants.destPath + "CELLSNET58036.xls");
            workbook = new Workbook(Constants.destPath + "CELLSNET58036.xls");
            Assert.IsTrue(workbook.Worksheets[0].PivotTables[0].ShowRowGrandTotals);
            Assert.IsFalse(workbook.Worksheets[0].PivotTables[0].ShowColumnGrandTotals);
        }
```

### See Also

* class [PivotTable](../)
* namespace [Aspose.Cells.Pivot](../../../aspose.cells.pivot/)
* assembly [Aspose.Cells](../../../)


