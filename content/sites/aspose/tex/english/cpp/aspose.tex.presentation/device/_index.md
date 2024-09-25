---
title: Aspose::TeX::Presentation::Device class
linktitle: Device
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Device class. Implements the interface for outputting text and graphic content to abstract device. Rendering is performed page by page in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.presentation/device/
---
## Device class


Implements the interface for outputting text and graphic content to abstract device. **Rendering** is performed page by page.

```cpp
class Device : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [AddHyperlink](./addhyperlink/)(System::Drawing::RectangleF, System::SharedPtr\<System::Drawing::Pen\>, System::String) | Sets the hyperlink with a URI as its target. |
| virtual [Create](./create/)() | Creates a copy of this device. |
| [Device](./device/)() | Creates a new instance. |
| virtual [Dispose](./dispose/)() | Disposes the device. |
| virtual [DrawPath](./drawpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Draws a path. |
| virtual [DrawString](./drawstring/)(System::String, float, float, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<GlyphData\>\>\>) | Draws a text string. |
| virtual [EndDocument](./enddocument/)() | Finalizes the whole document. |
| virtual [EndPage](./endpage/)() | Finalizes a page. |
| virtual [FillPath](./fillpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Fills a path. |
| virtual [get_DestinationName](./get_destinationname/)() | Gets destination name: output file name or device description. |
| virtual [get_Fill](./get_fill/)() | Gets/sets the current fill. |
| virtual [get_FillOpacity](./get_fillopacity/)() | Gets/sets the current fill opacity. |
| virtual [get_IsReady](./get_isready/)() | Shows if device is ready for output. |
| virtual [get_PageCount](./get_pagecount/)() | Gets the number of pages. |
| virtual [get_Stroke](./get_stroke/)() | Gets/sets the current stroke. |
| virtual [get_StrokeOpacity](./get_strokeopacity/)() | Gets/sets the current stroke opacity. |
| virtual [Initialize](./initialize/)() | Initializes the device. |
| virtual [set_Fill](./set_fill/)(System::SharedPtr\<System::Drawing::Brush\>) | Gets/sets the current fill. |
| virtual [set_FillOpacity](./set_fillopacity/)(float) | Gets/sets the current fill opacity. |
| virtual [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Gets/sets the current stroke. |
| virtual [set_StrokeOpacity](./set_strokeopacity/)(float) | Gets/sets the current stroke opacity. |
| virtual [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Sets the current clip path. |
| virtual [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Sets the current coordinate space transformation. |
| virtual [ShowImage](./showimage/)(System::Drawing::PointF, System::Drawing::SizeF, System::ArrayPtr\<uint8_t\>) | Shows a raster image. |
| virtual [StartDocument](./startdocument/)() | Starts the whole document. |
| virtual [StartPage](./startpage/)(float, float) | Starts a new page. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::TeX::Presentation](../)
* Library [Aspose.TeX for C++](../../)
