---
title: Aspose::TeX::Presentation::Aps::ApsDevice class
linktitle: ApsDevice
second_title: Aspose.TeX for C++
description: 'How to use Aspose::TeX::Presentation::Aps::ApsDevice class in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.presentation.aps/apsdevice/
---
## ApsDevice class




```cpp
class ApsDevice : public Aspose::TeX::Presentation::Device,
                  public Aspose::TeX::Presentation::IInteractiveDevice,
                  public Aspose::TeX::Presentation::IFragmentRasterizer
```

## Methods

| Method | Description |
| --- | --- |
| [AddBookmark](./addbookmark/)(System::String, System::Drawing::PointF) override | Adds the bookmark identified by the name. |
| [AddHyperlink](./addhyperlink/)(System::Drawing::RectangleF, System::SharedPtr\<System::Drawing::Pen\>, System::String) override | Set the hyperlink with a URI as its target. |
| [ApsDevice](./apsdevice/)() |  |
| [Create](./create/)() override | Creates a copy of this device. |
| [Dispose](./dispose/)() override | Disposes this device instance. Finalizes this device instance graphics state, i.e. switches APS composing context to the [ApsCanvas](../) of the level higher then this device's graphics state [ApsCanvas](../). |
| [DrawPath](./drawpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Draws a path. |
| [DrawString](./drawstring/)(System::String, float, float, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<GlyphData\>\>\>) override | Draws a text string. |
| [EndDocument](./enddocument/)() override | Finalizes the whole document. |
| [EndFragment](./endfragment/)() override | Ends a fragment to rasterize. |
| [EndPage](./endpage/)() override | Finalizes a page. |
| [FillPath](./fillpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Fills a path. |
| [get_DestinationName](./get_destinationname/)() override | Gets destination name: output file name or device description. |
| [get_InternalHyperlinksTargets](./get_internalhyperlinkstargets/)() override | Returns the map of internal hyperlink targets. |
| [get_IsReady](./get_isready/)() override | Shows if device is ready for output. |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [get_Pages](./get_pages/)() const |  |
| [Initialize](./initialize/)() override | Initializes the device. |
| [SaveInternalHyperlinkTarget](./saveinternalhyperlinktarget/)(int32_t, System::Drawing::RectangleF) override | Saves internal hyperlink target as a page number and a rectangular area on a page. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Sets the current clip path. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Sets the current coordinate space transformation. |
| [ShowImage](./showimage/)(System::Drawing::PointF, System::Drawing::SizeF, System::ArrayPtr\<uint8_t\>) override | Shows a raster image. |
| [StartDocument](./startdocument/)() override | Starts the whole document. |
| [StartFragment](./startfragment/)() override | Starts a fragment to rasterize. |
| [StartPage](./startpage/)(float, float) override | Starts a new page. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* Class [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* Namespace [Aspose::TeX::Presentation::Aps](../)
* Library [Aspose.TeX for C++](../../)
