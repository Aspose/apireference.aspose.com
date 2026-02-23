---
title: Aspose::Page::XPS::XpsModel::XpsCanvas class
linktitle: XpsCanvas
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsCanvas class. Class incapsulating Canvas element features. This element groups elements together. For example, Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or to apply a composed property value to each child and ancestor element in C++.'
type: docs
weight: 500
url: /cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Class incapsulating Canvas element features. This element groups elements together. For example, Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit (as a hyperlink destination) or to apply a composed property value to each child and ancestor element.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(T) | Adds an element to this canvas's child list. |
| [AddCanvas](./addcanvas/)() | Adds a new canvas to this canvas's child list. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Adds new glyphs to this canvas's child list. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Adds a new path to this canvas's child list. |
| [Clone](./clone/)() | Clones this canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Returns/sets the value that controls how edges of paths within the canvas are rendered. |
| [Insert](./insert/)(int32_t, T) | Inserts an element to this canvas's child list at *index*  position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserts a new canvas to this canvas's child list at *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserts new glyphs to this canvas's child list at *index*  position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Inserts a new path to this canvas's child list at *index*  position. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Returns/sets the value that controls how edges of paths within the canvas are rendered. |
## See Also

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
