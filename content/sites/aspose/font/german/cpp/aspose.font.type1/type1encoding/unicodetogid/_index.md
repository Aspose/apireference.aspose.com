---
title: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid Methode"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid Methode. Gibt GlyphId für Unicode zurück. Oder notdef, wenn die Schrift kein Glyph für das Unicode enthält. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: Type1''s id ist ein Glyph-Name, Instanz der Klasse (GlyphStringId). TTF''s id ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 600
url: /de/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Gibt GlyphId für Unicode zurück. Oder notdef, wenn die Schrift kein Glyph für das Unicode enthält. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Schriftarttyp abhängt. Zum Beispiel: [Type1](../../)'s id ist ein Glyph-Name, Instanz der Klasse ([GlyphStringId](../)). TTF's id ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | uint32_t | Unicode, um den Glyph-Bezeichner zu erhalten. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Unicode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
