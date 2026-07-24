---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption 类"
linktitle: "PageOutputColorOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption 类。 在 C++ 中描述 PageOutputColor 功能选项。"
type: docs
weight: 400
url: /zh/cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


描述 [PageOutputColor](../) 功能选项。

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | 向该选项添加一个 [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) 实例数组。 |
| static [Color](./color/)(int32_t, int32_t) | 指定输出应为彩色。 |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | 指定输出应为灰度。 |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | 指定输出应为单色（黑色）。 |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
