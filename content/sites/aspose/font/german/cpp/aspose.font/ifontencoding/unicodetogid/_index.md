---
title: "Aspose::Font::IFontEncoding::UnicodeToGid method"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontEncoding::UnicodeToGid method. Dekodiert ein Unicode und gibt die Glyph‑ID zurück. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: Type1''s ID ist ein Glyph‑Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /de/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Dekodiert ein Unicode und gibt die Glyph‑ID zurück. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s ID ist ein Glyph‑Name, Instanz der Klasse ([GlyphStringId](../)). TTF's ID ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | uint32_t | Unicode, um den Glyph-Bezeichner zu erhalten. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Unicode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
