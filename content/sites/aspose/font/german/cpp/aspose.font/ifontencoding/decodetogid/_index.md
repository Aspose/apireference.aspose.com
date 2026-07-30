---
title: "Aspose::Font::IFontEncoding::DecodeToGid method"
linktitle: "DecodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontEncoding::DecodeToGid method. Dekodiert einen Zeichencode und gibt die Glyph‑ID zurück. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: Type1''s ID ist ein Glyph‑Name, Instanz der Klasse (GlyphStringId). TTF''s ID ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id). Hinweis: Der Zeichencode ist nicht unbedingt ein Unicode. Der Zeichencode ist ein Zeichen‑Index in der Font‑Kodierung \\\"table\\\" in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Dekodiert einen Zeichencode und gibt die Glyph‑ID zurück. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängig ist. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s ID ist ein Glyph‑Name, Instanz der Klasse ([GlyphStringId](../)). TTF's ID ist ein int‑Index, Instanz der Klasse ([GlyphUInt32Id](../)). Hinweis: Der Zeichencode ist nicht unbedingt ein Unicode. Der Zeichencode ist ein Zeichen‑Index in der [Font](../../font/) Kodierung \"table\".

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charCode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph‑Bezeichner, der dem übergebenen charCode zugeordnet ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
