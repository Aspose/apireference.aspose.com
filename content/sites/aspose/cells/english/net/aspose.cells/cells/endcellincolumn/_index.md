---
title: Cells.EndCellInColumn
second_title: Aspose.Cells for .NET API Reference
description: Cells method. Gets the last cell in this column
type: docs
url: /net/aspose.cells/cells/endcellincolumn/
---
## EndCellInColumn(int) {#endcellincolumn}

Gets the last cell in this column.

```csharp
public Cell EndCellInColumn(int columnIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| columnIndex | Int32 | Column index. |

### Return Value

Cell object.

### Examples

```csharp
// Called: Cell lastDCell = wb_demo.Worksheets[0].Cells.EndCellInColumn((short)0);
[Test]
        public void Method_Int32_()
        {
            string filePath = Constants.PivotTableSourcePath + @"JAVA41817_";

            Workbook wb_demo = new Workbook(filePath + "Book2.xlsx");
            PivotTable pt_demo = wb_demo.Worksheets[0].PivotTables[0];
            pt_demo.ColumnFields[0].ShowAllItems = true;
            pt_demo.DataFields[0].ShowAllItems = true;

            PivotField src_t_field = pt_demo.PageFields[0];
            src_t_field.IsMultipleItemSelectionAllowed = true;
            //pt_demo.getColumnFields().get(0).setShowAllItems(true); 

            pt_demo.RefreshData();

            PivotItemCollection collection_src_t = src_t_field.PivotItems;

            for (int i = 0; i < collection_src_t.Count; i++)
            {
                PivotItem item = collection_src_t[i];
                Console.WriteLine(item.Name);
                if ((item.Name != null) && item.Name.Equals("CCC"))
                {
                    Console.WriteLine(item.Name + " src selected");
                    item.IsHidden = false;
                }
                else
                {
                    item.IsHidden = true;
                }
            }
            pt_demo.RefreshData();
            pt_demo.CalculateData();

            for (int i = 0; i < pt_demo.BaseFields.Count; i++)
            {
                pt_demo.BaseFields[i].ShowAllItems = true;
                Console.WriteLine(pt_demo.BaseFields[i].Name);
            }
            /* 
            pt_demo.getColumnFields().get(0).setShowAllItems(true); 
            System.out.println(pt_demo.getColumnFields().get(0).getName()); 
            pt_demo.getDataFields().get(0).setShowAllItems(true); 
            System.out.println(pt_demo.getDataFields().get(0).getName()); 
            pt_demo.getRowFields().get(0).setShowAllItems(true); 
            System.out.println(pt_demo.getRowFields().get(0).getName()); 
            pt_demo.getDataFields().get(0).setShowAllItems(true); 
            System.out.println(pt_demo.getDataFields().get(0).getName()); 
            */

            pt_demo.RowFields[0].ShowAllItems = true;
            Console.WriteLine(pt_demo.RowFields[0].Name);

            pt_demo.RefreshData();
            pt_demo.CalculateData();

            Cell lastDCell = wb_demo.Worksheets[0].Cells.EndCellInColumn((short)0);

            for (int row = 1; row <= lastDCell.Row; row++)
            {
                //System.out.println(row+" "+lastFCell.getRow()); 
                Cell cell0 = wb_demo.Worksheets[0].Cells[row, 0];
                Cell cell1 = wb_demo.Worksheets[0].Cells[row, 1];
                Cell cell2 = wb_demo.Worksheets[0].Cells[row, 2];
                Cell cell3 = wb_demo.Worksheets[0].Cells[row, 3];
                Cell cell4 = wb_demo.Worksheets[0].Cells[row, 4];

                Console.WriteLine("Demo " + cell0.Value + " "
                        + cell1.Value + " "
                        + cell2.Value + " "
                        + cell3.Value + " "
                        + cell4.Value + " "
                        );

            }
            Assert.AreEqual(wb_demo.Worksheets[0].Cells[4, 0].StringValue, "xxx");
            Assert.AreEqual(wb_demo.Worksheets[0].Cells[5, 0].StringValue, "yyy");
            Assert.AreEqual(wb_demo.Worksheets[0].Cells[6, 0].StringValue, "zzz");
            wb_demo.Save(Constants.PivotTableDestPath + @"JAVA41817.xlsx");
        }
```

### See Also

* class [Cell](../../cell/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)

---

## EndCellInColumn(int, int, int, int) {#endcellincolumn_1}

Gets the last cell with maximum column index in this range.

```csharp
public Cell EndCellInColumn(int startRow, int endRow, int startColumn, int endColumn)
```

| Parameter | Type | Description |
| --- | --- | --- |
| startRow | Int32 | Start row index. |
| endRow | Int32 | End row index. |
| startColumn | Int32 | Start column index. |
| endColumn | Int32 | End column index. |

### Return Value

Cell object.

### See Also

* class [Cell](../../cell/)
* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


