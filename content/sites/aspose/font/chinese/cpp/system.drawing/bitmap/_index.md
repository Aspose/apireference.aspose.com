---
title: "System::Drawing::Bitmap 类"
linktitle: "Bitmap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Bitmap 类。表示 GDI+ 位图图像。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.drawing/bitmap/
---
## Bitmap class


表示 GDI+ 位图图像。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Bitmap : public System::Drawing::Image
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | 启用像素处理模式。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | 从指定的现有图像构造一个新的 [Bitmap](./) 对象。 |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | 从指定的流构造一个新的 [Bitmap](./) 对象。 |
| [Bitmap](./bitmap/)(const String\&) | 从指定的文件构造一个新的 [Bitmap](./) 对象。 |
| [Bitmap](./bitmap/)(const String\&, bool) | 从指定的文件构造一个新的 [Bitmap](./) 对象。 |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | 构造一个新的 [Bitmap](./) 对象，表示具有指定宽度、高度、像素格式和像素数据的位图图像。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | 从指定的现有图像构造一个新的 [Bitmap](./) 对象，并缩放至指定尺寸。 |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | 从指定的现有图像构造一个新的 [Bitmap](./) 对象，宽度和高度按指定值缩放。 |
| [Clone](./clone/)() override | 创建当前对象的副本。 |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | 创建一个 [Bitmap](./) 对象，表示当前对象所代表的位图图像的某个区域的副本。 |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | 创建一个 [Bitmap](./) 对象，表示当前对象所代表的位图图像的某个区域的副本。 |
| [ComputeHash](./computehash/)() | 计算 SHA1 哈希值。 |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | 创建指定位图图像的副本，并将像素格式更改为 Format32bppArgb。 |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | 禁用像素处理模式。 |
| [get_Height](./get_height/)() const override | 返回图像的高度（像素）。 |
| [get_Palette](./get_palette/)() const override | 返回当前对象所表示图像使用的颜色调色板。 |
| [get_PixelFormat](./get_pixelformat/)() const override | 返回当前对象所表示图像的像素格式。 |
| [get_RawFormat](./get_rawformat/)() const override | 返回当前对象所表示图像的文件格式。 |
| [get_Width](./get_width/)() const override | 返回图像的宽度（像素）。 |
| [GetHbitmap](./gethbitmap/)() | 从当前对象所代表的位图创建一个 GDI 位图对象。 |
| [GetPixel](./getpixel/)(int, int) | 返回指定像素的颜色。 |
| [GetSkBitmap](./getskbitmap/)() const override | 返回指向底层 SkBitmap 对象的原始指针。 |
| [IsMultiImage](./ismultiimage/)() const override | 返回原始格式是否为多图像。 |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | 将 [Bitmap](./) 锁定到系统内存中。 |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | 将 [Bitmap](./) 锁定到系统内存中。 |
| [MakeTransparent](./maketransparent/)(Color) | 将所有具有指定颜色的像素颜色更改为透明。 |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | 对当前对象表示的图像的像素颜色进行预乘。 |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | 将图像旋转为 90 度的倍数并翻转。 |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | 设置当前对象表示的图像使用的颜色调色板。 |
| [SetPixel](./setpixel/)(int, int, Color) | 设置当前对象表示的位图图像中指定像素的颜色。 |
| [SetResolution](./setresolution/)(float, float) | 设置图像的分辨率。 |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | 从系统内存中解锁指定的位图。 |
## 另见

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
