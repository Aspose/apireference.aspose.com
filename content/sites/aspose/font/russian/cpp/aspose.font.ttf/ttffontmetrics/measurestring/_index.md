---
title: "Aspose::Font::Ttf::TtfFontMetrics::MeasureString метод"
linktitle: "MeasureString"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfFontMetrics::MeasureString метод. Измеряет текст, представленный массивом кодов символов, и возвращает ширину строки в C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.font.ttf/ttffontmetrics/measurestring/
---
## TtfFontMetrics::MeasureString(System::ArrayPtr\<uint32_t\>, double) method


Измеряет текст, представленный массивом кодов символов, и возвращает ширину строки.

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::ArrayPtr<uint32_t> charCodes, double fontSize)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charCodes | System::ArrayPtr\<uint32_t\> | Текстовая строка, представленная массивом кодов символов. |
| fontSize | double | [Font](../../../aspose.font/font/) размер. |

### ReturnValue

Ширина строки.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFontMetrics::MeasureString(System::String, double) method


Измеряет строку и возвращает её ширину.

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::String unicode, double fontSize) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | System::String | Unicode строка. |
| fontSize | double | [Font](../../../aspose.font/font/) размер. |

### ReturnValue

Ширина строки.

## См. также

* Class [String](../../../system/string/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
