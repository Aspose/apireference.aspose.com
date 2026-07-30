---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::BitmapData class. 表示位图图像的一组属性。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


表示位图图像的一组属性。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class BitmapData : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Height](./get_height/)() const | 返回图像的高度（像素）。 |
| [get_PixelFormat](./get_pixelformat/)() const | 返回位图图像的像素格式。 |
| [get_Scan0](./get_scan0/)() const | 返回位图中第一个像素数据的地址。 |
| [get_Stride](./get_stride/)() const | 返回图像的跨距宽度（字节）。 |
| [get_Width](./get_width/)() const | 返回图像的宽度（像素）。 |
| [set_Height](./set_height/)(int) | 设置图像的高度（像素）。 |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | 设置位图图像的像素格式。 |
| [set_Scan0](./set_scan0/)(IntPtr) | 设置位图中第一个像素数据的地址。 |
| [set_Stride](./set_stride/)(int) | 设置图像的跨距宽度（字节）。 |
| [set_Width](./set_width/)(int) | 设置图像的宽度（像素）。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
