---
title: add метод
second_title: Aspose.Cells for Python via .NET API Ссылки
description:
type: docs
weight: 20
url: /ru/aspose.cells.drawing/textboxcollection/add/
is_root: false
---
##  add(self, upper_left_row, upper_left_column, height, width) {#int-int-int-int}
Добавляет текстовое поле в коллекцию.


###  Возврат

Индекс объекта [`TextBox`](/cells/python-net/ru/aspose.cells.drawing/textbox).


```python

def add(self, upper_left_row, upper_left_column, height, width):
    ...
```


| Параметр| Тип| Описание|
| :- | :- | :- |
| upper_left_row | int | Указатель верхнего левого ряда.|
| upper_left_column | int | Индекс верхнего левого столбца.|
| height | int | Высота текстового поля в пикселях.|
| width | int | Ширина текстового поля в пикселях.|

###  Пример

```python

# add a TextBox
index2 = textBoxCollection.add(1, 1, 50, 100)

```



###  Смотрите также
* модуль [`aspose.cells.drawing`](../../)
* класс [`TextBox`](/cells/python-net/ru/aspose.cells.drawing/textbox)
* класс [`TextBoxCollection`](/cells/python-net/ru/aspose.cells.drawing/textboxcollection)
