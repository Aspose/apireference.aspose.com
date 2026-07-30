---
title: "طريقة Aspose::Font::FontMetrics::GetKerningValue"
linktitle: "GetKerningValue"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::FontMetrics::GetKerningValue. يرجع قيمة kerning للزوج glyph في C++."
type: docs
weight: 1500
url: /ar/cpp/aspose.font/fontmetrics/getkerningvalue/
---
## FontMetrics::GetKerningValue method


يرجع قيمة التباعد بين الشكلين.

```cpp
double Aspose::Font::FontMetrics::GetKerningValue(System::SharedPtr<Glyphs::GlyphId> prevGlyphId, System::SharedPtr<Glyphs::GlyphId> nextGlyphId) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prevGlyphId | System::SharedPtr\<Glyphs::GlyphId\> | الرمز الأول في الزوج. |
| nextGlyphId | System::SharedPtr\<Glyphs::GlyphId\> | حجم [Font](../../font/). |

### ReturnValue

قيمة kerning.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
