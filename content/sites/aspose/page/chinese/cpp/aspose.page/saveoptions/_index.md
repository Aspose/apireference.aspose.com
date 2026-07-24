---
title: "Aspose::Page::SaveOptions 类"
linktitle: "SaveOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::SaveOptions 类。此类包含管理 C++ 中转换过程所需的选项。"
type: docs
weight: 1500
url: /zh/cpp/aspose.page/saveoptions/
---
## SaveOptions class


此类包含管理转换过程所需的选项。

```cpp
class SaveOptions : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | 指定转换器应在其中查找输入文档字体的附加文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。 |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | 指定是否将非 TrueType 字体保存为 TTF。它显著减少 PS 转 PDF 转换后文档的体积，并提升包含大量非 TrueType 字体文本的 PS 文件转换为任何输出格式的速度。然而，在将 PostScript 文件转换为图像时会出现轻微的垂直文字位移。 |
| virtual [get_Debug](./get_debug/)() | 指定是否必须将调试信息打印到标准输出流。 |
| virtual [get_Exceptions](./get_exceptions/)() | 如果 [SuppressErrors](../) 为 true，则返回被抑制的转换错误列表。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
| [get_Size](./get_size/)() const | 获取/设置图像的大小。 |
| virtual [get_SupressErrors](./get_supresserrors/)() | 指定是否必须抑制错误。如果为 true，则将被抑制的错误添加到 [Exceptions](../) 列表中。如果为 false，第一次错误将终止程序。 |
| [SaveOptions](./saveoptions/)() | 使用标志 [SuppressErrors](../)（true）和 [Debug](../)（false）的默认值初始化一个新的 [SaveOptions](./) 类实例。 |
| [SaveOptions](./saveoptions/)(bool) | 使用标志 [Debug](../)（false）的默认值初始化一个新的 [SaveOptions](./) 类实例。 |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | 使用指定的页面大小初始化一个新的 [SaveOptions](./) 实例。 |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | 使用标志 [Debug](../)（false）的默认值以及指定的页面大小初始化一个新的 [SaveOptions](./) 类实例。 |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | 指定转换器应在其中查找输入文档字体的附加文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。 |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | 指定是否将非 TrueType 字体保存为 TTF。它显著减少 PS 转 PDF 转换后文档的体积，并提升包含大量非 TrueType 字体文本的 PS 文件转换为任何输出格式的速度。然而，在将 PostScript 文件转换为图像时会出现轻微的垂直文字位移。 |
| virtual [set_Debug](./set_debug/)(bool) | 指定是否必须将调试信息打印到标准输出流。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | 获取/设置图像的大小。 |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | 指定是否必须抑制错误。如果为 true，则将被抑制的错误添加到 [Exceptions](../) 列表中。如果为 false，第一次错误将终止程序。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
