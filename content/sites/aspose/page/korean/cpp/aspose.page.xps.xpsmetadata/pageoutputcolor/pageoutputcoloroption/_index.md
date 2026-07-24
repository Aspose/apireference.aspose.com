---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption 클래스"
linktitle: "PageOutputColorOption"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption 클래스. C++에서 PageOutputColor 기능 옵션을 설명합니다."
type: docs
weight: 400
url: /ko/cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


[PageOutputColor](../) 기능 옵션을 설명합니다.

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | 옵션에 [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) 인스턴스 배열을 추가합니다. |
| static [Color](./color/)(int32_t, int32_t) | 출력이 컬러여야 함을 지정합니다. |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | 출력이 그레이스케일이어야 함을 지정합니다. |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | 출력이 단색(검정)이어야 함을 지정합니다. |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
