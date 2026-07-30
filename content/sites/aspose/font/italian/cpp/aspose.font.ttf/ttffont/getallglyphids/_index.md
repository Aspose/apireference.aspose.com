---
title: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds metodo"
linktitle: "GetAllGlyphIds"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds metodo. Restituisce un array di tutti gli ID glifo, disponibili nel Font. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del Font TTF può essere un'istanza della classe (GlyphStringId) o della classe (GlyphUInt32Id). L'indirizzamento dei glifi per nome (stringa) è supportato per i Font TTF tramite la mappatura della tabella Post. Nel caso di un Font CFF interno, le strutture CFF sono utilizzate per indirizzare i glifi per nome in C++."
type: docs
weight: 1700
url: /it/cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


Restituisce un array di tutti gli ID glifo, disponibili nel [Font](../../../aspose.font/font/). L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. L'ID glifo del [Font](../../../aspose.font/font/) TTF può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). L'indirizzamento dei glifi per nome (stringa) è supportato per i Font TTF tramite la mappatura della tabella Post. Nel caso di un [Font](../../../aspose.font/font/) CFF interno, le strutture CFF sono utilizzate per indirizzare i glifi per nome.

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

Identificatori dei glifi.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
