---
title: "Aspose::Font::FontMetrics::GetGlyphBBox metodo"
linktitle: "GetGlyphBBox"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::FontMetrics::GetGlyphBBox metodo. Restituisce il BBox del glifo. Restituisce FontBBox se il BBox non era definito per il glifo. Può essere sovrascritto da eredi di codifica del font specifici in C++."
type: docs
weight: 1300
url: /it/cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


Restituisce il BBox del glifo. Restituisce [FontBBox](../../fontbbox/) se il BBox non era definito per il glifo. Può essere sovrascritto da eredi di codifica del font specifici.

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Identificatore del glifo. |

### ReturnValue

BBox del glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
