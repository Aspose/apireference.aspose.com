---
title: page_scale недвижимость
second_title: Aspose.Cells for Python via .NET API Ссылки
description:
type: docs
weight: 100
url: /ru/aspose.cells.rendering/sheetrender/page_scale/
is_root: false
---
##  page_scale недвижимость

Получает рассчитанный масштаб страницы листа.
Возвращает заданный масштаб, если задано значение [`PageSetup.zoom`](/cells/python-net/ru/aspose.cells/pagesetup#zoom). В противном случае возвращает рассчитанный масштаб в соответствии с [`PageSetup.fit_to_pages_wide`](/cells/python-net/ru/aspose.cells/pagesetup#fit_to_pages_wide) и [`PageSetup.fit_to_pages_tall`](/cells/python-net/ru/aspose.cells/pagesetup#fit_to_pages_tall).

###  Пример

```python
from aspose.cells import Workbook
from aspose.cells.rendering import ImageOrPrintOptions, SheetRender

wb = Workbook("Book1.xlsx")
sheetRender = SheetRender(wb.worksheets[0], ImageOrPrintOptions())
# Gets calculated page scale of the sheet.
pageScale = sheetRender.page_scale

```
###  Определение:
```python
@property
def page_scale(self):
    ...
```

###  Смотрите также
* модуль [`aspose.cells.rendering`](../../)
* класс [`SheetRender`](/cells/python-net/ru/aspose.cells.rendering/sheetrender)
