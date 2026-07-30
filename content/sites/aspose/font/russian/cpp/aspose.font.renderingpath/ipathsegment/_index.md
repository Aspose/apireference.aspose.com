---
title: "Aspose::Font::RenderingPath::IPathSegment класс"
linktitle: "IPathSegment"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::RenderingPath::IPathSegment класс. Представляет интерфейс любого сегмента пути в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.renderingpath/ipathsegment/
---
## IPathSegment class


Представляет интерфейс любого сегмента пути.

```cpp
class IPathSegment : public System::ICloneable
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<IPathSegment\>) |  |
| virtual [Copy](./copy/)() | Создаёт копию объекта сегмента. |
| virtual [Shift](./shift/)(double, double) | Выполняет сдвиг по координатам x и y. |
| virtual [Transform](./transform/)(System::SharedPtr\<TransformationMatrix\>) | Преобразует координаты с помощью матрицы преобразования. |
## См. также

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::RenderingPath](../)
* Library [Aspose.Font for C++](../../)
