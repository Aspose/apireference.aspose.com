---
title: "Aspose::Font::Glyphs::IGlyphAccessor classe"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor classe. Definisce la funzionalità per recuperare gli identificatori di glifo specificati e i glifi in C++."
type: docs
weight: 1000
url: /it/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Definisce la funzionalità per recuperare gli identificatori di glifo specificati e i glifi.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) specifica del tipo di ID. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Restituisce tutti gli ID dei glifi, disponibili nel [Font](../../aspose.font/font/). L'ID del [Glyph](../glyph/) è un numero univoco per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../glyphstringid/)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Restituisce il glifo per ID glifo. L'ID del [Glyph](../glyph/) è un numero univoco per un glifo, dipendente dal tipo di font. [GlyphId](../glyphid/) - oggetto derivato. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../glyphstringid/)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Ottieni la rappresentazione dei glifi per il testo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
