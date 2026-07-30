---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::Metafile class。表示图形元文件。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.drawing.imaging/metafile/
---
## Metafile class


表示图形元文件。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Metafile : public System::Drawing::Image
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 返回当前对象的副本。 |
| [get_Height](./get_height/)() const override | 返回图像的高度（单位：像素）。 |
| [get_PixelFormat](./get_pixelformat/)() const override | 返回指示像素格式的值。 |
| [get_RawFormat](./get_rawformat/)() const override | 返回指示图像格式的值。 |
| [get_Width](./get_width/)() const override | 返回图像的宽度（像素）。 |
| [GetHenhmetafile](./gethenhmetafile/)() | 未实现。 |
| [GetMetafileHeader](./getmetafileheader/)() | 返回与当前对象关联的头信息。 |
| [Metafile](./metafile/)(const System::String\&) | 未实现。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | 未实现。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | 未实现。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | 未实现。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | 未实现。 |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | 未实现。 |
| [Metafile](./metafile/)(IntPtr, EmfType) | 未实现。 |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | 未实现。 |
| virtual [~Metafile](./~metafile/)() | 析构函数。 |
## 另见

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
