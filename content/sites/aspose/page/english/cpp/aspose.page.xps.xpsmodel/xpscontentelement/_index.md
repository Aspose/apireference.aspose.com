---
title: Aspose::Page::XPS::XpsModel::XpsContentElement class
linktitle: XpsContentElement
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsContentElement class. Incapsulates features of XPS content elements: Canvas, Path and Glyphs in C++.'
type: docs
weight: 700
url: /cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


Incapsulates features of [XPS](../../aspose.page.xps/) content elements: Canvas, Path and Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Methods

| Method | Description |
| --- | --- |
| [get_Clip](./get_clip/)() | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [get_Opacity](./get_opacity/)() const | Returns/sets the value defining the uniform transparency of the element. |
| [get_OpacityMask](./get_opacitymask/)() | Returns/sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [get_RenderTransform](./get_rendertransform/)() | Returns/sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [set_Opacity](./set_opacity/)(float) | Returns/sets the value defining the uniform transparency of the element. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Returns/sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Returns/sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
## See Also

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
