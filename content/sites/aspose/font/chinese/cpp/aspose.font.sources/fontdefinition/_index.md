---
title: "Aspose::Font::Sources::FontDefinition 类"
linktitle: "FontDefinition"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Sources::FontDefinition 类。表示字体文件集定义。此类包含与字体内部数据无关的字段。这些字段描述字体的放置位置以及在 C++ 中从某些字体源（文件、内存等）加载字体所需的其他数据。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


表示 [Font](../../aspose.font/font/) 文件集定义。此类包含与字体内部数据无关的字段。这些字段描述字体的放置位置以及从某些字体源（文件、内存等）加载字体所需的其他数据。

```cpp
class FontDefinition : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | 创建单文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | 创建多文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | 创建多文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | 创建多文件 [Font](../../aspose.font/font/) 定义。 |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | 创建多文件 [Font](../../aspose.font/font/) 定义。 |
| [get_FileDefinitions](./get_filedefinitions/)() const | 获取文件定义集合。 |
| virtual [get_FontName](./get_fontname/)() | 返回 [Font](../../aspose.font/font/) 名称。 |
| virtual [get_FontNames](./get_fontnames/)() | 获取 [Font](../../aspose.font/font/) 名称作为 [MultiLanguageString](../../aspose.font/multilanguagestring/)。 |
| [get_FontType](./get_fonttype/)() const | 获取 [Font](../../aspose.font/font/) 类型。 |
| virtual [get_PostscriptName](./get_postscriptname/)() | 获取 PostScript [Font](../../aspose.font/font/) 名称。 |
| [get_PostscriptNames](./get_postscriptnames/)() const | 获取 PostScript [Font](../../aspose.font/font/) 名称作为 [MultiLanguageString](../../aspose.font/multilanguagestring/)。 |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | 返回针对字体文件和字体类型的 [FontDefinition](./)。 |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | 返回针对字体流源和字体类型的 [FontDefinition](./)。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
