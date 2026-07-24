---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas класс"
linktitle: "XpsCanvas"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas класс. Класс, инкапсулирующий возможности элемента Canvas. Этот элемент группирует элементы вместе. Например, элементы Glyphs и Path могут быть сгруппированы в canvas, чтобы быть идентифицированными как единое целое (как назначение гиперссылки) или чтобы применить составное значение свойства к каждому дочернему и предшествующему элементу в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Класс, инкапсулирующий свойства элемента Canvas. Этот элемент группирует элементы вместе. Например, элементы Glyphs и Path могут быть сгруппированы в canvas, чтобы их можно было идентифицировать как единицу (как назначение гиперссылки) или применить составное значение свойства к каждому дочернему и предковому элементу.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(T) | Добавляет элемент в список дочерних элементов этого canvas. |
| [AddCanvas](./addcanvas/)() | Добавляет новый canvas в список дочерних элементов этого canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Добавляет новые glyphs в список дочерних элементов этого canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Добавляет новый path в список дочерних элементов этого canvas. |
| [Clone](./clone/)() | Клонирует этот canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Возвращает/устанавливает значение, которое контролирует, как рендерятся края путей внутри canvas. |
| [Insert](./insert/)(int32_t, T) | Вставляет элемент в список дочерних элементов этого canvas на позицию *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Вставляет новый canvas в список дочерних элементов этого canvas на позицию *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Вставляет новые glyphs в список дочерних элементов этого canvas на позицию *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Вставляет новый path в список дочерних элементов этого canvas на позицию *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Возвращает/устанавливает значение, которое контролирует, как рендерятся края путей внутри canvas. |
## См. также

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
