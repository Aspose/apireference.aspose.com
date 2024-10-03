---
title: Aspose::Page::XPS::XpsModel::XpsPath class
linktitle: XpsPath
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsPath class. Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page in C++.'
type: docs
weight: 3100
url: /cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Class incapsulating Path element features. This element is the sole means of adding vector graphics and images to a fixed page. It defines a single vector graphic to be rendered on a page.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() | Clones this path. |
| [get_Data](./get_data/)() | Returns/sets the geometry of the path. |
| [get_Fill](./get_fill/)() | Returns/sets the brush used to paint the geometry specified by the Data property of the path. |
| [get_Stroke](./get_stroke/)() | Returns/sets the brush used to draw the stroke. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Returns/sets the array specifying the length of dashes and gaps of the outline stroke. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Returns/sets the value specifying how the ends of each dash are drawn. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Returns/sets the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Returns/sets the value defining the shape of the end of the last dash in a stroke. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Returns/sets the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the **StrokeLineJoin** attribute specifies **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [get_StrokeThickness](./get_strokethickness/)() const | Returns/sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element’s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Returns/sets the geometry of the path. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Returns/sets the brush used to paint the geometry specified by the Data property of the path. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Returns/sets the brush used to draw the stroke. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Returns/sets the array specifying the length of dashes and gaps of the outline stroke. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Returns/sets the value specifying how the ends of each dash are drawn. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Returns/sets the start point for repeating the dash array pattern. If this value is omitted, the dash array aligns with the origin of the stroke. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Returns/sets the value defining the shape of the end of the last dash in a stroke. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Returns/sets the ratio between the maximum miter length and half of the stroke thickness. This value is significant only if the **StrokeLineJoin** attribute specifies **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Returns/sets the value defining the shape of the beginning of the first dash in a stroke. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Returns/sets the thickness of a stroke, in units of the effective coordinate space (includes the path's render transform). The stroke is drawn on top of the boundary of the geometry specified by the Path element’s Data property. Half of the StrokeThickness extends outside of the geometry specified by the Data property and the other half extends inside of the geometry. |
## See Also

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
