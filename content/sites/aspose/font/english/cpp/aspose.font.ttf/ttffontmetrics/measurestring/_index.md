---
title: Aspose::Font::Ttf::TtfFontMetrics::MeasureString method
linktitle: MeasureString
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfFontMetrics::MeasureString method. Measures text represented as array of character codes and returns string width in C++.'
type: docs
weight: 1200
url: /cpp/aspose.font.ttf/ttffontmetrics/measurestring/
---
## TtfFontMetrics::MeasureString(System::ArrayPtr\<uint32_t\>, double) method


Measures text represented as array of character codes and returns string width.

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::ArrayPtr<uint32_t> charCodes, double fontSize)
```


| Parameter | Type | Description |
| --- | --- | --- |
| charCodes | System::ArrayPtr\<uint32_t\> | Text string represented as array of character codes. |
| fontSize | double | [Font](../../../aspose.font/font/) size. |

### ReturnValue

String width.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFontMetrics::MeasureString(System::String, double) method


Sets glyph width.

```cpp
double Aspose::Font::Ttf::TtfFontMetrics::MeasureString(System::String unicode, double fontSize) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | System::String | Glyph identifier. |
| value | double | New width |

### ReturnValue

String width.
## Remarks



Measures string and returns string width.

## See Also

* Class [String](../../../system/string/)
* Class [TtfFontMetrics](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
