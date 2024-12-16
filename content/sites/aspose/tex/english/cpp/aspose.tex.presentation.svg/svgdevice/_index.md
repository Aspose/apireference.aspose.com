---
title: Aspose::TeX::Presentation::Svg::SvgDevice class
linktitle: SvgDevice
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Svg::SvgDevice class. Implements the interface for outputting text and graphic content to PDF document in C++.'
type: docs
weight: 100
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
| [EndFragment](./endfragment/)() override | Ends a fragment to rasterize. |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [StartFragment](./startfragment/)() override | Starts a fragment to rasterize. |
| [SvgDevice](./svgdevice/)() | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* Class [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* Class [IPageCropper](../../aspose.tex.presentation/ipagecropper/)
* Namespace [Aspose::TeX::Presentation::Svg](../)
* Library [Aspose.TeX for C++](../../)
