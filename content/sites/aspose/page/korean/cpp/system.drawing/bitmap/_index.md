---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Bitmap 클래스. GDI+ 비트맵 이미지를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.drawing/bitmap/
---
## Bitmap class


GDI+ 비트맵 이미지를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class Bitmap : public System::Drawing::Image
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | 픽셀 처리 모드를 활성화합니다. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | 지정된 기존 이미지에서 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | 지정된 스트림에서 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(const String\&) | 지정된 파일에서 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(const String\&, bool) | 지정된 파일에서 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | 지정된 너비, 높이, 픽셀 형식 및 픽셀 데이터를 가진 비트맵 이미지를 나타내는 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | 지정된 기존 이미지를 지정된 크기로 스케일링하여 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | 지정된 기존 이미지에서 너비와 높이를 지정된 값으로 스케일링한 새로운 [Bitmap](./) 객체를 생성합니다. |
| [Clone](./clone/)() override | 현재 객체의 복사본을 생성합니다. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | 현재 객체가 나타내는 비트맵 이미지의 영역 복사본을 나타내는 [Bitmap](./) 객체를 생성합니다. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | 현재 객체가 나타내는 비트맵 이미지의 영역 복사본을 나타내는 [Bitmap](./) 객체를 생성합니다. |
| [ComputeHash](./computehash/)() | SHA1 해시 값을 계산합니다. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | 픽셀 형식을 Format32bppArgb로 변경한 지정된 비트맵 이미지의 복사본을 생성합니다. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | 픽셀 처리 모드를 비활성화합니다. |
| [get_Height](./get_height/)() const override | 이미지의 높이를 픽셀 단위로 반환합니다. |
| [get_Palette](./get_palette/)() const override | 현재 객체가 나타내는 이미지에서 사용되는 색상 팔레트를 반환합니다. |
| [get_PixelFormat](./get_pixelformat/)() const override | 현재 객체가 나타내는 이미지의 픽셀 형식을 반환합니다. |
| [get_RawFormat](./get_rawformat/)() const override | 현재 객체가 나타내는 이미지의 파일 형식을 반환합니다. |
| [get_Width](./get_width/)() const override | 이미지의 너비를 픽셀 단위로 반환합니다. |
| [GetHbitmap](./gethbitmap/)() | 현재 객체가 나타내는 비트맵에서 GDI 비트맵 객체를 생성합니다. |
| [GetPixel](./getpixel/)(int, int) | 지정된 픽셀의 색상을 반환합니다. |
| [GetSkBitmap](./getskbitmap/)() const override | 기본 SkBitmap 객체에 대한 원시 포인터를 반환합니다. |
| [IsMultiImage](./ismultiimage/)() const override | 원본 형식이 다중 이미지인지 여부를 반환합니다. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | 시스템 메모리에 [Bitmap](./)을 잠급니다. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | 시스템 메모리에 [Bitmap](./)을 잠급니다. |
| [MakeTransparent](./maketransparent/)(Color) | 지정된 색상을 가진 모든 픽셀의 색상을 투명하게 변경합니다. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | 현재 객체가 나타내는 이미지의 픽셀 색상을 사전 곱합니다. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | 이미지를 90도 배수로 회전하고 뒤집습니다. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | 현재 객체가 나타내는 이미지에서 사용되는 색상 팔레트를 설정합니다. |
| [SetPixel](./setpixel/)(int, int, Color) | 현재 객체가 나타내는 비트맵 이미지에서 지정된 픽셀의 색상을 설정합니다. |
| [SetResolution](./setresolution/)(float, float) | 이미지의 해상도를 설정합니다. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | 시스템 메모리에서 지정된 비트맵의 잠금을 해제합니다. |
## 또 보기

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
