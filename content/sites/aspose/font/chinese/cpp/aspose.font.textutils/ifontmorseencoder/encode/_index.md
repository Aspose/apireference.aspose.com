---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode 方法"
linktitle: "Encode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode 方法。将文本编码为摩尔斯电码，并将结果作为字形集合（glyphId）返回。使用启发式分析在 C++ 中计算输入文本的字母表。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


以摩尔斯电码对文本进行编码，并将结果返回为字形集合（glyphId）。使用启发式分析来计算输入文本的字母表。

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与点和划符号相关的字形 |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


以摩尔斯电码对文本进行编码，并以 PNG 格式绘制结果。使用启发式分析来计算输入文本的字母表。

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与点和划符号相关的字形 |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int32_t | 行间距的值 |
| maxWidth | int32_t | 图像的最大宽度（像素） |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

以 PNG 格式的字节流形式呈现的摩尔斯电码编码文本

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


通过摩尔斯电码对文本进行编码，并以 PNG 格式绘制结果。

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与点和划符号相关的字形 |
| fontSize | double | [字体](../../../aspose.font/font/) 大小 |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | int32_t | 行间距的值 |
| maxWidth | int32_t | 图像的最大宽度（像素） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

以 PNG 格式的字节流形式呈现的摩尔斯电码编码文本

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


通过摩尔斯电码对文本进行编码，并将结果返回为字形集合（字形标识符）。

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) 用于获取与点和划符号相关的字形 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
