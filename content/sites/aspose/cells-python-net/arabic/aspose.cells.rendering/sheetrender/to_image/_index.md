---
title: طريقة to_image
second_title: Aspose.Cells for Python via .NET API المراجع
description:
type: docs
weight: 50
url: /ar/aspose.cells.rendering/sheetrender/to_image/
is_root: false
---
##  to_image(self, page_index, file_name) {#int-str}
تقديم صفحة معينة إلى ملف.



```python

def to_image(self, page_index, file_name):
    ...
```


| معامل| يكتب| وصف|
| :- | :- | :- |
| page_index | int | الإشارة إلى الصفحة التي سيتم تحويلها|
| file_name | str | اسم ملف الصورة الناتجة|

###  مثال

يقوم الكود التالي بإخراج الصفحة الأولى من الورقة الأولى إلى صورة png.

```python
from aspose.cells import Workbook
from aspose.cells.drawing import ImageType
from aspose.cells.rendering import ImageOrPrintOptions, SheetRender

# load the source file with images.
wb = Workbook("Book1.xlsx")
imgOpt = ImageOrPrintOptions()
# set output image type.
imgOpt.image_type = ImageType.PNG
# render the first sheet.
sr = SheetRender(wb.worksheets[0], imgOpt)
# output the first page of the sheet to image.
sr.to_image(0, "output.png")

```


##  to_image(self, page_index, stream) {#int-io.RawIOBase}
عرض صفحة معينة على مجرى مائي.



```python

def to_image(self, page_index, stream):
    ...
```


| معامل| يكتب| وصف|
| :- | :- | :- |
| page_index | int | الإشارة إلى الصفحة التي سيتم تحويلها|
| stream | io.RawIOBase | تدفق الصورة الناتجة|



###  أنظر أيضا
* الوحدة [`aspose.cells.rendering`](../../)
* فئة [`SheetRender`](/cells/python-net/ar/aspose.cells.rendering/sheetrender)
