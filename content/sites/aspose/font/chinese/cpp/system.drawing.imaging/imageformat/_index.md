---
title: "System::Drawing::Imaging::ImageFormat 类"
linktitle: "ImageFormat"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ImageFormat 类。表示图像的文件格式。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1100
url: /zh/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


表示图像的文件格式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ImageFormat : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | 确定当前对象和指定对象所表示的图像格式是否相等。 |
| static [get_Bmp](./get_bmp/)() | 返回一个指向表示位图图像格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Emf](./get_emf/)() | 返回一个指向表示增强型图元文件格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Exif](./get_exif/)() | 返回一个指向表示可交换 [Image](../../system.drawing/image/) 文件（Exif）格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Gif](./get_gif/)() | 返回一个指向表示 [Graphics](../../system.drawing/graphics/) 交换格式（GIF）图像格式的 [ImageFormat](./) 对象的共享指针。 |
| [get_Guid](./get_guid/)() const | 返回与当前对象所表示的图像格式关联的 GUID。 |
| static [get_Icon](./get_icon/)() | 返回一个指向表示 [Windows](../../system.windows/) 图标图像格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Jpeg](./get_jpeg/)() | 返回一个指向表示联合图像专家组（JPEG）图像格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_MemoryBmp](./get_memorybmp/)() | 返回一个指向表示内存中位图格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Png](./get_png/)() | 返回一个指向表示 W3C 可移植网络 [Graphics](../../system.drawing/graphics/)（PNG）图像格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Tiff](./get_tiff/)() | 返回一个指向表示标记 [Image](../../system.drawing/image/) 文件格式（TIFF）图像格式的 [ImageFormat](./) 对象的共享指针。 |
| static [get_Wmf](./get_wmf/)() | 返回一个指向表示 [Windows](../../system.windows/) 元文件（WMF）图像格式的 [ImageFormat](./) 对象的共享指针。 |
| [ImageFormat](./imageformat/)(const System::Guid\&) | 构造一个表示与指定 GUID 关联的图像格式的 [ImageFormat](./) 类实例。 |
| virtual [ToString](./tostring/)() const | 将此 [ImageFormat](./) 对象转换为人类可读的字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
