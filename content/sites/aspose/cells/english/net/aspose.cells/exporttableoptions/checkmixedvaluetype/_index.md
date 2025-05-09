---
title: ExportTableOptions.CheckMixedValueType
second_title: Aspose.Cells for .NET API Reference
description: ExportTableOptions property. False Aspose.Cells will set the DataColumns type by the value type of the first row for performance. True Aspose.Cells will check whether the value type in the column are mixed before set the DataColumns type And the value type are mixed the DataColumns type will be string
type: docs
url: /net/aspose.cells/exporttableoptions/checkmixedvaluetype/
---
## ExportTableOptions.CheckMixedValueType property

False, Aspose.Cells will set the DataColumn's type by the value type of the first row for performance. True, Aspose.Cells will check whether the value type in the column are mixed before set the DataColumn's type And the value type are mixed, the DataColumn's type will be string.

```csharp
public bool CheckMixedValueType { get; set; }
```

### Examples

```csharp
// Called: options.CheckMixedValueType = true;
[Test]
        public void Property_CheckMixedValueType()
        {
            Workbook wb = new Workbook(Constants.sourcePath + "CellsNet53962.xlsx");
            ExportTableOptions options = new ExportTableOptions();
            options.CheckMixedValueType = true;
            options.ExportColumnName = true;
            DataTable dt = wb.Worksheets[0].Cells.ExportDataTable(1, 0, 5, 8, options);
            Assert.AreEqual(typeof(double), dt.Columns[2].DataType);
        }
```

### See Also

* class [ExportTableOptions](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


