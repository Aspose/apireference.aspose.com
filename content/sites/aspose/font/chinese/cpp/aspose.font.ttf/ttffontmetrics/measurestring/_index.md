---
title: "Aspose::Font::Ttf::TtfFontMetrics::MeasureString method"
linktitle: "MeasureString"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFontMetrics::MeasureString method. 测量表示为字符代码数组的文本，并在 C++ 中返回字符串宽度。"
type: docs
weight: 1200
url: /zh/cpp/aspose.font.ttf/ttffontmetrics/measurestring/
---
## TtfFontMetrics::MeasureString(System::ArrayPtr\<uint32_t\>, double) method


测量以字符代码数组表示的文本并返回字符串宽度。

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::ArrayPtr<uint32_t> charCodes, double fontSize)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCodes | System::ArrayPtr\<uint32_t\> | 以字符代码数组表示的文本字符串。 |
| fontSize | double | [Font](../../../aspose.font/font/) 大小。 |

### ReturnValue

字符串宽度。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFontMetrics::MeasureString(System::String, double) method


测量字符串并返回字符串宽度。

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::String unicode, double fontSize) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | System::String | Unicode 字符串。 |
| fontSize | double | [Font](../../../aspose.font/font/) 大小。 |

### ReturnValue

字符串宽度。

## 另见

* Class [String](../../../system/string/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
