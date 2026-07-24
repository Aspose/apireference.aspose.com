---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure класс"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure класс. Класс, инкапсулирующий свойства элемента PathFigure. Этот элемент состоит из набора из одной или более линейных или криволинейных сегментов в C++."
type: docs
weight: 3100
url: /ru/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Класс, инкапсулирующий свойства элемента PathFigure. Этот элемент состоит из набора из одной или более линейных или криволинейных сегментов.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() | Клонирует эту фигуру пути. |
| [get_IsClosed](./get_isclosed/)() const | Возвращает/устанавливает значение, указывающее, закрыта ли фигура пути. |
| [get_IsFilled](./get_isfilled/)() const | Возвращает/устанавливает значение, указывающее, используется ли фигура пути при вычислении площади содержащей геометрии пути. |
| [get_Segments](./get_segments/)() | Возвращает список дочерних сегментов пути. |
| [get_StartPoint](./get_startpoint/)() const | Возвращает/устанавливает начальную точку первого сегмента фигуры пути. |
| [set_IsClosed](./set_isclosed/)(bool) | Возвращает/устанавливает значение, указывающее, закрыта ли фигура пути. |
| [set_IsFilled](./set_isfilled/)(bool) | Возвращает/устанавливает значение, указывающее, используется ли фигура пути при вычислении площади содержащей геометрии пути. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Возвращает/устанавливает начальную точку первого сегмента фигуры пути. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |
## См. также

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
