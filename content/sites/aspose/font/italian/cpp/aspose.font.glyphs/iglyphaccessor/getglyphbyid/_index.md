---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById metodo"
linktitle: "GetGlyphById"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById metodo. Restituisce il glifo tramite l'ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. GlyphId - oggetto derivato. Per esempio: Type1''s id è un nome di glifo, istanza della classe (GlyphStringId). TTF''s id è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


Restituisce il glifo tramite l'ID del glifo. L'ID del [Glyph](../../glyph/) è un numero unico per un glifo, dipendente dal tipo di font. [GlyphId](../../glyphid/) - oggetto derivato. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../../glyphstringid/)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../../glyphuint32id/)).

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | System::SharedPtr\<GlyphId\> | ID del glifo. |

### ReturnValue

[Glyph](../../glyph/)

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
