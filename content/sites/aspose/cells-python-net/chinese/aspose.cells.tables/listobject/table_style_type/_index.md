---
title: table_style_type属性
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 300
url: /zh/aspose.cells.tables/listobject/table_style_type/
is_root: false
---
## table_style_type属性

获取并内置表格样式。

### 例子

```python
from aspose.cells import Workbook
from aspose.cells.tables import TableStyleType

workbook = Workbook("Book1.xlsx")
tables = workbook.worksheets[0].list_objects
index = tables.add(0, 0, 9, 4, True)
table = tables[0]
table.table_style_type = TableStyleType.TABLE_STYLE_DARK2
workbook.save("TableStyle.xlsx")

```
### 定义：
```python
@property
def table_style_type(self):
    ...
@table_style_type.setter
def table_style_type(self, value):
    ...
```

### 也可以看看
* 模块[`aspose.cells.tables`](../../)
* 类 [`ListObject`](/cells/python-net/zh/aspose.cells.tables/listobject)
* 类 [`TableStyleType`](/cells/python-net/zh/aspose.cells.tables/tablestyletype)
