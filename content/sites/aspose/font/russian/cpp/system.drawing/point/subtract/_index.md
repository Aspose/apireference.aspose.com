---
title: "System::Drawing::Point::Subtract метод"
linktitle: "Вычитание"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Point::Subtract метод. Вычитает значения ширины и высоты указанного объекта Size из значений координат X и Y указанного объекта Point соответственно в C++."
type: docs
weight: 1800
url: /ru/cpp/system.drawing/point/subtract/
---
## Point::Subtract method


Вычитает значения ширины и высоты указанного объекта [Size](../../size/) из значений координат X и Y указанного объекта [Point](../) соответственно.

```cpp
static Point System::Drawing::Point::Subtract(const Point &point, const Size &size)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | const Point\& | Точка для переноса |
| size | const Size\& | Объект [Size](../../size/), который задаёт значения для вычитания из значений координат **point** |

### ReturnValue

Новый объект [Point](../), у которого значение координаты X равно результату вычитания значения ширины **size** из значения координаты X **point**, а значение координаты Y равно результату вычитания значения высоты **size** из значения координаты Y **point**.

## См. также

* Class [Point](../)
* Class [Size](../../size/)
* Class [Point](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
