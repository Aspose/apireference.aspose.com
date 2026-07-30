---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode 方法"
linktitle: "解码"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode 方法。解码摩尔斯电码并在 C++ 中以 PNG 格式绘制结果。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


解码摩尔斯电码并以 PNG 格式绘制结果。

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | System::String | 摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与已解码文本相关的字形 |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int32_t | 行间距的值 |
| maxWidth | int32_t | 图像的最大宽度（像素） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔编码文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔解码文本中单词的符号 |

### ReturnValue

已解码的文本以 PNG 格式的字节流形式呈现

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


将摩尔斯电码解码为指定字体的字形。

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | System::String | 摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与已解码文本相关的字形 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔编码文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔解码文本中单词的符号 |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
