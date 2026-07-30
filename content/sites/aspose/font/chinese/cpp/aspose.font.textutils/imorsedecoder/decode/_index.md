---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode 方法"
linktitle: "解码"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode 方法。 在 C++ 中解码摩尔斯电码。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


解码摩尔斯电码。

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | System::String | 摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔编码文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔解码文本中单词的符号 |

### ReturnValue

解码后的文本

## 另见

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
