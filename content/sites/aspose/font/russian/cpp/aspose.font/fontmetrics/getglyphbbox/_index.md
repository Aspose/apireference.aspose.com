---
title: "Aspose::Font::FontMetrics::GetGlyphBBox метод"
linktitle: "GetGlyphBBox"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::FontMetrics::GetGlyphBBox метод. Возвращает BBox глифа. Возвращает FontBBox, если BBox не был определён для глифа. Может быть переопределён наследниками конкретного кодирования шрифта в C++."
type: docs
weight: 1300
url: /ru/cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


Возвращает BBox глифа. Возвращает [FontBBox](../../fontbbox/) если BBox не был определён для глифа. Может быть переопределён наследниками конкретного кодирования шрифта.

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа. |

### ReturnValue

BBox глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
