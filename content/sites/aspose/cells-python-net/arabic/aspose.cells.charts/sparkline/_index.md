---
title: Sparkline صف
second_title: Aspose.Cells for Python via .NET API المراجع
description:
type: docs
weight: 270
url: /ar/aspose.cells.charts/sparkline/
is_root: false
---
##  Sparkline صف
يمثل خط المؤشر مخططًا أو رسمًا صغيرًا في خلية ورقة العمل التي توفر تمثيلاً مرئيًا للبيانات.



يكشف النوع Sparkline عن الأعضاء التاليين:

###  ملكيات
| ملكية| وصف|
| :- | :- |
| [data_range](/cells/python-net/ar/aspose.cells.charts/sparkline/data_range) | يمثل نطاق بيانات خط المؤشر.|
| [row](/cells/python-net/ar/aspose.cells.charts/sparkline/row) | الحصول على فهرس صف خط المؤشر.|
| [column](/cells/python-net/ar/aspose.cells.charts/sparkline/column) | الحصول على فهرس عمود خط المؤشر.|


###  طُرق
| طريقة| وصف|
| :- | :- |
| [to_image](/cells/python-net/ar/aspose.cells.charts/sparkline/to_image/#str-aspose.cells.rendering.ImageOrPrintOptions) | تحويل خط المؤشر إلى صورة.|
| [to_image](/cells/python-net/ar/aspose.cells.charts/sparkline/to_image/#io.RawIOBase-aspose.cells.rendering.ImageOrPrintOptions) | تحويل خط المؤشر إلى صورة.|



###  مثال

```python
from aspose.cells import CellArea, Workbook
from aspose.cells.charts import SparklineType
from aspose.cells.rendering import ImageOrPrintOptions

book = Workbook()
sheet = book.worksheets[0]
sheet.cells.get("A1").put_value(5)
sheet.cells.get("B1").put_value(2)
sheet.cells.get("C1").put_value(1)
sheet.cells.get("D1").put_value(3)
#  Define the CellArea
ca = CellArea()
ca.start_column = 4
ca.end_column = 4
ca.start_row = 0
ca.end_row = 0
idx = sheet.sparkline_group_collection.add(SparklineType.LINE, sheet.name + "!A1:D1", False, ca)
group = sheet.sparkline_group_collection[idx]
idx = group.sparkline_collection.add(sheet.name + "!A1:D1", 0, 4)
line = group.sparkline_collection[idx]
print("Saprkline data range: "  + line.data_range + ", row: "  + str(line.row) + ", column: "  + str(line.column))
line.to_image("output.png", ImageOrPrintOptions())

```

###  أنظر أيضا
* الوحدة [`aspose.cells.charts`](..)
