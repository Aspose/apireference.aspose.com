---
title: Aspose::TeX::Presentation::Image::ImageDevice class
linktitle: ImageDevice
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Image::ImageDevice class. Implements the interface for outputting text and graphic content to image(s) in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.presentation.image/imagedevice/
---
## ImageDevice class


Implements the interface for outputting text and graphic content to image(s).

```cpp
class ImageDevice : public Aspose::TeX::Presentation::Device,
                    public Aspose::TeX::Presentation::IPageCropper
```

## Methods

| Method | Description |
| --- | --- |
| [get_PageCount](./get_pagecount/)() override | Gets the number of pages. |
| [get_Result](./get_result/)() | Returns the resulting images byte arrays. The first dimension is for inner documents and the second one is for pages within inner documents. |
| [ImageDevice](./imagedevice/)(bool) | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
## See Also

* Class [Device](../../aspose.tex.presentation/device/)
* Class [IPageCropper](../../aspose.tex.presentation/ipagecropper/)
* Namespace [Aspose::TeX::Presentation::Image](../)
* Library [Aspose.TeX for C++](../../)
