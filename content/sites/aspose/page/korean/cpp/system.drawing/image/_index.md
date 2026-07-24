---
title: "System::Drawing::Image class"
linktitle: "Image"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Image 클래스. 기본 기능을 제공하는 System::Drawing::Bitmap 및 System::Drawing::Metafile 클래스의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.drawing/image/
---
## Image class


기본 기능을 제공하는 [System::Drawing::Bitmap](../bitmap/) 및 System::Drawing::Metafile 클래스의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class Image : public virtual System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Clone](./clone/)() | 현재 객체의 복사본을 생성합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 획득한 모든 리소스를 해제합니다. |
| static [FromFile](./fromfile/)(const String\&, bool) | 지정된 파일에서 [Image](./) 객체를 생성합니다. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | 지정된 GDI 비트맵에서 [Bitmap](../bitmap/) 객체를 생성합니다. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | 지정된 스트림에서 [Image](./) 객체를 생성합니다. |
| virtual [get_Flags](./get_flags/)() const | 이미지의 속성을 나타내는 ImageFlags 열거형 값들의 비트별 조합을 반환합니다. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | 현재 객체가 나타내는 이미지 내 프레임의 차원을 나타내는 GUID 배열을 반환합니다. |
| virtual [get_Height](./get_height/)() const | 이미지의 높이를 픽셀 단위로 반환합니다. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | 현재 객체가 나타내는 이미지의 수평 해상도를 인치당 픽셀 수로 반환합니다. |
| virtual [get_Palette](./get_palette/)() const | 현재 객체가 나타내는 이미지에서 사용되는 색상 팔레트를 반환합니다. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | 현재 객체가 나타내는 이미지의 픽셀 형식을 반환합니다. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | 이 이미지에 저장된 속성 항목들의 ID를 가져옵니다. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | 이 이미지에 저장된 모든 속성 항목(메타데이터 조각)을 가져옵니다. |
| virtual [get_RawFormat](./get_rawformat/)() const | 현재 객체가 나타내는 이미지의 파일 형식을 반환합니다. |
| [get_Size](./get_size/)() const | 이미지의 너비와 높이를 픽셀 단위로 나타내는 [Size](../size/) 객체를 반환합니다. |
| virtual [get_Tag](./get_tag/)() const | 이미지에 대한 추가 데이터를 제공하는 객체를 가져옵니다. |
| [get_VerticalResolution](./get_verticalresolution/)() const | 현재 객체가 나타내는 이미지의 수직 해상도를 인치당 픽셀 수로 반환합니다. |
| virtual [get_Width](./get_width/)() const | 이미지의 너비를 픽셀 단위로 반환합니다. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | 지정된 측정 단위로 이미지 경계를 반환합니다. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | 지정된 프레임 차원에 대한 프레임 수를 반환합니다. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | 지정된 픽셀 형식에서 색상 깊이를 나타내는 데 사용되는 비트 수를 반환합니다. |
| virtual [GetSkBitmap](./getskbitmap/)() const | 기본 SkBitmap 객체를 반환합니다. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | 이 [System::Drawing::Image](./) 객체에 대한 썸네일을 가져옵니다. |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | 지정된 픽셀 형식에 알파 정보가 포함되어 있는지 확인합니다. |
| virtual [IsMultiImage](./ismultiimage/)() const | 원본 형식이 다중 이미지인지 여부를 반환합니다. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | 이미지를 90도 배수로 회전하고 뒤집습니다. |
| [Save](./save/)(const String\&) | 현재 객체가 나타내는 이미지를 PNG 형식으로 지정된 파일에 저장합니다. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | 현재 객체가 나타내는 이미지를 지정된 형식으로 지정된 파일에 저장합니다. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | 현재 객체가 나타내는 이미지를 지정된 형식으로 지정된 스트림에 저장합니다. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 현재 객체가 나타내는 이미지를 지정된 인코더와 인코더 매개변수를 사용하여 지정된 파일에 저장합니다. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 현재 객체가 나타내는 이미지를 지정된 인코더와 인코더 매개변수를 사용하여 지정된 스트림에 저장합니다. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | 이전 호출에서 [Save()](./save/) 메서드에 지정된 파일 또는 스트림에 프레임을 추가합니다. |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | 이전 호출에서 [Save()](./save/) 메서드에 지정된 파일 또는 스트림에 프레임을 추가합니다. |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | 지정된 프레임을 선택합니다. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | 현재 객체가 나타내는 이미지에서 사용되는 색상 팔레트를 설정합니다. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | 이미지에 대한 추가 데이터를 제공하는 객체를 설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | GetThumbnailImage 실행을 취소하기 위한 콜백입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
