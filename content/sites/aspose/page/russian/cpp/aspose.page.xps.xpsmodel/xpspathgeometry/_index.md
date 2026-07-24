---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry class"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry class. Класс, инкапсулирующий свойства элемента PathGeometry. Этот элемент содержит набор фигур пути, указанных либо атрибутом Figures, либо дочерним элементом PathFigure в C++."
type: docs
weight: 3200
url: /ru/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Класс, инкапсулирующий свойства элемента свойства PathGeometry. Этот элемент содержит набор фигур пути, указанных либо атрибутом Figures, либо дочерним элементом PathFigure.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Добавляет сегмент пути в список дочерних сегментов последней фигуры пути. |
| [Clone](./clone/)() | Создаёт копию этой геометрии пути. |
| [get_FillRule](./get_fillrule/)() const | Возвращает/устанавливает значение, определяющее, как пересекающиеся области геометрических фигур комбинируются для формирования региона. |
| [get_PathFigures](./get_pathfigures/)() | Возвращает список дочерних фигур пути. |
| [get_Transform](./get_transform/)() override | Возвращает/устанавливает аффинную матрицу преобразования, задающую локальное матричное преобразование, применяемое ко всем дочерним и наследующим элементам геометрии пути перед их использованием для заполнения, обрезки или обводки. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Вставляет сегмент пути в список дочерних сегментов последней фигуры пути в позицию *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути в позиции *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Возвращает/устанавливает значение, определяющее, как пересекающиеся области геометрических фигур комбинируются для формирования региона. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Возвращает/устанавливает аффинную матрицу преобразования, задающую локальное матричное преобразование, применяемое ко всем дочерним и наследующим элементам геометрии пути перед их использованием для заполнения, обрезки или обводки. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |
## См. также

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
