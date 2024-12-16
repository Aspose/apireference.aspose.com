---
title: Aspose::TeX::Presentation::Xps::XpsDevice class
linktitle: XpsDevice
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Xps::XpsDevice class. Implements the interface for outputting text and graphic content to XPS document in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.presentation.xps/xpsdevice/
---
## XpsDevice class


Implements the interface for outputting text and graphic content to XPS document.

```cpp
class XpsDevice : public Aspose::TeX::Presentation::Device,
                  public Aspose::TeX::Presentation::IInteractiveDevice,
                  public Aspose::TeX::Presentation::IFragmentRasterizer
```

## Methods

| Method | Description |
| --- | --- |
| [AddBookmark](./addbookmark/)(System::String, System::Drawing::PointF) override | Adds the bookmark identified by the name. |
| [EndFragment](./endfragment/)() override | Ends a fragment to rasterize. |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [StartFragment](./startfragment/)() override | Starts a fragment to rasterize. |
| [XpsDevice](./xpsdevice/)() | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
| [XpsDevice](./xpsdevice/)(System::SharedPtr\<System::IO::Stream\>) | Creates a new instance. The output file will be written to specified stream. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* Class [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* Namespace [Aspose::TeX::Presentation::Xps](../)
* Library [Aspose.TeX for C++](../../)
