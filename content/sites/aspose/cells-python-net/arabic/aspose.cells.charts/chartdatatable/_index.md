---
title: ChartDataTable صف
second_title: Aspose.Cells for Python via .NET API المراجع
description:
type: docs
weight: 70
url: /ar/aspose.cells.charts/chartdatatable/
is_root: false
---
##  ChartDataTable صف
يمثل جدول بيانات الرسم البياني.



يكشف النوع ChartDataTable عن الأعضاء التاليين:

###  ملكيات
| ملكية| وصف|
| :- | :- |
| [font](/cells/python-net/ar/aspose.cells.charts/chartdatatable/font) | يحصل على الكائن [`ChartDataTable.font`](/cells/python-net/ar/aspose.cells.charts/chartdatatable#font) الذي يمثل إعداد الخط لجدول بيانات الرسم البياني المحدد.|
| [auto_scale_font](/cells/python-net/ar/aspose.cells.charts/chartdatatable/auto_scale_font) | صحيح إذا تغير حجم الخط في النص الموجود في الكائن عند تغير حجم الكائن.<br/> القيمة الافتراضية هي True.|
| [background_mode](/cells/python-net/ar/aspose.cells.charts/chartdatatable/background_mode) | يحصل على وضع عرض الخلفية ويحدده|
| [has_border_horizontal](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_border_horizontal) | صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود خلوية أفقية|
| [has_horizontal_border](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_horizontal_border) | صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود خلوية أفقية|
| [has_border_vertical](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_border_vertical) |صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود خلايا عمودية|
| [has_vertical_border](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_vertical_border) |صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود خلايا عمودية|
| [has_border_outline](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_border_outline) | صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود تفصيلية|
| [has_outline_border](/cells/python-net/ar/aspose.cells.charts/chartdatatable/has_outline_border) | صحيح إذا كان جدول بيانات الرسم البياني يحتوي على حدود تفصيلية|
| [show_legend_key](/cells/python-net/ar/aspose.cells.charts/chartdatatable/show_legend_key) | صحيح إذا كان مفتاح أسطورة تسمية البيانات مرئيًا.|
| [border](/cells/python-net/ar/aspose.cells.charts/chartdatatable/border) | إرجاع كائن Border الذي يمثل حدود الكائن|



###  مثال

```python
from aspose.cells import Workbook
from aspose.cells.charts import ChartType
from aspose.pydrawing import Color

# Instantiating a Workbook object
workbook = Workbook()
# Obtaining the reference of the first worksheet
worksheet = workbook.worksheets[0]
# Adding a sample value to "A1" cell
worksheet.cells.get("A1").put_value(50)
# Adding a sample value to "A2" cell
worksheet.cells.get("A2").put_value(100)
# Adding a sample value to "A3" cell
worksheet.cells.get("A3").put_value(150)
# Adding a sample value to "B1" cell
worksheet.cells.get("B1").put_value(60)
# Adding a sample value to "B2" cell
worksheet.cells.get("B2").put_value(32)
# Adding a sample value to "B3" cell
worksheet.cells.get("B3").put_value(50)
# Adding a chart to the worksheet
chartIndex = worksheet.charts.add(ChartType.COLUMN, 5, 0, 25, 10)
# Accessing the instance of the newly added chart
chart = worksheet.charts[chartIndex]
# Adding NSeries (chart data source) to the chart ranging from "A1" cell to "B3"
chart.n_series.add("A1:B3", True)
chart.show_data_table = True
# Getting Chart Table
chartTable = chart.chart_data_table
# Setting Chart Table Font Color
chartTable.font.color = Color.red
# Setting Legend Key VisibilityOptions
chartTable.show_legend_key = False
# Saving the Excel file
workbook.save("book1.xls")

```

###  أنظر أيضا
* الوحدة [`aspose.cells.charts`](..)
