---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader 클래스"
linktitle: "TiffDataReader"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader 클래스. 이 클래스는 TIFF 이미지 파일 디렉터리(IFD)에서 데이터를 읽는 데 사용됩니다. C++에서 TIFF 해상도를 읽고 TIFF 규격 준수를 확인하는 데 도움이 됩니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


클래스는 TIFF 이미지 파일 디렉터리(IFD)에서 데이터를 읽는 데 사용됩니다. TIFF 해상도를 읽고 TIFF 적합성을 확인하는 데 도움이 됩니다.

```cpp
class TiffDataReader : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | TIFF 이미지 높이를 반환합니다. 높이가 0이면 기본값(100)을 반환합니다. |
| [get_ImageWidth](./get_imagewidth/)() | TIFF 이미지 너비를 반환합니다. 너비가 0이면 기본값(100)을 반환합니다. |
| [get_ImageXResolution](./get_imagexresolution/)() const | TIFF 이미지 X 해상도를 반환합니다. |
| [get_ImageYResolution](./get_imageyresolution/)() const | TIFF 이미지 Y 해상도를 반환합니다. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | TIFF 이미지가 [XPS](../../aspose.page.xps/) 사양을 준수하고 그대로 [XPS](../../aspose.page.xps/) 문서에 삽입될 수 있으면 true를 반환합니다. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | 형식에 대한 문서는 Aspose.Words\\Doc에 있습니다. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | [TiffDataReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | [TiffDataReader](./) 클래스의 새 인스턴스를 초기화합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
