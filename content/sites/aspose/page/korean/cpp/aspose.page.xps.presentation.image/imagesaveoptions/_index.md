---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions 클래스"
linktitle: "ImageSaveOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions 클래스. C++에서 XPS를 이미지로 저장하기 위한 기본 클래스."
type: docs
weight: 200
url: /ko/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


XPS-as-image 저장 옵션을 위한 기본 클래스.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | 노드 간에 전달할 페이지 부분의 크기를 지정합니다. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 저장되기 직전에 [XPS](../../aspose.page.xps/) 페이지를 수정하는 이벤트 핸들러 컬렉션입니다. |
| [get_ImageSize](./get_imagesize/)() const | 출력 이미지의 크기를 픽셀 단위로 가져오거나 설정합니다. |
| [get_InterpolationMode](./get_interpolationmode/)() const | 보간 모드를 가져오거나 설정합니다. |
| [get_PageNumbers](./get_pagenumbers/)() override | 변환할 페이지 번호 배열을 가져오거나 설정합니다. |
| [get_Resolution](./get_resolution/)() const | 이미지 해상도를 가져오거나 설정합니다. |
| [get_SmoothingMode](./get_smoothingmode/)() const | 스무딩 모드를 가져오거나 설정합니다. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | 텍스트 렌더링 힌트를 가져오거나 설정합니다. |
| [ImageSaveOptions](./imagesaveoptions/)() | 옵션의 새 인스턴스를 생성합니다. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | 노드 간에 전달할 페이지 부분의 크기를 지정합니다. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | 출력 이미지의 크기를 픽셀 단위로 가져오거나 설정합니다. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | 보간 모드를 가져오거나 설정합니다. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 변환할 페이지 번호 배열을 가져오거나 설정합니다. |
| [set_Resolution](./set_resolution/)(float) | 이미지 해상도를 가져오거나 설정합니다. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | 스무딩 모드를 가져오거나 설정합니다. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | 텍스트 렌더링 힌트를 가져오거나 설정합니다. |
## 또 보기

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
