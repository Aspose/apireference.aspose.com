---
title: Aspose::TeX::Presentation::Svg::SvgDevice class
linktitle: SvgDevice
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Svg::SvgDevice class. Implements the interface for outputting text and graphic content to PDF document in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.presentation.svg/svgdevice/
---
## SvgDevice class


Implements the interface for outputting text and graphic content to PDF document.

```cpp
class SvgDevice : public Aspose::TeX::Presentation::Device,
                  public Aspose::TeX::Presentation::IInteractiveDevice,
                  public Aspose::TeX::Presentation::IFragmentRasterizer,
                  public Aspose::TeX::Presentation::IPageCropper
```

## Methods

| Method | Description |
| --- | --- |
| [AddBookmark](./addbookmark/)(System::String, System::Drawing::PointF) override | Adds the bookmark identified by the name. |
| [AddHyperlink](./addhyperlink/)(System::Drawing::RectangleF, System::SharedPtr\<System::Drawing::Pen\>, System::String) override | Set the hyperlink with a URI as its target. |
| [Create](./create/)() override | Creates a copy of this device. |
| [Dispose](./dispose/)() override | Disposes this device instance. Finalizes this device instance graphics state, i.e. switches composing context to the level higher then this device's graphics state. |
| [DrawPath](./drawpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Draws a path. |
| [DrawString](./drawstring/)(System::String, float, float, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<GlyphData\>\>\>) override | Draws a text string. |
| [EndDocument](./enddocument/)() override | Finalizes the whole document. |
| [EndFragment](./endfragment/)() override | Ends a fragment to rasterize. |
| [EndPage](./endpage/)() override | Finalizes a page. |
| [FillPath](./fillpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Fill a path. |
| [get_DestinationName](./get_destinationname/)() override | Gets destination name: output file name or device description. |
| [get_Fill](./get_fill/)() override | Gets/sets the current fill. |
| [get_FillOpacity](./get_fillopacity/)() override | Gets/sets the current fill opacity. |
| [get_InternalHyperlinksTargets](./get_internalhyperlinkstargets/)() override | Returns the map of internal hyperlink targets. |
| [get_IsReady](./get_isready/)() override | Shows if device is ready for output. |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [get_Stroke](./get_stroke/)() override | Gets/sets the current stroke. |
| [get_StrokeOpacity](./get_strokeopacity/)() override | Gets/sets the current stroke opacity. |
| [Initialize](./initialize/)() override | Initializes the device. |
| [SaveInternalHyperlinkTarget](./saveinternalhyperlinktarget/)(int32_t, System::Drawing::RectangleF) override | Saves internal hyperlink target as a page number and a rectangular area on a page. |
| [set_Fill](./set_fill/)(System::SharedPtr\<System::Drawing::Brush\>) override | Gets/sets the current fill. |
| [set_FillOpacity](./set_fillopacity/)(float) override | Gets/sets the current fill opacity. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Gets/sets the current stroke. |
| [set_StrokeOpacity](./set_strokeopacity/)(float) override | Gets/sets the current stroke opacity. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Sets the current clip path. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Sets the current coordinate space transformation. |
| [ShowImage](./showimage/)(System::Drawing::PointF, System::Drawing::SizeF, System::ArrayPtr\<uint8_t\>) override | Shows a raster image. |
| [StartDocument](./startdocument/)() override | Starts the whole document. |
| [StartFragment](./startfragment/)() override | Starts a fragment to rasterize. |
| [StartPage](./startpage/)(float, float) override | Starts a new page. |
| [SvgDevice](./svgdevice/)() | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* Class [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* Class [IPageCropper](../../aspose.tex.presentation/ipagecropper/)
* Namespace [Aspose::TeX::Presentation::Svg](../)
* Library [Aspose.TeX for C++](../../)
