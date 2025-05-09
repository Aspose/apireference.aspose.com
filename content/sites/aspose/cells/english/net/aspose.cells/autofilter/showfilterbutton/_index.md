---
title: AutoFilter.ShowFilterButton
second_title: Aspose.Cells for .NET API Reference
description: AutoFilter property. Indicates whether the AutoFilter button for this column is visible
type: docs
url: /net/aspose.cells/autofilter/showfilterbutton/
---
## AutoFilter.ShowFilterButton property

Indicates whether the AutoFilter button for this column is visible.

```csharp
public bool ShowFilterButton { get; set; }
```

### Examples

```csharp
// Called: Assert.IsTrue(table.AutoFilter.ShowFilterButton);
[Test]
        public void Property_ShowFilterButton()
        {
            Workbook workbook = new Workbook(Constants.sourcePath + "CELLSNET47848.xlsx");
            ListObject table = workbook.Worksheets[0].ListObjects[0];
            table.AutoFilter.ShowFilterButton = true;

            workbook.Save(Constants.destPath + "CellsNet47848.xlsx");
            workbook = new Workbook(Constants.destPath + "CellsNet47848.xlsx");
            table = workbook.Worksheets[0].ListObjects[0];
            Assert.IsTrue(table.AutoFilter.ShowFilterButton);
            table.AutoFilter.ShowFilterButton = false;
            workbook.Save(Constants.destPath + "CellsNet47848.xlsx");
            workbook = new Workbook(Constants.destPath + "CellsNet47848.xlsx");
            table = workbook.Worksheets[0].ListObjects[0];
            Assert.IsFalse(table.AutoFilter.ShowFilterButton);
        }
```

### See Also

* class [AutoFilter](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


