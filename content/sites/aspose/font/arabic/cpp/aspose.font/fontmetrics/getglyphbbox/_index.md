---
title: "طريقة Aspose::Font::FontMetrics::GetGlyphBBox"
linktitle: "GetGlyphBBox"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::FontMetrics::GetGlyphBBox. تُرجع BBox للحرف. تُرجع FontBBox إذا لم يُحدد BBox للحرف. قد يتم تجاوزها بواسطة الوراثة الخاصة بترميز الخط المحدد في C++."
type: docs
weight: 1300
url: /ar/cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


تُرجع BBox للحرف. تُرجع [FontBBox](../../fontbbox/) إذا لم يُحدد BBox للحرف. قد يتم تجاوزها بواسطة الوراثة الخاصة بترميز الخط المحدد.

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | معرف الحرف. |

### ReturnValue

BBox الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
