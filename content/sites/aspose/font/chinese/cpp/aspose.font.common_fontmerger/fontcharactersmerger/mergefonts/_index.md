---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts 方法"
linktitle: "MergeFonts"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts 方法。根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到 C++ 中生成的新字体中。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到生成的新字体中。

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | 要从主字体中获取的字形列表 |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | 要从次要字体中获取的字形列表 |
| newFontName | System::String | 生成字体的期望名称 |

### ReturnValue

合并后的字体

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


根据传入的字符代码列表合并字体。要创建期望的生成字体，只需传入希望包含在生成字体中的原始字体的符号代码。与传入代码相关的 [Glyphs](../../../aspose.font.glyphs/) 将自动找到。例如，如果您想在生成字体中包含来自第一字体的字母 A 和 B 对应的字形，以及来自第二字体的字母 C 和 D 对应的字形，只需这样调用此方法：**MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | 要从主字体中获取的代码 |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | 要从次要字体中获取的代码 |
| newFontName | System::String | 生成字体的期望名称 |

### ReturnValue

合并后的字体

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


此方法版本旨在需要显式为结果字体中的字形设置字符代码的情况。并不要求您提供的字形代码必须包含在原始字体中。传入的代码的意义在于它将与结果字体中相应的字形标识符关联。因此，处理字典参数[code, glyph identifier]中每一对的规则是，仅从原始字体中获取字形标识符，然后将其与结果字体中的相应代码链接。当第一种字体的某些代码与第二种字体的相同代码冲突时，这会很有帮助。

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | 来自主字体的 [symbol code, glyph identifier] 字典 |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | 来自次要字体的 [symbol code, glyph identifier] 字典 |
| newFontName | System::String | 生成字体的期望名称 |

### ReturnValue

合并后的字体

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
