---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions 클래스"
linktitle: "XpsConverterToImageOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions 클래스. C++에서 XpsConverter 플러그인을 위한 XPS에서 이미지로 변환 옵션을 나타냅니다."
type: docs
weight: 2100
url: /ko/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


[XPS](../../aspose.page.xps/)를 이미지로 변환하는 옵션을 [XpsConverter](../xpsconverter/) 플러그인에 대해 나타냅니다.

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | 이미지 유형을 가져오거나 설정합니다. |
| [get_OperationName](./get_operationname/)() override | 작업 이름을 반환합니다. |
| [get_PageNumbers](./get_pagenumbers/)() const | 변환할 [XPS](../../aspose.page.xps/) 문서의 페이지 번호 배열을 가져오거나 설정합니다. 설정하지 않으면 모든 페이지가 변환됩니다. |
| [get_Resolution](./get_resolution/)() const | 이미지 해상도를 가져오거나 설정합니다. |
| [get_Size](./get_size/)() const | 결과 이미지의 크기를 가져오거나 설정합니다. |
| [get_SmoothingMode](./get_smoothingmode/)() const | 이미지 렌더링을 위한 스무딩 모드를 가져오거나 설정합니다. |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 이미지 유형을 가져오거나 설정합니다. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | 변환할 [XPS](../../aspose.page.xps/) 문서의 페이지 번호 배열을 가져오거나 설정합니다. 설정하지 않으면 모든 페이지가 변환됩니다. |
| [set_Resolution](./set_resolution/)(float) | 이미지 해상도를 가져오거나 설정합니다. |
| [set_Size](./set_size/)(System::Drawing::Size) | 결과 이미지의 크기를 가져오거나 설정합니다. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | 이미지 렌더링을 위한 스무딩 모드를 가져오거나 설정합니다. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | 기본 옵션으로 [XpsConverterToImageOptions](./) 객체의 새 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 이미지 형식으로 [XpsConverterToImageOptions](./) 객체의 새 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | 결과 이미지의 크기로 [XpsConverterToImageOptions](./) 객체의 새 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | 이미지 형식과 결과 이미지의 크기로 [XpsConverterToImageOptions](./) 객체의 새 인스턴스를 초기화합니다. |
## 또 보기

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
