---
title: add_line метод
second_title: Aspose.Cells for Python via .NET API Ссылки
description:
type: docs
weight: 170
url: /ru/aspose.cells.drawing/shapecollection/add_line/
is_root: false
---
##  add_line(self, upper_left_row, top, upper_left_column, left, height, width) {#int-int-int-int-int-int}
Добавляет LineShape на рабочий лист.


###  Возврат

Объект LineShape.


```python

def add_line(self, upper_left_row, top, upper_left_column, left, height, width):
    ...
```


| Параметр| Тип| Описание|
| :- | :- | :- |
| upper_left_row | int | Указатель верхнего левого ряда.|
| top | int | Представляет вертикальное смещение LineShape от его левой строки в пикселях.|
| upper_left_column | int | Индекс верхнего левого столбца.|
| left | int | Представляет горизонтальное смещение LineShape от его левого столбца в пикселях.|
| height | int | Представляет высоту LineShape в пикселях.|
| width | int |Представляет ширину LineShape в пикселях.|

###  Пример

```python

#  add a line object
lineShape = shapes.add_line(1, 0, 1, 0, 100, 50)

```



###  Смотрите также
* модуль [`aspose.cells.drawing`](../../)
* класс [`ShapeCollection`](/cells/python-net/ru/aspose.cells.drawing/shapecollection)
