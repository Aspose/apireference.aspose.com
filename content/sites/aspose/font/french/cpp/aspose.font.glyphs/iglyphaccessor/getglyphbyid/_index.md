---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById méthode"
linktitle: "ObtenirGlyphParId"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById méthode. Retourne le glyphe par identifiant de glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. GlyphId - objet dérivé. Par exemple : l'identifiant de Type1'' est un nom de glyphe, instance de la classe (GlyphStringId). L'identifiant de TTF'' est un indice entier, instance de la classe (GlyphUInt32Id) en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


Retourne le glyphe par identifiant de glyphe. L'identifiant [Glyph](../../glyph/) est un nombre unique pour un glyphe, dépendant du type de police. [GlyphId](../../glyphid/) - objet dérivé. Par exemple : l'identifiant de [Type1](../../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../../glyphstringid/)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../../glyphuint32id/)).

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<GlyphId\> | identifiant de glyphe. |

### ReturnValue

[Glyph](../../glyph/)

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
