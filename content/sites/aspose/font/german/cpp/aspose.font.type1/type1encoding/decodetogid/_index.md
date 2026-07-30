---
title: "Aspose::Font::Type1::Type1Encoding::DecodeToGid Methode"
linktitle: "DecodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Type1::Type1Encoding::DecodeToGid Methode. Dekodiert Gid zu Unicode. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: Type1''s id ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s id ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Dekodiert Gid zu Unicode. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: [Type1](../../)'s id ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../)). TTF's id ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charCode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Zeichencode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
