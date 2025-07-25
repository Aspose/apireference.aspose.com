---
title: get_precedents方法
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 180
url: /zh/aspose.cells/cell/get_precedents/
is_root: false
---
##  get_precedents(self) {#}
获取此单元格公式中出现的所有引用。


### 返回

此单元格公式中出现的所有引用的集合。


```python

def get_precedents(self):
    ...
```


### 注意事项

* 如果这不是公式单元格，则返回 null。此单元格公式中出现的所有引用都将被返回，无论在计算时是否被引用。

例如，虽然公式“=IF(TRUE,A1,A2)”在计算时没有使用单元格 A2，
它仍然作为公式的先例。要获取仅影响计算的参考文献，请使用[`Cell.get_precedents_in_calculation`](/cells/python-net/zh/aspose.cells/cell/get_precedents_in_calculation)。

* 如果这不是公式单元格，则返回 null。此单元格公式中出现的所有引用都将被返回，无论在计算时是否被引用。
例如，虽然公式“=IF(TRUE,A1,A2)”在计算时没有使用单元格 A2，
它仍然作为公式的先例。要获取仅影响计算的参考文献，请使用[`Cell.get_precedents_in_calculation`](/cells/python-net/zh/aspose.cells/cell/get_precedents_in_calculation)。

* 如果这不是公式单元格，则返回 null。此单元格公式中出现的所有引用都将被返回，无论在计算时是否被引用。
例如，虽然公式“=IF(TRUE,A1,A2)”在计算时没有使用单元格 A2，
它仍然作为公式的先例。要获取仅影响计算的参考文献，请使用[`Cell.get_precedents_in_calculation`](/cells/python-net/zh/aspose.cells/cell/get_precedents_in_calculation)。
### 例子

```python
from aspose.cells import CellsHelper, Workbook

workbook = Workbook()
cells = workbook.worksheets[0].cells
cells.get("A1").formula = "=B1+SUM(B1:B10)+[Book1.xls]Sheet1!A1"
areas = cells.get("A1").get_precedents()
for i in range(len(areas)):
    area = areas[i]
    stringBuilder = []
    if area.is_external_link:
        stringBuilder.append("[")
        stringBuilder.append(area.external_file_name)
        stringBuilder.append("]")
    stringBuilder.append(area.sheet_name)
    stringBuilder.append("!")
    stringBuilder.append(CellsHelper.cell_index_to_name(area.start_row, area.start_column))
    if area.is_area:
        stringBuilder.append(":")
        stringBuilder.append(CellsHelper.cell_index_to_name(area.end_row, area.end_column))
    print("".join(stringBuilder))

```



### 也可以看看
* 模块[`aspose.cells`](../../)
* 类 [`Cell`](/cells/python-net/zh/aspose.cells/cell)
