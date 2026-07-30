---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode Methode"
linktitle: "GidToUnicode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode-Methode. Dekodiert Glyph-ID zu Unicode. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: Type1''s ID ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int-Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 400
url: /de/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Dekodiert Glyph-ID zu Unicode. Eine Glyph-ID ist eine eindeutige Nummer für ein Glyph, die vom Schriftarttyp abhängt. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s ID ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../)). TTF's ID ist ein int-Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-Bezeichner des zu dekodierenden Symbols. |

### ReturnValue

Unicode-Wert, der zur übergebenen Glyph-ID gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
