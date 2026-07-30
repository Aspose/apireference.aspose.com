---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger 类"
linktitle: "FontCharactersMerger"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger 类。声明了合并不同类型字体的功能。合并操作需要一对字体。该对中的一个字体被视为主字体。这意味着许多与最终合并字体相关的特性，如度量、编码结构等，都将取自该主字体。另一种字体（次要）仅在 C++ 中为最终合并字体提供字形。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class


声明了合并不同类型字体的功能。合并操作需要一对字体。该对中的一个字体被视为主字体。这意味着许多与最终合并字体相关的特性，如度量、编码结构等，都将取自该主字体。另一种字体（次要）仅为最终合并字体提供字形。

```cpp
class FontCharactersMerger : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_PrimaryFont](./get_primaryfont/)() | 获取主字体。 |
| virtual [get_SecondaryFont](./get_secondaryfont/)() | 获取次要字体。 |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | 根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到生成的新字体中。 |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | 根据传入的字符代码列表合并字体。要创建所需的结果字体，只需传入希望包含到结果字体中的原始字体的符号代码。与传入代码相关的[字形](../../aspose.font.glyphs/)将自动找到。例如，如果您想在结果字体中包含来自第一种字体的字母 A 和 B 对应的字形，以及来自第二种字体的字母 C 和 D 对应的字形，只需这样调用此方法：**MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | 此方法版本旨在需要显式为结果字体中的字形设置字符代码的情况。并不要求您提供的字形代码必须包含在原始字体中。传入的代码的意义在于它将与结果字体中相应的字形标识符关联。因此，处理字典参数[code, glyph identifier]中每一对的规则是，仅从原始字体中获取字形标识符，然后将其与结果字体中的相应代码链接。当第一种字体的某些代码与第二种字体的相同代码冲突时，这会很有帮助。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Common_FontMerger](../)
* Library [Aspose.Font for C++](../../)
