---
title: copy метод
second_title: Aspose.Cells for Python via .NET API Ссылки
description:
type: docs
weight: 60
url: /ru/aspose.cells.drawing/picture/copy/
is_root: false
---
##  copy(self, source, options) {#aspose.cells.drawing.Picture-aspose.cells.CopyOptions}
Скопируйте картинку.



```python

def copy(self, source, options):
    ...
```


| Параметр| Тип| Описание|
| :- | :- | :- |
| source | [`Picture`](/cells/python-net/ru/aspose.cells.drawing/picture) | Исходное изображение.|
| options | [`CopyOptions`](/cells/python-net/ru/aspose.cells/copyoptions) | Варианты копирования.|

###  Пример

```python
from aspose.cells import CopyOptions, Workbook

# Instantiating a Workbook object
workbook = Workbook()
worksheet = workbook.worksheets[0]
# insert first picture
imgIndex1 = worksheet.pictures.add(1, 1, "1.png")
# Get the inserted picture object
pic1 = worksheet.pictures[imgIndex1]
# insert second picture
imgIndex2 = worksheet.pictures.add(1, 9, "2.jpeg")
# Get the inserted picture object
pic2 = worksheet.pictures[imgIndex2]
# Copy picture 1 to picture 2.You'll get two picture 1 objects that are superimposed on top of each other.
opt = CopyOptions()
pic2.copy(pic1, opt)
# Save the excel file.
workbook.save("result.xlsx")

```



###  Смотрите также
* модуль [`aspose.cells.drawing`](../../)
* класс [`Picture`](/cells/python-net/ru/aspose.cells.drawing/picture)
