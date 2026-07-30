---
title: "Aspose::Font::TextUtils::IFontMorseEncoder class"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder 类。声明在 C++ 中通过摩尔斯电码对文本进行编码并获取字体字形结果的功能。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


声明通过莫尔斯电码对文本进行编码并将结果作为字体字形获取的功能。

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | 通过摩尔斯电码对文本进行编码，并将结果返回为字形集合（字形标识符）。 |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | 以摩尔斯电码对文本进行编码，并将结果返回为字形集合（glyphId）。使用启发式分析来计算输入文本的字母表。 |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | 通过摩尔斯电码对文本进行编码，并以 PNG 格式绘制结果。 |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | 以摩尔斯电码对文本进行编码，并以 PNG 格式绘制结果。使用启发式分析来计算输入文本的字母表。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
