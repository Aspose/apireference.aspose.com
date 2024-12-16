---
title: Aspose::TeX::Presentation::Pdf::PdfDevice class
linktitle: PdfDevice
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Pdf::PdfDevice class. Implements the interface for outputting text and graphic content to PDF document in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.presentation.pdf/pdfdevice/
---
## PdfDevice class


Implements the interface for outputting text and graphic content to PDF document.

```cpp
class PdfDevice : public Aspose::TeX::Presentation::Device,
                  public Aspose::TeX::Presentation::IInteractiveDevice,
                  public Aspose::TeX::Presentation::IFragmentRasterizer
```

## Methods

| Method | Description |
| --- | --- |
| [AddBookmark](./addbookmark/)(System::String, System::Drawing::PointF) override | Adds the bookmark identified by the name. |
| [EndFragment](./endfragment/)() override | Ends a fragment to rasterize. |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [PdfDevice](./pdfdevice/)() | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Creates a new instance. The output file will be written to specified stream. |
| [StartFragment](./startfragment/)() override | Starts a fragment to rasterize. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* Class [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* Namespace [Aspose::TeX::Presentation::Pdf](../)
* Library [Aspose.TeX for C++](../../)
