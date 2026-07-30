---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById Methode"
linktitle: "GetGlyphById"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById Methode. Gibt ein Glyph anhand der glyph id zurück. Glyph id ist eine eindeutige Nummer für ein Glyph, das vom Font‑Typ abhängig ist. GlyphId – abgeleitetes Objekt. Zum Beispiel: Type1''s id ist ein Glyph‑Name, Instanz der Klasse (GlyphStringId). TTF''s id ist ein int‑Index, Instanz der Klasse (GlyphUInt32Id) in C++."
type: docs
weight: 300
url: /de/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


Gibt ein Glyph anhand der glyph id zurück. [Glyph](../../glyph/) id ist eine eindeutige Nummer für ein Glyph, das vom Font‑Typ abhängig ist. [GlyphId](../../glyphid/) – abgeleitetes Objekt. Zum Beispiel: [Type1](../../../aspose.font.type1/)'s id ist ein Glyph‑Name, Instanz der ([GlyphStringId](../../glyphstringid/)) Klasse. TTF's id ist ein int‑Index, Instanz der ([GlyphUInt32Id](../../glyphuint32id/)) Klasse.

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | System::SharedPtr\<GlyphId\> | glyph ID. |

### ReturnValue

[Glyph](../../glyph/)

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
