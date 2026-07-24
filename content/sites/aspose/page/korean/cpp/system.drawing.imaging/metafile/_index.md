---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::Metafile class. 그래픽 메타파일을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.drawing.imaging/metafile/
---
## Metafile class


그래픽 메타파일을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class Metafile : public System::Drawing::Image
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 현재 객체의 복사본을 반환합니다. |
| [get_Height](./get_height/)() const override | 이미지의 높이를 픽셀 단위로 반환합니다. |
| [get_PixelFormat](./get_pixelformat/)() const override | 픽셀 형식을 나타내는 값을 반환합니다. |
| [get_RawFormat](./get_rawformat/)() const override | 이미지 형식을 나타내는 값을 반환합니다. |
| [get_Width](./get_width/)() const override | 이미지의 너비를 픽셀 단위로 반환합니다. |
| [GetHenhmetafile](./gethenhmetafile/)() | 구현되지 않음. |
| [GetMetafileHeader](./getmetafileheader/)() | 현재 객체와 연결된 헤더를 반환합니다. |
| [Metafile](./metafile/)(const System::String\&) | 구현되지 않음. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | 구현되지 않음. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | 구현되지 않음. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | 구현되지 않음. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | 구현되지 않음. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | 구현되지 않음. |
| [Metafile](./metafile/)(IntPtr, EmfType) | 구현되지 않음. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | 구현되지 않음. |
| virtual [~Metafile](./~metafile/)() | 소멸자. |
## 또 보기

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
