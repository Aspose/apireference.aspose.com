---
title: "System::Drawing::Image 类"
linktitle: "图像"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Image 类。是 System::Drawing::Bitmap 和 System::Drawing::Metafile 类的基类，提供基本功能。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.drawing/image/
---
## Image class


一个基类用于 [System::Drawing::Bitmap](../bitmap/) 和 System::Drawing::Metafile 类，提供基本功能。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Image : public virtual System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | 创建当前对象的副本。 |
| [Dispose](./dispose/)() override | 释放当前对象获取的所有资源。 |
| static [FromFile](./fromfile/)(const String\&, bool) | 从指定文件创建一个 [Image](./) 对象。 |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | 从指定的 GDI 位图构造一个 [Bitmap](../bitmap/) 对象。 |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | 从指定的流创建一个 [Image](./) 对象。 |
| virtual [get_Flags](./get_flags/)() const | 返回表示图像属性的 ImageFlags 枚举值的按位组合。 |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | 返回一个 GUID 数组，表示当前对象所表示图像中帧的维度。 |
| virtual [get_Height](./get_height/)() const | 返回图像的高度（像素）。 |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | 返回当前对象所表示图像的水平分辨率（每英寸像素数）。 |
| virtual [get_Palette](./get_palette/)() const | 返回当前对象所表示图像使用的颜色调色板。 |
| virtual [get_PixelFormat](./get_pixelformat/)() const | 返回当前对象所表示图像的像素格式。 |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | 获取存储在此图像中的属性项 ID。 |
| virtual [get_PropertyItems](./get_propertyitems/)() const | 获取此图像中存储的所有属性项（元数据片段）。 |
| virtual [get_RawFormat](./get_rawformat/)() const | 返回当前对象所表示图像的文件格式。 |
| [get_Size](./get_size/)() const | 返回一个 [Size](../size/) 对象，表示图像的宽度和高度（像素）。 |
| virtual [get_Tag](./get_tag/)() const | 获取提供图像附加数据的对象。 |
| [get_VerticalResolution](./get_verticalresolution/)() const | 返回当前对象所表示图像的垂直分辨率（每英寸像素数）。 |
| virtual [get_Width](./get_width/)() const | 返回图像的宽度（像素）。 |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | 返回以指定测量单位表示的图像边界。 |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | 返回指定帧维度的帧数。 |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | 返回在指定像素格式中表示颜色深度所使用的位数。 |
| virtual [GetSkBitmap](./getskbitmap/)() const | 返回底层的 SkBitmap 对象。 |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | 获取此 [System::Drawing::Image](./) 对象的缩略图。 |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | 确定指定的像素格式是否包含 alpha 信息。 |
| virtual [IsMultiImage](./ismultiimage/)() const | 返回原始格式是否为多图像。 |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | 将图像旋转为 90 度的倍数并翻转。 |
| [Save](./save/)(const String\&) | 将当前对象所表示的图像以 PNG 格式保存到指定文件。 |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | 将当前对象所表示的图像以指定格式保存到指定文件。 |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | 将当前对象所表示的图像以指定格式保存到指定流中。 |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 使用指定的编码器和编码器参数，将当前对象所表示的图像保存到指定文件。 |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | 将当前对象表示的图像保存到指定的流中，使用指定的编码器和编码器参数。 |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | 向先前对 [Save()](./save/) 方法调用中指定的文件或流添加帧。 |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | 向先前对 [Save()](./save/) 方法调用中指定的文件或流添加帧。 |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | 选择指定的帧。 |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | 设置当前对象表示的图像使用的颜色调色板。 |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | 设置提供图像附加数据的对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | 用于取消 GetThumbnailImage 执行的回调。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
