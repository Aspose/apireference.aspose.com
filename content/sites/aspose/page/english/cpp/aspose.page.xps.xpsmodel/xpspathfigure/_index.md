---
title: Aspose::Page::XPS::XpsModel::XpsPathFigure class
linktitle: XpsPathFigure
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsPathFigure class. Class incapsulating PathFigure element features. This element is composed of a set of one or more line or curve segments in C++.'
type: docs
weight: 3100
url: /cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Class incapsulating PathFigure element features. This element is composed of a set of one or more line or curve segments.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() | Clones this path figure. |
| [get_IsClosed](./get_isclosed/)() const | Returns/sets the value indicating whether the path figure is closed. |
| [get_IsFilled](./get_isfilled/)() const | Returns/sets value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [get_Segments](./get_segments/)() | Return list of child path segments. |
| [get_StartPoint](./get_startpoint/)() const | Returns/sets the starting point for the first segment of the path figure. |
| [set_IsClosed](./set_isclosed/)(bool) | Returns/sets the value indicating whether the path figure is closed. |
| [set_IsFilled](./set_isfilled/)(bool) | Returns/sets value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Returns/sets the starting point for the first segment of the path figure. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |
## See Also

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
