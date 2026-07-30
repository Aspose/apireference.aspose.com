---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode 方法"
linktitle: "Encode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode 方法。 使用摩尔斯电码对文本进行编码。 启发式分析用于计算输入文本的字母表。 字母表由 C++ 中的第一个单词决定。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


通过摩尔斯电码对文本进行编码。使用启发式分析来计算输入文本的字母表。字母表由第一个单词选择。

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

已编码的文本，例如输入文本 "SOS" 对应的 "... --- ..."

## 另见

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


通过摩尔斯电码编码文本。

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | System::String | 要通过摩尔斯电码编码的文本 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | char16_t | 用于分隔输入文本中单词的符号 |
| outputSeparator | char16_t | 用于分隔编码文本中单词的符号 |

### ReturnValue

已编码的文本，例如输入文本 "SOS" 对应的 "... --- ..."

## 另见

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
