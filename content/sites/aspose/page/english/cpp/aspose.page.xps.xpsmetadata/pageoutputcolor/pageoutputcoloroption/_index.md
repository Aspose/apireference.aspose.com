---
title: Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption class
linktitle: PageOutputColorOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption class. Describes the PageOutputColor feature options in C++.'
type: docs
weight: 400
url: /cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


Describes the [PageOutputColor](../) feature options.

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Adds an array of [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) instances to the option. |
| static [Color](./color/)(int32_t, int32_t) | Specifies the output should be in color. |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | Specifies the output should be in grayscale. |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | Specifies the output should be in monochrome (Black). |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Creates a new instance. |
## See Also

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
