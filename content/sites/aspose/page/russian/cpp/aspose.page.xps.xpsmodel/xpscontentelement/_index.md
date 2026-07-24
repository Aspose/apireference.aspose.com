---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement класс"
linktitle: "XpsContentElement"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement класс. Инкапсулирует функции элементов содержимого XPS: Canvas, Path и Glyphs в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


Инкапсулирует функции элементов содержимого [XPS](../../aspose.page.xps/): Canvas, Path и Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Clip](./get_clip/)() | Возвращает/устанавливает экземпляр геометрии пути, ограничивающий отрисованную область элемента. |
| [get_Opacity](./get_opacity/)() const | Возвращает/устанавливает значение, определяющее равномерную прозрачность элемента. |
| [get_OpacityMask](./get_opacitymask/)() | Возвращает/устанавливает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [get_RenderTransform](./get_rendertransform/)() | Возвращает/устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Возвращает/устанавливает экземпляр геометрии пути, ограничивающий отрисованную область элемента. |
| [set_Opacity](./set_opacity/)(float) | Возвращает/устанавливает значение, определяющее равномерную прозрачность элемента. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Возвращает/устанавливает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Возвращает/устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
## См. также

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
