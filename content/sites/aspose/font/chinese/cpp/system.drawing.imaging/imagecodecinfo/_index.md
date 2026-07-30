---
title: "System::Drawing::Imaging::ImageCodecInfo 类"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ImageCodecInfo 类。提供有关图像编解码器的信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


提供有关图像编解码器的信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ImageCodecInfo : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | 返回与当前对象表示的编解码器格式关联的 GUID。 |
| [get_MimeType](./get_mimetype/)() | 返回当前对象表示的编解码器的多用途互联网邮件扩展 (MIME) 类型。 |
| static [GetImageDecoders](./getimagedecoders/)() | 返回一个 [ImageCodecInfo](./) 对象数组，表示受支持的图像解码器。 |
| static [GetImageEncoders](./getimageencoders/)() | 返回一个 [ImageCodecInfo](./) 对象数组，表示受支持的图像编码器。 |
| [set_FormatID](./set_formatid/)(const Guid\&) | 设置与当前对象表示的编解码器格式关联的 GUID。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
