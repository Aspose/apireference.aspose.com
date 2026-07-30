---
title: "Aspose::Font::Glyphs::GlyphId classe"
linktitle: "GlyphId"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Glyphs::GlyphId classe. Rappresenta gli ID dei glifi, disponibili nel Font. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di Type1''s è un nome di glifo, istanza della classe (GlyphStringId). L'ID di TTF''s è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Rappresenta gli ID dei glifi, disponibili nel [Font](../../aspose.font/font/). L'ID del [Glyph](../glyph/) è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../../aspose.font.type1/)'s è un nome di glifo, istanza della classe ([GlyphStringId](../glyphstringid/)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../glyphuint32id/)).

```cpp
class GlyphId : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Restituisce true se due ID di glifo non sono uguali. |
| virtual [GetHashCode](./gethashcode/)() const | Restituisce l'hashcode dell'oggetto. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Cast virtuale a [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) sovrascrive per restituire l'istanza. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Cast virtuale a [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) sovrascrive per restituire l'istanza. |
| virtual [ToString](./tostring/)() const | Restituisce la rappresentazione stringa dell'ID del glifo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
