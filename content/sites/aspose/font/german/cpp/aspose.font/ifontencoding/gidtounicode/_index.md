---
title: "Aspose::Font::IFontEncoding::GidToUnicode method"
linktitle: "GidToUnicode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontEncoding::GidToUnicode method. Dekodiert Gid zu Unicode. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: Type1''s ID ist ein Glyph‑Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 400
url: /de/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


Dekodiert Gid zu Unicode. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s ID ist ein Glyph‑Name, Instanz der Klasse ([GlyphStringId](../)). TTF's ID ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-Bezeichner des zu dekodierenden Symbols. |

### ReturnValue

Unicode-Wert, der zur übergebenen Glyph-ID gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
