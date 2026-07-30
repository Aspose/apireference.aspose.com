---
title: "Aspose::Font::Type1::Type1Encoding::GidToUnicode Methode"
linktitle: "GidToUnicode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Type1::Type1Encoding::GidToUnicode Methode. Dekodiert Gid zu Unicode. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: Type1''s id ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s id ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /de/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Dekodiert Gid zu Unicode. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: [Type1](../../)'s id ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../)). TTF's id ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-Bezeichner des zu dekodierenden Symbols. |

### ReturnValue

Unicode-Wert, der zur übergebenen Glyph-ID gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
